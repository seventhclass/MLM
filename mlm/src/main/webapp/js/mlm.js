/**
 * 
 */

$(document).ready(function (){
	
	var jWindow = $(window);
	var screenWidth = jWindow.width();
	var screenHeight = jWindow.height();
	
	var pageWidth = $(".pagebox").css("width");
	var pageHeight = $(".pagebox").css("height");
	
	$(".content1").attr({"top":"20px","left":"100px"});
	
	$("#membertype").change(function(){
		var selectValue=$("#membertype").val();		
		if(selectValue == 1){
			$("#corporate").hide();
			$("#admin").hide();
			$("#individual").show();		
		}else if(selectValue == 2){			
			$("#individual").hide();
			$("#admin").hide();
			$("#corporate").show();		
		}else if(selectValue == 9){			
		$("#individual").hide();
		$("#corporate").hide();
		$("#admin").show();		
	}		
	});
	
	$("#selectaship").click(function(){
		var radioVal = $("input[name='optionsRadios']:checked").val(); 
		
		if( radioVal == "0" ){
			window.location="selectaccount.jsp";
		}else{
			window.location="registration.jsp?accounttype="+radioVal;
		}		
	});

	$("#selectatype").click(function(){
		var radioVal = $("input[name='optionsatype']:checked").val(); 
		
		window.location="registration.jsp?accounttype="+radioVal;	
	});	
	
	$("#selectpaymenttype").change(function(){
		var selectValue=$("#selectpaymenttype").val();		
		if(selectValue == 1){
	        $("#addnewcreditcard").modal({
	            keyboard:false,
	            backdrop:"static"
	        });		
	        $("#selectpaymenttype").get(0).selectedIndex=0; 
		}else if(selectValue == 2){			
			
		}	
		
	});    
});
