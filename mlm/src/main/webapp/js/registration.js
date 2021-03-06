/**
 * 
 */
var searchString = location.search.slice(1);
var formString = searchString.replace(/\+/g, " ");
var dataString = unescape(formString);
var data = dataString.split(/[&=]/g);

$(document).ready(function(){
	var basePath=$('#basePath').attr("value");
	
	$("#membertype").change(function(){
		$('#response').hide(); 
		
		$('.btnsubmit').attr("disabled",true);				//Re-initialize checkbox and submit button.
		$(".policycheck").attr("checked",false);
		
		var selectValue=$("#membertype").val();		
		if(selectValue == 1){
			$("#corporate").hide();
			//$("#admin").hide();
			$("#individual").show();		
		}else if(selectValue == 2){			
			$("#individual").hide();
			//$("#admin").hide();
			$("#corporate").show();		
		}else if(selectValue == 9){			
			$("#individual").hide();
			$("#corporate").hide();
			//$("#admin").show();		
		}	
		return false;
	});
	
	$('#response').hide(); 
	
	/*Individual register page form element verification*/
	$('#firstname').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_fname").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});	
	$('#lastname').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_lname").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});	
	$('#password1').blur(function() {
        if ($(this).val() == "") {
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                $("#errmsg_pss").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password can not be empty.").css("color", "red");
                $('#password1').focus();
        } else {
                $(this).css("border-color", "#999");
                $("#errmsg_pss").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
                //clear "confirm password" field and focus it.
                $('#password2').val("");
                $('#password2').focus();
        }
        return true;
	});		
	$('#password2').blur(function() {
		//confirm password is empty.
        if ($(this).val() == "") {
    		$('#response').hide(); 
            $(this).css("border-color", "#FF0000");
            $("#errmsg_cpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Confirm password can not be empty.").css("color", "red");
            $('#password2').focus();
        } else {  //confirm password has values
        	
            $(this).css("border-color", "#999");
            $("#errmsg_cpass").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
            
        	//password is empty at this moment.
        	if( $('#password1').val()==null || $('#password1').val()==""){
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                //set focus to password and waiting user input.
                $("#errmsg_pss").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password can not be empty.").css("color", "red");
                $('#password1').focus();          		
        	}else {	//password has values at this moment.
        		//check if the password equals confirm password ?
        		if($('#password1').val() != $('#password2').val()){
            		$('#response').hide(); 
                    $(this).css("border-color", "#FF0000");
                    $("#errmsg_cpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password inconsistency.").css("color", "red");
                    //$('#password2').focus();        			
        		}
        	}
        }
        return true;
	});			
	$('#address').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_address").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});
	$('#countrycode').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_countrycode").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});
	$('#provincecode').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_provincecode").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});
	$('#city').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_city").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});
	$('#zip').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_zip").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});	
	$('#mobilephone').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_mphone").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	$('#email').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_email").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	$('#sponsorid').blur(function() {
        if ($(this).val() != "") {
                $(thbtnsubmit1is).css("border-color", "#999");
                $("#errmsg_spsid").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		

//	$('#individualregForm').submit(function(){
	$('.sm_individal').click(function(){
    	$('#response').hide(); 
    	$("#errmsg_fname").html("");
    	$("#errmsg_lname").html("");		
    	$("#errmsg_pss").html("");
    	$("#errmsg_cpass").html("");	
    	$("#errmsg_address").html("");	
    	$("#errmsg_countrycode").html("");	
    	$("#errmsg_provincecode").html("");	
    	$("#errmsg_city").html("");	
    	$("#errmsg_zip").html("");	
    	$("#errmsg_mphone").html("");	
    	$("#errmsg_email").html("");
    	$("#errmsg_spsid").html("");
    	
    	//get accouttype from url and set it to accounttype
    	//alert("type="+data[1]);
    	$('.accounttype').val(data[1]);
    	
     	if($('#firstname').val() == ""){
     		$("#errmsg_fname").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;First name can not be empty.").css("color", "red");
     		$('#firstname').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_fname").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#lastname').val() == ""){
     		$("#errmsg_lname").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Last name can not be empty.").css("color", "red");
     		$('#lastname').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_lname").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#password1').val() == ""){
     		$("#errmsg_pss").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password can not be empty.").css("color", "red");
     		$('#password1').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_pss").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#password2').val() == ""){
     		$("#errmsg_cpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Confirm password can not be empty.").css("color", "red");
     		$('#password2').focus();
     		return false;
     	}      	
     	if( $('#password1').val() != $('#password2').val()){
     		$("#errmsg_cpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password inconsistency.").css("color", "red");
     		$('#password2').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_cpass").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#address').val() == ""){
     		$("#errmsg_address").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Address can not be empty.").css("color", "red");
     		$('#address').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_address").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#countrycode').val() == ""){
            $("#errmsg_countrycode").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Country can not be empty.").css("color", "red");
            $('#countrycode').focus();
            return false;
    	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_countrycode").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#provincecode').val() == ""){
            $("#errmsg_provincecode").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Province can not be empty.").css("color", "red");
            $('#provincecode').focus();
            return false;
    	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_provincecode").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#city').val() == ""){
            $("#errmsg_city").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;City can not be empty.").css("color", "red");
            $('#city').focus();
            return false;
    	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_city").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#zip').val() == ""){
            $("#errmsg_zip").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Post Code can not be empty.").css("color", "red");
            $('#zip').focus();
            return false;
    	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_zip").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#mobilephone').val() == ""){
     		$("#errmsg_mphone").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Mobile phone can not be empty.").css("color", "red");
     		$('#mobilephone').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_mphone").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#email').val() == ""){
     		$("#errmsg_email").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;E-mail can not be empty.").css("color", "red");
     		$('#email').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_email").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#sponsorid').val() == ""){
     		$("#errmsg_spsid").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Sponsor id can not be empty.").css("color", "red");
     		$('#sponsorid').focus();
     		return false;
     	}      	
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_spsid").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	
     	$('#individualregForm').submit();
     	/*	
     	$('#response').html("");    	
		     
	$.post(basePath+'signUp?type=individual', $(this).serialize(), function(data){
			// show the response        	
			$('#response').html(data);   
			$('#response').show();
		}).fail(function() {             	
			// just in case posting your form failed
			$('#response').html("<span class='glyphicon glyphicon-exclamation-sign'></span>&nbsp;Send register request failed.");
			$('#response').show(); 
		});  */    	
	 	
	    return false;
	});    
	

	/*Company register page form element verification*/
	$('#c_companyname').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_cname").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});	
	$('#c_password1').blur(function() {
        if ($(this).val() == "") {
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                $("#errmsg_cpas").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password can not be empty.").css("color", "red");
                $('#c_password1').focus();
        } else {
                $(this).css("border-color", "#999");
                $("#errmsg_cpas").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
                //clear "confirm password" field and focus it.
                $('#c_password2').val("");
                $('#c_password2').focus();
        }
        return true;
	});		
	$('#c_password2').blur(function() {
		//confirm password is empty.
        if ($(this).val() == "") {
    		$('#response').hide(); 
            $(this).css("border-color", "#FF0000");
            $("#errmsg_ccpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Confirm password can not be empty.").css("color", "red");
            $('#c_password2').focus();
        } else {  //confirm password has values
        	
            $(this).css("border-color", "#999");
            $("#errmsg_ccpass").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
            
        	//password is empty at this moment.
        	if( $('#c_password1').val()==null || $('#c_password1').val()==""){
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                //set focus to password and waiting user input.
                $("#errmsg_cpas").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password can not be empty.").css("color", "red");
                $('#c_password1').focus();          		
        	}else {	//password has values at this moment.
        		//check if the password equals confirm password ?
        		if($('#c_password1').val() != $('#c_password2').val()){
            		$('#response').hide(); 
                    $(this).css("border-color", "#FF0000");
                    $("#errmsg_ccpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password inconsistency.").css("color", "red");
                    //$('#c_password2').focus();        			
        		}
        	}
        }
        return true;
	});			
	$('#c_address').blur(function() {
        if ($(this).text() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_c_address").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});
	$('#c_countrycode').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_c_countrycode").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});
	$('#c_provincecode').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_c_provincecode").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});
	$('#c_city').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_c_city").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});
	$('#c_zip').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_c_zip").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});	
	$('#c_mobilephone').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_cmphone").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	$('#c_email').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_cemail").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	$('#c_sponsorid').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_cspsid").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	//$('#companyregForm').submit(function(){
	$('.sm_company').click(function(){
    	$('#response').hide(); 
    	$("#errmsg_cname").html("");	
    	$("#errmsg_cpas").html("");
    	$("#errmsg_ccpass").html("");	
    	$("#errmsg_c_address").html("");	
    	$("#errmsg_c_countrycode").html("");	
    	$("#errmsg_c_provincecode").html("");	
    	$("#errmsg_c_city").html("");	
    	$("#errmsg_c_zip").html("");	
    	$("#errmsg_cmphone").html("");	
    	$("#errmsg_cemail").html("");
    	$("#errmsg_cspsid").html("");
    	
    	//alert("type="+data[1]);
    	$('.accounttype').val(data[1]);

     	if($('#c_companyname').val() == ""){
     		$("#errmsg_cname").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Company name can not be empty.").css("color", "red");
     		$('#c_companyname').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_cname").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#c_password1').val() == ""){
     		$("#errmsg_cpas").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password can not be empty.").css("color", "red");
     		$('#c_password1').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_cpas").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#c_password2').val() == ""){
     		$("#errmsg_ccpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Confirm password can not be empty.").css("color", "red");
     		$('#c_password2').focus();
     		return false;
     	}      	
     	if( $('#c_password1').val() != $('#c_password2').val()){
     		$("#errmsg_ccpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password inconsistency.").css("color", "red");
     		$('#c_password2').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_ccpass").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#c_address').val() == ""){
     		$("#errmsg_c_address").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Address can not be empty.").css("color", "red");
     		$('#c_address').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_c_address").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#c_countrycode').val() == ""){
            $("#errmsg_c_countrycode").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Country can not be empty.").css("color", "red");
            $('#c_countrycode').focus();
            return false;
    	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_c_countrycode").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#c_provincecode').val() == ""){
            $("#errmsg_c_provincecode").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Province can not be empty.").css("color", "red");
            $('#c_provincecode').focus();
            return false;
    	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_c_provincecode").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#c_city').val() == ""){
            $("#errmsg_c_city").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;City can not be empty.").css("color", "red");
            $('#c_city').focus();
            return false;
    	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_c_city").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#c_zip').val() == ""){
            $("#errmsg_c_zip").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Post Code can not be empty.").css("color", "red");
            $('#c_zip').focus();
            return false;
    	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_c_zip").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#c_mobilephone').val() == ""){
     		$("#errmsg_cmphone").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Mobile phone can not be empty.").css("color", "red");
     		$('#c_mobilephone').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_cmphone").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#c_email').val() == ""){
     		$("#errmsg_cemail").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;E-mail can not be empty.").css("color", "red");
     		$('#c_email').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_cemail").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#c_sponsorid').val() == ""){
     		$("#errmsg_cspsid").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Sponsor id can not be empty.").css("color", "red");
     		$('#c_sponsorid').focus();
     		return false;
     	}      	
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_cspsid").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	
     	$('#companyregForm').submit();

/*     	$('#response').html("");    	
		
		$.post(basePath+'signUp?type=company', $(this).serialize(), function(data){
			// show the response        	
			$('#response').html(data);   
			$('#response').show();
		}).fail(function() {             	
			// just in case posting your form failed
			$('#response').html("<span class='glyphicon glyphicon-exclamation-sign'></span>&nbsp;Send register request failed.");
			$('#response').show(); 
		});  */   	
	 	
	    return false;
	});	
	
	/*Administrator register page form element verification*/
	$('#adminfirstname').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_afname").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});	
	$('#adminlastname').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_alname").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});	
	$('#adminpassword1').blur(function() {
        if ($(this).val() == "") {
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                $("#errmsg_apass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password can not be empty.").css("color", "red");
                $('#adminpassword1').focus();
        } else {
                $(this).css("border-color", "#999");
                $("#errmsg_apass").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
                //clear "confirm password" field and focus it.
                $('#adminpassword2').val("");
                $('#adminpassword2').focus();
        }
        return true;
	});		
	$('#adminpassword2').blur(function() {
		//confirm password is empty.
        if ($(this).val() == "") {
    		$('#response').hide(); 
            $(this).css("border-color", "#FF0000");
            $("#errmsg_acpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Confirm password can not be empty.").css("color", "red");
            $('#adminpassword2').focus();
        } else {  //confirm password has values
        	
            $(this).css("border-color", "#999");
            $("#errmsg_acpass").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
            
        	//password is empty at this moment.
        	if( $('#adminpassword1').val()==null || $('#adminpassword1').val()==""){
        		$('#response').hide(); 
                $(this).css("border-color", "#FF0000");
                //set focus to password and waiting user input.
                $("#errmsg_apass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password can not be empty.").css("color", "red");
                $('#adminpassword1').focus();          		
        	}else {	//password has values at this moment.
        		//check if the password equals confirm password ?
        		if($('#adminpassword1').val() != $('#adminpassword2').val()){
            		$('#response').hide(); 
                    $(this).css("border-color", "#FF0000");
                    $("#errmsg_acpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password inconsistency.").css("color", "red");
                    //$('#adminpassword2').focus();        			
        		}
        	}
        }
        return true;
	});			
	$('#adminaddress').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_aaddress").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	$('#admincountry').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_admincountry").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	$('#adminprovince').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_adminprovince").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	$('#admincity').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_admincity").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	$('#adminzip').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_adminzip").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	$('#adminmobilephone').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_amphone").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});		
	$('#adminemail').blur(function() {
        if ($(this).val() != "") {
                $(this).css("border-color", "#999");
                $("#errmsg_aemail").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
        }
        return true;
	});			
	
	//$('#adminregForm').submit(function(){
	$('.sm_admin').click(function(){
    	$('#response').hide(); 
    	$("#errmsg_afname").html("");
    	$("#errmsg_alname").html("");		
    	$("#errmsg_apass").html("");
    	$("#errmsg_acpass").html("");	
    	$("#errmsg_aaddress").html("");	
    	$("#errmsg_admincountry").html("");	
    	$("#errmsg_adminprovince").html("");	
    	$("#errmsg_admincity").html("");	
    	$("#errmsg_adminzip").html("");	
    	$("#errmsg_amphone").html("");	
    	$("#errmsg_aemail").html("");
    	
    	//alert("type="+data[1]);
    	$('.accounttype').val(data[1]);
    	
     	if($('#adminfirstname').val() == ""){
     		$("#errmsg_afname").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;First name can not be empty.").css("color", "red");
     		$('#adminfirstname').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_afname").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#adminlastname').val() == ""){
     		$("#errmsg_alname").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Last name can not be empty.").css("color", "red");
     		$('#adminlastname').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_alname").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#adminpassword1').val() == ""){
     		$("#errmsg_apass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password can not be empty.").css("color", "red");
     		$('#adminpassword1').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_apass").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#adminpassword2').val() == ""){
     		$("#errmsg_acpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Confirm password can not be empty.").css("color", "red");
     		$('#adminpassword2').focus();
     		return false;
     	}      	
     	if( $('#adminpassword1').val() != $('#adminpassword2').val()){
     		$("#errmsg_acpass").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Password inconsistency.").css("color", "red");
     		$('#adminpassword2').focus();
     		return false;
     	}
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_acpass").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#adminaddress').val() == ""){
     		$("#errmsg_aaddress").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Address can not be empty.").css("color", "red");
     		$('#adminaddress').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_aaddress").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#admincountry').val() == ""){
     		$("#errmsg_admincountry").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Country can not be empty.").css("color", "red");
     		$('#admincountry').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_admincountry").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#adminprovince').val() == ""){
     		$("#errmsg_adminprovince").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Province can not be empty.").css("color", "red");
     		$('#adminprovince').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_adminprovince").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#admincity').val() == ""){
     		$("#errmsg_admincity").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;City can not be empty.").css("color", "red");
     		$('#admincity').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_admincity").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#adminzip').val() == ""){
     		$("#errmsg_adminzip").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Postcode can not be empty.").css("color", "red");
     		$('#adminzip').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_adminzip").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#adminmobilephone').val() == ""){
     		$("#errmsg_amphone").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;Mobile phone can not be empty.").css("color", "red");
     		$('#adminmobilephone').focus();
     		return false;
     	}  
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_amphone").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	if($('#adminemail').val() == ""){
     		$("#errmsg_aemail").html("<span class='glyphicon glyphicon-warning-sign'></span>&nbsp;E-mail can not be empty.").css("color", "red");
     		$('#adminemail').focus();
     		return false;
     	}        	
     	else
     	{
            $(this).css("border-color", "#999");
            $("#errmsg_aemail").html("<span class='glyphicon glyphicon-ok-sign'></span>").css("color","green");
     	}
     	
     	$('#adminregForm').submit();

/*     	$('#response').html("");    	
		
		$.post(basePath+'signUp?type=admin', $(this).serialize(), function(data){
			// show the response        	
			$('#response').html(data);   
			$('#response').show();
		}).fail(function() {             	
			// just in case posting your form failed
			$('#response').html("<span class='glyphicon glyphicon-exclamation-sign'></span>&nbsp;Send register request failed.");
			$('#response').show(); 
		}); */    	
	 	
	    return false;
	});   	
	
	
	$(".policycheck").change(function() {
		var radioVal = $("input[name='policycheck']:checked").val(); 

        if( radioVal=="on" ) {
        	$('.btnsubmit').attr("disabled",false);
        }else{
        	$('.btnsubmit').attr("disabled",true);
        }
    });
		
});	


