/**
 * 
 */

$(document).ready(function (){
	
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
		if( radioVal == "yes" ){
			window.location="registration.jsp?aship=yes";
		}else if( radioVal == "no" ){
			window.location="selectaccount.jsp";
		}else{
			alert("Select one, please!");
		}		
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
