$(document).ready(function(){
	var basePath=$('#basePath').attr("value");

	queryUserInfo();

 	//Query user information
 	function queryUserInfo(){
 		var id = $('#get_userInfo').attr('data-userid');
 	 	//send login requrest to server.
 	    $.ajax({
 	    	url: basePath+'/user',        	
 			cache:false,
 			async: false,
 			type:'POST',			
 	    	data: {
 	    		memberid : id
 	    	},
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+" "+xhr.responseText);
 	    			},        	
 	    	success:	function(res) {         			
 	    				queryUserInfoResponse(res);
 	    			}
 	    });    	
 	}

 	//Process query user information response 
 	function queryUserInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		if (result == "success") {
 			//res.object.companyName = "";
 			if( res.object.companyName != null && res.object.companyName != "" ){
 				$('#individual').hide();
 				$('#corporate').show();
 				$('#c_companyname').val(res.object.companyName);
 				if( res.object.companyType == 1 )
 				{
 					$('#c_companytype').val("Sole Proprietorship");
 				}else if(res.object.companyType == 2)
 				{
 					$('#c_companytype').val("Partnership");
 				}else if(res.object.companyType == 3)
 				{
 					$('#c_companytype').val("Corporation");
 				}else
 				{
 					$('#c_companytype').val("Cooperative");
 				}
 				$('#c_address').val(res.object.address);
 				$("#c_countryid").val(res.object.country);
 				$("#c_provinceid").val(res.object.province); 
 				$("#c_city").val(res.object.city);
 				$("#c_zip").val(res.object.zip); 				
 				$('#c_mobilephone').val(res.object.mobile);
 				$('#c_officephone').val(res.object.phone);  				
 				$('#c_email').val(res.object.email);				
 			}else{
 				$('#corporate').hide();
 				$('#individual').show();
 				$('#firstname').val(res.object.firstName);
 				$('#lastname').val(res.object.lastName); 				
 				if(res.object.gender == "M"){
 					jQuery("input[type='radio'][name='optionsgender'][value='Male']").attr("checked", "checked");
 				}else{
 					jQuery("input[type='radio'][name='optionsgender'][value='Female']").attr("checked", "checked");
 				}
 				$('#birthday').val(res.object.birthDate);
 				$('#ssn').val(res.object.ssn);
 				$('#address').val(res.object.address);
 				$("#countryid").val(res.object.country); 
 				$("#provinceid").val(res.object.province); 
 				$("#city").val(res.object.city);
 				$("#zip").val(res.object.zip);
 				$("#mobilephone").val(res.object.mobile);
 				$("#officephone").val(res.object.phone); 				
 				$('#email').val(res.object.email);
 			} 			
 		}else{
 			if(message==null || message==""){
 				message = "Sorry, get member information failed.";
 			}    			
 			alert(message);
 		}
 	}

});