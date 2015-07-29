/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value"); 	
 	var userInfo_userId=$('#get_userInfo').attr("data-userid");
 	var userInfo_userName=$('#get_userInfo').attr("data-username");

	//queryUserPaymentMethodInfo();
 	queryUserShippingAddressInfo();
	//queryShippingMethodInfo();
	queryOrderSummaryInfo();
 	
 	function queryUserPaymentMethodInfo(){
 	 	//send requrest to server.
 	    $.ajax({
			url: basePath + 'userPaymentMethod',
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
 	    		queryUserPaymentMethodInfoResponse(res);
 	    			}
 	    });   		
 	}
 	
 	function queryUserPaymentMethodInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#orderPaymentSection').html("");	 			
 			if(res.orderPaymentInfo && res.orderPaymentInfo.length>0){
 				$.each(res.orderPaymentInfo,function(i, item){ 					
 					$('#orderPaymentSection').append(
 						"<div class='form-group'>"										
						+"	<div class='col-sm-2'>"
						+"		<label class='radio-inline'><input type='radio' name='optionspaytype' value='"+item.paymentMethodId+"' >"+item.name+"</label>" 	
						+"	</div>"
						+"</div>"	 													
 					);
 					//payment method is credit card
 					if( item.paymentMethodId == 1 ){
 	 					$('#orderPaymentSection').append(
								"<div class='col-sm-4'>"																													
								+"	<select class='form-control c_cardlist'>"
								+"	<option>No any item</option>"
								+"	</select>"
								+"</div>" 	 							 													
 	 	 				); 	
 	 					if(res.orderPaymentInfo.cardInfo && res.orderPaymentInfo.cardInfo.length>0){
 	 						$('.c_cardlist').html("");	
	 	 					$.each(res.orderPaymentInfo.cardInfo,function(j, cardInfo){
	 	 	 					$('.c_cardlist').append("<option value='"+cardInfo.paymentid+">"+cardInfo.bankname+" - "+cardInfo.cartno+"</option>"); 	 						
	 	 					});
 	 					}
 					}
 				});
 				
 				$('.p_userid').html(userInfo_userId);
 				
 			}else{
 				$("<div>No payment method info.</div>").insertAfter('#orderPaymentSection');
 			}
 		}else{
 			alert("Sorry, loading user payment method info failed! Try again, please. ");
 		}		
 	}
 	
 	function queryUserShippingAddressInfo(){
 	 	//send requrest to server.
 	    $.ajax({
			url: basePath + 'user/address',
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
 	    		queryUserShippingAddressInfoResponse(res);
 	    			}
 	    });   		
 	}
 	
 	function queryUserShippingAddressInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#shippingAddressList').html("");	 			
 			if(res.shippingAddress && res.shippingAddress.length>0){
 				var isChecked = "";
 				var name = "";
 				$.each(res.shippingAddress,function(i, item){ 
 					if(i==0){
 						isChecked = "checked";
 					}else{
 						isChecked = "";
 					}
					//if(item.firstname && item.firstname!=""){
					if (item.name != "") {
						//name = item.firstname + " " +item.lastname;
						name = item.name;
 					}else{
 						name = item.companyname;
 					}
 					
 					$('#shippingAddressList').append(
						"<tr>"
						+ "	<td><input type='radio' name='shippingAddress' value='' " + isChecked + "></td>"
				        +"	<td>"+name+"</td>"
				        +"	<td>"+item.address+"</td>"
				        +"	<td>"+item.city+"</td>"
				        +"	<td>"+item.province+"</td>"
				        +"	<td>"+item.country+"</td>"
				        +"	<td>"+item.zip+"</td>"
				        +"	<td>"+item.phone+"</td>"
						+"</tr>"	 							 													
 					);
 				}); 				 			
 			}else{
 				$("<div>No shipping address info.</div>").insertAfter('#shippingAddressList');
 			}
 		}else{
 			alert("Sorry, loading user shipping address info failed! Try again, please. ");
 		}		
 	} 	
 	 	
 	function queryShippingMethodInfo(){
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/shippingMethod',        	
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
 	    		queryShippingMethodInfoResponse(res);
 	    			}
 	    });   		
 	}
 	
 	function queryShippingMethodInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#selectshipmethod').html("");	 			
 			if(res.shippingMethod && res.shippingMethod.length>0){
 				$.each(res.shippingMethod,function(i, item){ 				 				 						
 					$('#selectshipmethod').append(
 						"<option value='"+item.id+"' "+isSelected+">$"+item.fee+" - "+name+"</option>"										 													
 					); 				
 				}); 				
 			}
 		}else{
 			alert("Sorry, loading shipping method failed! Try again, please. ");
 		}		
 	}
 	 	
 	function queryOrderSummaryInfo(){
 	 	//send requrest to server.
 	    $.ajax({
			url: basePath + 'order/orderSummary/' + $('#orderId').val(),
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
 	    		queryOrderSummaryInfoResponse(res);
 	    			}
 	    });   		
 	}
 	
 	function queryOrderSummaryInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message

		if (result == "success") {
			$('#ordersummary_subordertotal').html(res.subTotal);
 			$('#ordersummary_shippingfee').html();
			$('#ordersummary_tax').html(res.tax);
			$('#ordersummary_ordertotal').html(res.total);
 		}		
 	} 	
 	
 	$('#userTotalOrderForm').submit(function(){
		$.post(basePath + 'orderdetail/process/' + $('#orderId').val(), $(this).serialize(), function (res) {
			processOrderResponse(res);        				
		}).fail(function(xhr, ajaxOptions, thrownError) {             	
			// just in case posting your form failed
			alert(xhr.status+"\n"+xhr.responseText);
			alert("Send process order request failed.");			
		}); 
		return false;
 	});
 	
 	function processOrderResponse(res){
    	var result = res.result;			//response code
    	var message = res.message;			//response message
		//alert(message);
    	if (result != "success") {
    		if(message==null || message==""){
    			message = "Sorry, process your order request failed.";
    		}    			
    		alert(message);
		} else {
			console.log("message===" + message);

			//window.location(basePath+'products');
			window.location.href = basePath + "products";
		}
 	}
 	
 });


