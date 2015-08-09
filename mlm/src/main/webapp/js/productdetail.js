/**
 * 
 */
var searchString = location.search.slice(1);
var formString = searchString.replace(/\+/g, " ");
var dataString = unescape(formString);
var data = dataString.split(/[&=]/g);

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	 	
 	queryProductDetailInfo();   
 	
 	//Query products information
 	function queryProductDetailInfo(){
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'productDetail',        	
 			cache:false,
 			async: false,
 			type:'POST',			
            data: {
                pid: data[1]
            },
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);
 		                //$('#content').html(xhr.responseText); 		               
 	    			},        	
 	    	success:	function(res) {
 	    		queryProductDetailInfoResponse(res);
 	    			}
 	    });    		
 	}

 	//Process query products information response 
 	function queryProductDetailInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#productdetailinfo').html("");	
 			if(res.productInfo && res.productInfo.length>0){
 				$.each(res.productInfo,function(i, item){
 					parseFloat
 					$('#productdetailinfo').append(
					    "<div id='productthumbnail' class='col-md-3'>"
 						+"	<a href='"+basePath+"productDetail?id="+item.id+"' class='thumbnail'>"
 						+"		<img src='"+basePath+"images/products/"+item.imageName+"' style='height: 200px; width: 150px; display: block;' alt=''>"
 						+"	</a>"
 						+"</div>"
 						+"<div id='productcontent' class='col-md-9'>"
 						+"	<div class='caption'>"
 						+"		<h3 class='p_name'>"+item.name+"</h3>"
 						+"		<p class='p_itemCode'><font style='font-weight:bold;'>Item No:&nbsp;&nbsp;</font>"+item.itemCode+"</p>"
 						+"		<p><font style='font-weight:bold;'>Price:&nbsp;&nbsp;</font>Reatil&nbsp;<span class='p_rPrice'>"+parseFloat(item.retailPrice).toFixed(2)+"</span>$<span>&nbsp;&#47;&nbsp;</span>Assoc&nbsp;<span class='p_wPrice'>"+parseFloat(item.wholesalePrice).toFixed(2)+"</span>$<span>&nbsp;&#47;&nbsp;</span><span class='p_BV'>"+item.volume+"</span>BV</p>"
 						+"		<p><font style='font-weight:bold;'>Volume:&nbsp;&nbsp;</font><span class='p_numbers'>"+item.capsuleNumber+"</span>&nbsp;Counts</p>" 						
 						+"		<font style='font-weight:bold;'>Description:</font><hr/>" 
 						+"		<p>"+item.description+"</p>"
			           	+"	</div>"
			           	+"</div>"			           	
 					);
 				});
 			}else{
 				$("<p>No Product Item Information. </p>").insertAfter('#productdetailinfo');
 			}
 		}
 	}

});

