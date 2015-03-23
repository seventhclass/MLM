/**
 * 
 */
$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	
 	queryUserInfo();   

 	//Query user information
 	function queryUserInfo(){
 	 	//send login requrest to server.
 	    $.ajax({
 	    	url: basePath+'/user',        	
 			cache:false,
 			async: false,
 			type:'POST',			
 	    	data: {
 	    		memberid : $('#memberid').val()
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
 			alert("Success!!!");
 		}else{
 			if(message==null || message==""){
 				message = "Sorry, get member information failed.";
 			}    			
 			alert(message);
 		}    	
 	}

});

