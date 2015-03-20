/**
 * 
 */
$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	
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

        $.ajax({
        	url: basePath+'/doLogin',        	
        	type: 'POST',
        	data: {
        		memberid : $('#memberid').val(), 
        		password : $('#password').val()
        	},
        	success: function(responseText) {
				window.location.href(responseText);
        		//alert("success.");
        	},
        	error: function(xhr, ajaxOptions, thrownError){
/*        		$('#response').html(responseText); 
        		$('#response').show();*/
        		alert("error.");        		
        		alert(xhr.status);
                //alert(thrownError);
                $('#response').html(xhr.responseText);
                $('#response').show();
        	},
        	cache:false
        });   
     	
        return false;
    });        
});	