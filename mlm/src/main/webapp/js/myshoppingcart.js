/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value"); 	
 	
 	queryShoppingCartInfo(); 	
 	 	
 	$('.table tr').hover(function(e){
 		$('.close_item').show();
 	},function(){
 		$('.close_item').hide();
 	});
 	
 	$("input[type='number']").change(function(e){
 		var i_id = $(this).attr("data-id");
 		var i_qty = $(this).val();
 		var i_price = $(this).attr("data-price");
 		
 		
/* 		alert("id="+i_id);
 		alert("qty="+i_qty);
 		alert("price="+i_price);
 		alert("sub="+i_subtotal);*/
 		updateShoppingCartItem(i_id,i_qty);
 		 		
 	});
 	
 	$('#makeOrder_btn').click(function(){
 		makeOrder(); 		
 	});
 	
 	function makeOrder(){
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'makeOrder',        	
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
 	    				makeOrderResponse(res);
 	    			}
 	    });  		
 	}
 	
 	function makeOrderResponse(){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			window.location.href=basePath+"orderentry";;
 		}else{
			alert("Sorry, make order failed! Try again, please. ");
 			window.location.href=basePath+"myshoppingcart";;
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
 			if(res.shoppingCartInfo && res.shoppingCartInfo.length>0){
 				$.each(res.shoppingCartInfo,function(i, item){
 					$('#shoppingCartList').append(
 						"<tr>"
 						+"	<td class='itemImage' rowspan='5'><img src='"+basePath+"/images/products/"+item.imageNname+"' style='height: 110px; width: 105px;' alt=''></td>"
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
 						+"	<td>"+item.price+"$</td>"
 						+"</tr>"
 						+"<tr>"
 						+"	<td class='itemName'>Quantity:</td>"
 						+"	<td><input class='numbers' type='number' name='numbers' min='1' max='9999' value='"+item.quantity+"'></td>"
 						+"</tr>"
					    +"<tr>"
				     	+"<td class='itemName'>Subtotal Price:</td>"
				     	+"<td class='subtotal_price'>"+(item.price*item.quantity)+"$</td>"
				     	+"</tr>" 						
 					);
 				});
 			}else{
 				$("<button class='btn btn-success' type='button'>No Any Category Item</button>").insertAfter('.categorybox');
 			}
 		}
 	} 	  	
 	
 	$('.close_item').click(function(e){ 
 		id = $(this).attr("data-id");
 		delShoppingCartItem(id);
	});
 	
 	function delShoppingCartItem(id){
 		var $id = id;
 		
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
 	
 	function updateShoppingCartItem(id,qty){
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'updateshoppingcart',        	
 			cache:false,
 			async: false,
 			type:'POST',
 			data: {
 				id: id,
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
 			$(this).val(res.shoppingCart.quantity); 		
 		 	var i_subtotal = (res.shoppingCart.quantity * res.shoppingCart.price).toFixed(2); 		
 		 	$('#subtotal_id_'+res.shoppingCart.id).html(i_subtotal+"$");
 		 	$('#total_qty').html(res.shoppingCart.totalQuantity);
 		 	$('#total_amt').html(res.shoppingCart.totalAmount);
 		}else{
			alert("Sorry, update item from shopping cart failed! Try again, please. ");
 			window.location.href=basePath+"myshoppingcart";
 		} 
 		
 	}
});

