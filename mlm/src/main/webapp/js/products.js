/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	 	
 	queryCategoryInfo();
 	
 	queryProductsInfo();   
 	
 	//Query category information
 	function queryCategoryInfo(){
 		
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/category',        	
 			cache:false,
 			async: false,
 			type:'POST',			
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);
 		                //$('#content').html(xhr.responseText); 		               
 	    			},        	
 	    	success:	function(res) {
 	    				queryCategoryInfoResponse(res);
 	    			}
 	    });    	
 	}

 	//Process query category information response 
 	function queryCategoryInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('.categorybox').html("");	
 			if(res.categoryinfo && res.categoryinfo.length>0){
 				$.each(res.categoryinfo,function(i, item){
 					$('.categorybox').append(
					    "<button id='btn_category_'"+item.categoryId+" class='btn btn-success' type='button'>"+item.categoryName+"</button>"
 					);
 				});
 			}else{
 				$("<button class='btn btn-success' type='button'>No Any Category Item</button>").insertAfter('.categorybox');
 			}
 		}
 	} 	 
 	
 	//Query products information
 	function queryProductsInfo(){
 		
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/productList',        	
 			cache:false,
 			async: false,
 			type:'POST',			
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);
 		                //$('#content').html(xhr.responseText); 		               
 	    			},        	
 	    	success:	function(res) {
 	    				queryProductInfoResponse(res);
 	    			}
 	    });    	
 	}

 	//Process query products information response 
 	function queryProductsInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#productslist').html("");	
 			if(res.productinfo && res.productinfo.length>0){
 				$.each(res.productinfo,function(i, item){
 					$('#productslist').append(
					    "<div class='col-xs-6 col-md-4'>"
 						+"	<a href='"+basePath+"/productDetail?id="+item.id+"' class='thumbnail'>"
 						+"		<img src='"+basePath+"/images/products/"+item.imgname+"' style='height: 200px; width: 150px; display: block;' alt=''>"
 						+"	</a>"
 						+"	<div class='caption'>"
 						+"		<h3 class='p_name'>"+item.productName+"</h3>"
 						+"		<p class='p_itemCode'>"+item.itemCode+"</p>"
 						+"		<p>Reatil&nbsp;<span class='p_rPrice'>"+item.retailPrice+"</span>$<span>&nbsp;&#47;&nbsp;</span>Assoc&nbsp;<span class='p_wPrice'>"+item.wholeSalePrice+"</span>$<span>&nbsp;&#47;&nbsp;</span><span class='p_BV'>"+item.businessVolume+"</span>BV</p>"
 						+"		<p><span class='p_numbers'>"+item.number+"</span>&nbsp;Counts</p>" 						
 						+"		<p>"
						+"			Quantity:<input class='p_quantity' type='number' name='quantity' min='1' max='999' value='1'> " +
						+"			<button type='button' class='btn btn-danger addtocart_btn'><spanclass='glyphicon glyphicon-shopping-cart'></span>&nbsp;Add to Cart</button>"
						+"		</p>"
			           	+"	</div>"
			           	+"</div>"
 					);
 				});
 			}else{
 				$("<p>No Any Product Item. </p>").insertAfter('#productslist');
 			}
 		}
 	}
 	
 	$('.caption').click(function(e){ 		
		if($(e.target).is('.addtocart_btn')){
			addProducts2Cart(e);
		}		
	});
 	
 	function addProducts2Cart(e){
 		
 		var $name = $(e.target).parents("div").children(".p_name").html();
 		var $itemCode = $(e.target).parents("div").children(".p_itemCode").html();
 		var $rPrice = $(e.target).parents("div").children().children(".p_rPrice").html();
 		var $wPrice = $(e.target).parents("div").children().children(".p_wPrice").html();
 		var $bVolume = $(e.target).parents("div").children().children(".p_BV").html();
 		var $numbers = $(e.target).parents("div").children().children(".p_numbers").html();
 		var $quantity = $(e.target).parents("div").children().children(".p_quantity").val(); 		
 		
		alert("name="+$name);	
		alert("itemcode="+$itemCode);
		alert("rprice="+$rPrice);
		alert("wprice="+$wPrice);
		alert("volume="+$bVolume);
		alert("numbers="+$numbers);
		alert("quantity="+$quantity);
		
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/add2cart',        	
 			cache:false,
 			async: false,
 			type:'POST',
 			data:{
 				name: $name,
 				itemCode: $itemCode,
 				rPrice: $rPrice,
 				wPrice: $wPrice,
 				bVolume: $bVolume,
 				numbers: $numbers,
 				quantity: $quantity
 			},
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);
 		                //$('#content').html(xhr.responseText); 		               
 	    			},        	
 	    	success:	function(res) {
 	    		addProducts2CartResponse(res);
 	    			}
 	    });  		
 	}
 	
 	function addProducts2CartResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 				;
 		}else{
 				alert("Sorry, adding products to shopping cart failed! Try again, please. ");
 		}
 	}
 	
});

