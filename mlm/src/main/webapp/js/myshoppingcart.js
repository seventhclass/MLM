/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value"); 	
 	$('#makeOrder_btn').attr("disabled",true);
 	queryShoppingCartInfo(); 	
 	queryMyShoppingCartSummary();
 	
 	$('.table tr').hover(function(e){
 		$('.close_item').show();
 	},function(){
 		$('.close_item').hide();
 	});
 	
 	$("input[type='number']").change(function(e){
 		var i_id = $(this).attr("data-id");
 		var i_productid = $(this).attr("data-productid");
 		var i_qty = $(this).val();
 		var i_price = $(this).attr("data-price");
 		
 		
/* 		alert("id="+i_id);
 		alert("qty="+i_qty);
 		alert("price="+i_price);
 		alert("sub="+i_subtotal);*/
 		updateShoppingCartItem(i_id,i_productid,i_qty);
 		 		
 	});
 	
 	$('#makeOrder_btn').click(function(){
 		makeOrder(); 		
 	});
 	
 	function makeOrder(){
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'order/makeOrder',
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
						//alert("zzz==="+res)
						console.log("res==="+res);
 	    				makeOrderResponse(res);
 	    			}
 	    });  		
 	}
 	
 	function makeOrderResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			window.location.href=basePath+"order/orderentry/"+res.orderId;
 		}else{
			alert("Sorry, make order failed! Try again, please. ");
 			window.location.href=basePath+"myshoppingcart";
 		}	
 	}


 	
 	//Query shopping cart information
 	function queryShoppingCartInfo(){
 		
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'shoppingcart',        	
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
 	    				queryShoppingCartInfoResponse(res);
 	    			}
 	    });    	
 	}

 	//Process query shopping cart information response 
 	function queryShoppingCartInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#shoppingCartList').html("");	
 			if(res.cartContentList && res.cartContentList.length>0){
 				$('#makeOrder_btn').attr("disabled",false);
 				$.each(res.cartContentList,function(i, item){
 					$('#shoppingCartList').append(
 						"<tr>"
 						+"	<td class='itemImage' rowspan='5'><img src='"+basePath+"images/products/"+item.imageName+"' style='height: 110px; width: 105px;' alt=''></td>"
 						+"	<td class='itemName'>Name:</td>"
 						+"	<td>"+item.name+"</td>"
 						+"	<td rowspan='5' style='width:30px'><span data-id='"+item.id+"' class='glyphicon glyphicon-remove-sign close_item' style='color:red'></span></td>"
 						+"</tr>"
					    +"<tr>"
					    +"	<td class='itemName'>Capsule Number:</td>"	
					    +"	<td>"+item.capsuleNumber+" Counts</td>"
 						+"</tr>"
 						+"<tr>"
 						+"	<td class='itemName'>Price Each:</td>"
 						+"	<td>$"+parseFloat(item.wholesalePrice).toFixed(2)+"</td>"
 						+"</tr>"
 						+"<tr>"
 						+"	<td class='itemName'>Quantity:</td>"
 						+"	<td><input class='numbers' type='number' name='numbers' data-productid='"+item.productId+"' data-id='"+item.id+"' data-price='"+item.wholesalePrice+"' min='1' max='9999' value='"+item.quantity+"'></td>"
 						+"</tr>"
					    +"<tr>"
				     	+"<td class='itemName'>Subtotal Amount:</td>"
				     	+"<td id='subtotal_id_"+item.id+"' class='subtotal_price'>$"+parseFloat(item.wholesalePrice*item.quantity).toFixed(2)+"</td>"
				     	+"</tr>" 						
 					);
 				});
 			}else{
 				$("<tr><td colspan='2'>No Any Items</td></tr>").insertAfter('#shoppingCartList');
 			}
 		}
 	} 	  	
 	
 	$('.close_item').click(function(e){ 
 		id = $(this).attr("data-id");
 		delShoppingCartItem(id);
	});
 	
 	function delShoppingCartItem(id){
 		var $id = id;
 		//alert("id="+id);
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'delcartitem',        	
 			cache:false,
 			async: false,
 			type:'POST',
 			data:{
				id: $id
 			},
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);
 		                //$('#content').html(xhr.responseText); 		               
 	    			},        	
 	    	success:	function(res) {
 	    		delShoppingCartItemResponse(res);
 	    			}
 	    });  		
 	}
 	
 	function delShoppingCartItemResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			window.location.href=basePath+"myshoppingcart";;
 		}else{
			alert("Sorry, delete item from shopping cart failed! Try again, please. ");
 			window.location.href=basePath+"myshoppingcart";;
 		}
 	}
 	
 	function updateShoppingCartItem(id,productid,qty){
 		//alert("id="+id);
 		//alert("productid="+productid);
 		//alert("qty="+qty);
 	 	//send requrest to server. ** add2cart has the same function with updatecart, so we use add2cart instead of updatecart.
 	    $.ajax({
 	    	url: basePath+'updateshoppingcart',        	
 			cache:false,
 			async: false,
 			type:'POST',
 			data: {
 				cartId: id,
 				productId:productid,
 				quantity: qty
 			},
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);
 		                //$('#content').html(xhr.responseText); 		               
 	    		},        	
 	    	success:	function(res) {
 	    		updateShoppingCartItemResponse(res);
 	    		}
 	    });   		
 	}
 	
 	function updateShoppingCartItemResponse(res){ 		
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		 		
 		//get quantity from server and set back to front-end page.
 		if (result == "success") {
 			$(this).val(res.quantity); 		
 		 	var i_subtotal = (res.quantity * res.price).toFixed(2); 		
 		 	$('#subtotal_id_'+res.id).html(i_subtotal+"$");
 			queryMyShoppingCartSummary();
 		}else{
			alert("Sorry, update item from shopping cart failed! Try again, please. ");
 			window.location.href=basePath+"myshoppingcart";
 		}
 		
 	}
 	
 	//Query my shopping cart summary information
 	function queryMyShoppingCartSummary(){
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'common/shoppingCartSummary',        	
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
 	    		queryMyShoppingCartSummaryResponse(res);
 	    			}
 	    });    	
 	}
 	
 	function queryMyShoppingCartSummaryResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#total_qty').html(res.cartSummary.totalQuantily);	
 			$('#total_amt').html(parseFloat(res.cartSummary.totalAmount).toFixed(2));
 		}
 	}
});

