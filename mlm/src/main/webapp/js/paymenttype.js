/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value"); 	
 	var userInfo_userId=$('#get_userInfo').attr("data-userid");
 	var userInfo_userName=$('#get_userInfo').attr("data-username");
 	
 	$('.p_userid').html(userInfo_userId);
 	
 	queryPaymentType();
 	queryUserPaymentTypeInfo();
 	
	$("#selectpaymenttype").change(function(){
		var selectValue=$("#selectpaymenttype").val();		
		if(selectValue == 1){
	        $("#addnewcreditcard").modal({
	            keyboard:false,
	            backdrop:"static"
	        });		
	        $("#selectpaymenttype").get(0).selectedIndex=0; 
		}else if(selectValue == 2){			
			;
		}			
	});
	
 	function queryPaymentType(){
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/paymentType',        	
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
 	    		queryPaymentTypeResponse(res);
 	    			}
 	    });   		
 	}
 	
 	function queryPaymentTypeResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		$('#selectpaymenttype').html("");
		$('#selectpaymenttype').append("<option selected value='0'>Please Choose...</option>"); 		
 		if (result == "success") { 		
 			if(res.paymentMethod && res.paymentMethod.length>0){
 				$.each(res.paymentMethod,function(i, item){ 					
 					$('#selectpaymenttype').append("<option value='"+item.id+"'>"+item.name+"</option>");
 				});
 			}
 		}else{
 			alert("Sorry, loading user payment method info failed! Try again, please. ");
 		}		
 	}
 	
 	function queryUserPaymentTypeInfo(){
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/userPaymentType',        	
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
 	    		queryUserPaymentTypeInfoResponse(res);
 	    			}
 	    });   		
 		
 	}
 	
 	function queryUserPaymentTypeInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#main_box').html("");
 			var htmlstr = "";
 			if(res.userPaymentTypeInfos && res.userPaymentTypeInfos.length>0){
 				$.each(res.userPaymentTypeInfos,function(i, userPaymentTypeInfo){
 					getUserPaymentTypeInfo(i, userPaymentTypeInfo, htmlstr);
 				}); 
 				
 				$('#main_box').append(htmlstr);
 			}else{
 				$("<div>No payment type info.</div>").insertAfter('#main_box');
 			}
 		}else{
 			alert("Sorry, loading user payment type info failed! Try again, please. ");
 		}		
 	} 	

 	function getUserPaymentTypeInfo(i, userPaymentTypeInfo, htmlstr){
 		var str = "";
 		var tmp = "";
 		var bankinfo="";
 		
 		if(userPaymentTypeInfo.bankinfo && userPaymentTypeInfo.bankinfo.length>0){
			$.each(userPaymentTypeInfo.bankinfo,function(i, item){
				 tmp = "<option value='"+item.id+"'>"+item.name+"</option>";
				 bankinfo += tmp;
			}); 				 			
		}else{
			bankinfo = "<option>No Item</option>";
		}
 		
 		str = "<div class='panel panel-danger'>"
		+"	<div class='panel-heading'>Payment Type: <strong>"+userPaymentTypeInfo.PaymentTypeName+"</strong></div>"
        +"	<div class='panel-body'>"
        +"		<form class='form-horizontal’ role='form' action='' method='post'>"
        +"			<div class='form-group'>"
        +"				<label for='firstname' class='col-sm-offset-1 col-sm-3 control-label'>First	Name:</label>"
        +"				<div class='col-sm-4'>"
		+"					<input type='text' class='form-control' id='firstname' value='"+userPaymentTypeInfo.firstname+"'>"
		+"				</div>"
		+"			</div>"
        +"			<div class='form-group'>"
		+"				<label for='lastname' class='col-sm-offset-1 col-sm-3 control-label'>Last Name:</label>"
		+"				<div class='col-sm-4'>"
		+"					<input type='text' class='form-control' id='lastname' value='"+userPaymentTypeInfo.lastname+"'>"
		+"				</div>"
		+"			</div>"
		+"			<div class='form-group'>"
		+"				<label for='cardno' class='col-sm-offset-1 col-sm-3 control-label'>Card number:</label>"
		+"				<div class='col-sm-4'>"
		+"					<input type='text' class='form-control' id='cardno' value='"+userPaymentTypeInfo.cardno+"'>"
		+"				</div>"
		+"			</div>"
		+"			<div class='form-group'>"
		+"				<label for='bankname' class='col-sm-offset-1 col-sm-3 control-label'>Bank Name:</label>"
		+"				<div class='col-sm-3'>"												
		+"					<select class='form-control'>"
		+bankinfo
		+"					</select>"
		+"				</div>"
		+"			</div>"	
		+"			<div class='form-group'>"
		+"				<label for='cscno' class='col-sm-offset-1 col-sm-3 control-label'>Card Security Code(CSC):</label>"
		+"				<div class='col-sm-4'>"
		+"					<input type='text' class='form-control' id='cscno' value='"+userPaymentTypeInfo.csc+"'>"
		+"				</div>"
		+"			</div>"
		+"		</form>"											
		+"	</div>"
		+"	<div class='panel-footer text-right'>"
		+"		<button type='submit' class='btn btn-success savepaymenttype'>Save</button>"	
		+"		<button type='button' data-paymentid='"+userPaymentTypeInfo.id+"' class='btn btn-danger delpaymenttype'>Delete</button>"																			
		+"	</div>"
		+"</div>";
 		
 		htmlstr += str;
 		
 		return htmlstr;
 	}
 	
 });


