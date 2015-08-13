/**
 * 
 */
$(document).ready(function(){
    var basePath=$('#basePath').attr("value");
    $('#response').hide();
	
	$('#password').blur(function() {
        if ($(this).val() == "") {
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                $("#errmsg_opass").html("Old password can not be empty.").css("color", "red");
                $('#password').focus();
        } else {
                $(this).css("border-color", "#999");
                $("#errmsg_opass").html("");
        }
        return true;
	});
	
	$('#newpassword1').blur(function() {
        if ($(this).val() == "") {
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                $("#errmsg_npass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password can not be empty.").css("color", "red");
                $('#newpassword1').focus();
        } else {
                $(this).css("border-color", "#999");
                $("#errmsg_npass").html("");
                //clear "confirm password" field and focus it.
                $('#newpassword2').val("");
                $('#newpassword2').focus();
        }
        return true;
	});		
	
	$('#newpassword2').blur(function() {
		//confirm password is empty.
        if ($(this).val() == "") {
    		$('#response').hide(); 
            $(this).css("border-color", "#FF0000");
            $("#errmsg_cpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Confirm password can not be empty.").css("color", "red");
            $('#newpassword2').focus();
        } else {  //confirm password has values
        	
            $(this).css("border-color", "#999");
            $("#errmsg_cpass").html("");
            
        	//password is empty at this moment.
        	if( $('#newpassword1').val()==null || $('#newpassword1').val()==""){
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                //set focus to password and waiting user input.
                $("#errmsg_npass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;New password can not be empty.").css("color", "red");
                $('#newpassword1').focus();          		
        	}else {	//password has values at this moment.
        		//check if the password equals confirm password ?
        		if($('#newpassword1').val() != $('#newpassword2').val()){
            		$('#response').hide(); 
                    $(this).css("border-color", "#FF0000");
                    $("#errmsg_cpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password inconsistency.").css("color", "red");
                    //$('#newpassword2').focus();        			
        		}
        	}
        }
        return true;
	});		
	
    $('#modifypassForm').submit(function(){
    	$('#response').hide(); 
    	$("#errmsg_opass").html("");
    	$("#errmsg_npass").html("");
    	$("#errmsg_cpass").html("");
    	
     	if($('#password').val() == ""){
     		$("#errmsg_opass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Old password can not be empty.").css("color", "red");
     		$('#password').focus();
     		return false;
     	}  
     	if($('#newpassword1').val() == ""){
     		$("#errmsg_npass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;New password can not be empty.").css("color", "red");
     		$('#newpassword1').focus();
     		return false;
     	}       	
     	if($('#newpassword2').val() == ""){
     		$("#errmsg_cpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Confirm password can not be empty.").css("color", "red");
     		$('#newpassword2').focus();
     		return false;
     	}      	
     	if( $('#newpassword1').val() != $('#newpassword2').val()){
     		$("#errmsg_cpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password inconsistency.").css("color", "red");
     		$('#newpassword2').focus();
     		return false;
     	}
     	
     	$('#response').html("");
     	
        $.post(basePath+'updatePwd', $(this).serialize(), function(data){
            // show the response        	
            $('#response').html(data);   
            $('#response').show();
        }).fail(function() {             	
            // just in case posting your form failed
            $('#response').html("Send modify password request failed.");
            $('#response').show(); 
        });     	
     	
        return false;
    });        
});	


