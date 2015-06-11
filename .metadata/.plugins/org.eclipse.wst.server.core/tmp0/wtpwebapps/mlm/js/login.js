/**
 * 
 */

var searchString = location.search.slice(1);
var formString = searchString.replace(/\+/g, " ");
var dataString = unescape(formString);
var data = dataString.split(/[&=]/g);

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	
 	if(data){
// 		alert(data[0]);
// 		alert(data[1]);
 		if(data[0]=="memberid"){
 			$('#memberid').val(data[1]);
 		}
 	}
 	
	$('#response').hide(); 
	
	$('#memberid').blur(function() {
        if ($(this).val() == "") {
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                $("#errmsg_mid").html("Member ID can not be empty.").css("color", "red");
                $('#memberid').focus();
        } else {
                $(this).css("border-color", "#999");
                $("#errmsg_mid").html("");
        }
        return true;
	});
	
	$('#password').blur(function() {
        if ($(this).val() == "") {
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                $("#errmsg_pas").html("Password can not be empty.").css("color", "red");
                $('#password').focus();
        } else {
                $(this).css("border-color", "#999");
                $("#errmsg_pas").html("");
        }
        return true;
	});	
	
    $('#loginForm').submit(function(){
    	
    	$('#response').hide(); 
    	$("#errmsg_mid").html("");
    	$("#errmsg_pas").html("");
    	
     	if($('#memberid').val() == ""){
     		$("#errmsg_mid").html("Member ID can not be empty.").css("color", "red");
     		$('#memberid').focus();
     		return false;
     	}
     	if($('#password').val() == ""){
     		$("#errmsg_pas").html("Password can not be empty.").css("color", "red");
     		$('#password').focus();
     		return false;
     	}
     	
     	$('#response').html("");
     	
/*        $.post('/doLogin', $(this).serialize(), function(data){
            // show the response        	
            $('#response').html(data);   
            $('#response').show();
        }).fail(function() {             	
            // just in case posting your form failed
            $('#response').html("Send login request failed.");
            $('#response').show(); 
        });*/

     	//Check if user has selected the "keep login" checkbox?
     	var autoFlag = null;
     	var radioVal = $("input[name='policycheck']:checked").val(); 
     	
     	if( radioVal=="on" ) {
     		autoFlag = 1;
     	}else{
     		autoFlag = 0;
     	}

     	//send login requrest to server.
        $.ajax({
        	url: basePath+'doLogin', 
			cache:false,
			async: false,
			type:'POST',			
        	data: {
        		memberid : $('#memberid').val(), 
        		password : $('#password').val(),
        		autoFlag : autoFlag
        	},
        	dataType:'json',
        	timeout:5000,
        	error:	function(xhr, ajaxOptions, thrownError){
        				alert(xhr.status+"\n"+xhr.responseText);
		                $('#response').html(xhr.resposeJsonObject);
		                $('#response').show();
        			},        	
        	success:	function(res) {         			
        				loginResponse(res);
        			}
        });   
     	
        return false;
    });  
    
    //Process user login response 
    function loginResponse(res){
    	var result = res.result;			//response code
    	var message = res.message;			//response message
//    	alert("result="+res.result);
//    	alert("message="+res.message);
    	if (result == "success") {
    		window.location.href=basePath+"home";
    	}else{
    		if(message==null || message==""){
    			message = "Sorry, your request is failed.";
    		}    			
    		$('#response').html(message);
            $('#response').show();
    	}    	
    }
});	