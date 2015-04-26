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
 	    	url: basePath+'common/category',        	
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
 			if(res.list && res.list.length>0){
 				$.each(res.list,function(i, item){
 					$('.categorybox').append(
					    "<button class='btn btn-success category_btn' data-categoryid='"+item.id+"' type='button'>"+item.name+"</button>"
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
 	    	url: basePath+'productList',        	
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
 	    		queryProductsInfoResponse(res);
 	    			}
 	    });    		
 	}

 	//Process query products information response 
 	function queryProductsInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#productslist').html("");	
 			if(res.productInfo && res.productInfo.length>0){
 				$.each(res.productInfo,function(i, item){
 					parseFloat
 					$('#productslist').append(
					    "<div class='col-xs-6 col-md-4'>"
 						+"	<a href='"+basePath+"productDetail?id="+item.id+"' class='thumbnail'>"
 						+"		<img src='"+basePath+"images/products/"+item.imgname+"' style='height: 200px; width: 150px; display: block;' alt=''>"
 						+"	</a>"
 						+"	<div class='caption'>"
 						+"		<h3 class='p_name'>"+item.name+"</h3>"
 						+"		<p class='p_itemCode'>"+item.itemCode+"</p>"
 						+"		<p>Reatil&nbsp;<span class='p_rPrice'>"+parseFloat(item.retailPrice).toFixed(2)+"</span>$<span>&nbsp;&#47;&nbsp;</span>Assoc&nbsp;<span class='p_wPrice'>"+parseFloat(item.wholesalePrice).toFixed(2)+"</span>$<span>&nbsp;&#47;&nbsp;</span><span class='p_BV'>"+item.volume+"</span>BV</p>"
 						+"		<p><span class='p_numbers'>"+item.capsuleNumber+"</span>&nbsp;Counts</p>" 						
 						+"		<p>"
						+"			Quantity:<input class='p_quantity' type='number' name='quantity' min='1' max='999' value='1'> " 
						+"			<button type='button' data-productid='"+item.id+"' class='btn btn-danger addtocart_btn'><span class='glyphicon glyphicon-shopping-cart'></span>&nbsp;Add to Cart</button>"
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
 	
 	$('.categorybox').click(function(e){
		if($(e.target).is('.category_btn')){
			queryProductsByCategoryId(e);
		}		
 		
 	});

 	//Query products information by category id
 	function queryProductsByCategoryId(e){
 		var categoryId = $(e.target).attr("data-categoryid");
 		//alert("categoryId="+categoryId);
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'productList',        	
 			cache:false,
 			async: false,
 			type:'POST',			
 			data: {
 				id: categoryId
 			},
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);
 		                //$('#content').html(xhr.responseText); 		               
 	    			},        	
 	    	success:	function(res) {
 	    		queryProductsInfoResponse(res);
 	    			}
 	    });    		
 	}

 	function addProducts2Cart(e){
 		var $id = $(e.target).attr("data-productid");
 		var $name = $(e.target).parents("div").children(".p_name").html();
 		var $itemCode = $(e.target).parents("div").children(".p_itemCode").html();
 		var $rPrice = $(e.target).parents("div").children().children(".p_rPrice").html();
 		var $wPrice = $(e.target).parents("div").children().children(".p_wPrice").html();
 		var $bVolume = $(e.target).parents("div").children().children(".p_BV").html();
 		var $numbers = $(e.target).parents("div").children().children(".p_numbers").html();
 		var $quantity = $(e.target).parents("div").children().children(".p_quantity").val(); 		
 		var $price;
		alert("id="+$id);	
		alert("name="+$name);	
		alert("itemcode="+$itemCode);
		alert("rprice="+$rPrice);
		alert("wprice="+$wPrice);
		alert("volume="+$bVolume);
		alert("numbers="+$numbers);
		alert("quantity="+$quantity);

		$price = $rPrice;

 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'add2cart',        	
 			cache:false,
 			async: false,
 			type:'POST',
 			data:{
 				productid: $id,
 				price: $price,
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
 			window.location.href=basePath+"cart";
 		}else{
 			alert("Sorry, adding products to shopping cart failed! Try again, please. ");
 		}
 	}
 	
});

