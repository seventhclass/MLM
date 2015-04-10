/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value"); 	
 	
 	queryShoppingCartInfo(); 	 	 	
 	
 	//Query shopping cart information
 	function queryShoppingCartInfo(){
 		
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/shoppingcart',        	
 			cache:false,
 			async: false,
 			type:'POST',			
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);
 		                //$('#content').html(xhr.responseText); 		               
 	    			},        	
 	    	success:	function(res) {
 	    				queryShoppingCartInfoResponse(res);
 	    			}
 	    });    	
 	}

 	//Process query shopping cart information response 
 	function queryShoppingCartInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#shoppingCartList').html("");	
 			if(res.shoppingCartInfo && res.shoppingCartInfo.length>0){
 				$.each(res.shoppingCartInfo,function(i, item){
 					$('#shoppingCartList').append(
 						"<tr>"
 						+"	<td rowspan='4'><img src='"+basePath+"/images/products/"+item.imageNname+"' style='height: 50px; width: 55px;' alt=''></td>"
 						+"	<td>"+item.name+"</td>"
 						+"	<td rowspan='4' style='width:30px'><span data-id='"+item.id+"' class='glyphicon glyphicon-remove-sign close_item' style='color:red'></span></td>"
 						+"</tr>"
					    +"<tr>" 
					    +"	<td>"+item.capsuleNumber+" Counts</td>"
 						+"</tr>"
 						+"<tr>"
 						+"	<td>"+item.price+"$ x "+item.quantity+"</td>"
 						+"</tr>"
 					);
 				});
 			}else{
 				$("<button class='btn btn-success' type='button'>No Any Category Item</button>").insertAfter('.categorybox');
 			}
 		}
 	} 	  	
 	
});

