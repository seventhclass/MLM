/**
 * 
 */
alert("11111111111111");
$(document).ready(function (){
	alert("2222222222222222");
	var item = $("select[@name='membertype'] option[@selected]").val();
	alert("item=");
	if(item == 1){
		$("#corporate").attr("display","none");
		$("#individual").attr("display","block");		
	}else{
		$("#individual").attr("display","none");
		$("#corporate").attr("display","block");		
	}
	
});
