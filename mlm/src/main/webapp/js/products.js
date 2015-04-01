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
 	    	url: basePath+'/product',        	
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
 						+"		<h3>"+item.itemCode+"</h3>"
 						+"		<p>"+item.productName+"</p>"
 						+"		<p>"+item.description+"</p>"
 						+"		<p>"+item.number+"</p>"
 						+"		<p>Reatil "+item.retailPrice+"$ / Assoc "+item.wholeSalePrice+"$ / "+item.businessVolume+"BV</p>"
 						+"		<p>"
						+"			Quantity:<input type='number' name='quantity' min='1' max='999' value='1'> " +
						+"			<a href='"+basePath+"/cart?memberid="+ +"' class='btn btn-danger'>" +
						+"				<span class='glyphicon glyphicon-shopping-cart'></span>Add to Cart" +
						+"			</a>"
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
 		alert("111");
		if($(e.target).is('.addtocart_btn')){
			addProducts2Cart(e);
		}else{
			initData();
		}
		
	});
 	
 	function addProducts2Cart(e){
 		alert("is here!");
 	}
});

