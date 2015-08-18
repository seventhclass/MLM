/**
 * 
 */
var searchString = location.search.slice(1);
var formString = searchString.replace(/\+/g, " ");
var dataString = unescape(formString);
var data = dataString.split(/[&=]/g);

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value"); 	
 	$('#orderid').html(data[1]);
 	$('#ordertotal').html("CAD "+data[3]);
});

