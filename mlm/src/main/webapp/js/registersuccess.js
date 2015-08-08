/**
 * 
 */
var searchString = location.search.slice(1);
var formString = searchString.replace(/\+/g, " ");
var dataString = unescape(formString);
var data = dataString.split(/[&=]/g);

$(document).ready(function(){
	var basePath=$('#basePath').attr("value");
	
	$("#goLogin_btn").click(function(){
		//alert("-000");
		window.location=basePath+"login?memberid="+$('#memberid').text();
	});	
		
});	


