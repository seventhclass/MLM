/**
 * 
 */

$(document).ready(function (){
	var basePath=$('#basePath').attr("value");
	
	var jWindow = $(window);
	var screenWidth = jWindow.width();
	var screenHeight = jWindow.height();	
	
	$("#selectaship").click(function(){
		var radioVal = $("input[name='optionsRadios']:checked").val(); 
		
		if( radioVal == "0" ){
			window.location=basePath+"selectAccount";
		}else{
			window.location=basePath+"registration?accounttype="+radioVal;
		}		
	});

	$("#selectatype").click(function(){
		var radioVal = $("input[name='optionsatype']:checked").val(); 
		
		window.location=basePath+"registration?accounttype="+radioVal;	
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
