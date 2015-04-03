/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	 	
 	queryProductInfo();   
 	
 	//Query product information
 	function queryProductInfo(){
 		
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/product',        	
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
 	    				queryProductInfoResponse(res);
 	    			}
 	    });    	
 	}

 	//Process query product information response 
 	function queryProductInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#productlist').html("");	
 			if(res.productinfo && res.productinfo.length>0){
 				$.each(res.productinfo,function(i, item){
 					$('#productlist').append(
					    "<tr>"
			           	+"	<td>"+item.itemCode+"</td>"
			           	+"	<td>"+item.productName+"</td>"
			           	+"	<td>"+item.wholeSalePrice+"</td>"
			           	+"	<td>"+item.retailPrice+"</td>"
			           	+"	<td>"+item.currency+"</td>"
			           	+"	<td>"+item.number+"</td>"
			           	+"	<td>"+item.businessVolume+"</td>"
			           	+"	<td>"+item.businessVolume2+"</td>"
			           	+"  <td>"
			           	+"		<div class='col-sm-7 pdt_maintenance'>"
			           	+"			<button type='button' class='btn btn-success editproductbtn' data-toggle='modal' data-target='.productmaintenance' data-backdrop='static' >Edit</button>"
			           	+"		</div>"
			           	+"		<div class='col-sm-5 pdt_maintenance'>"
			           	+"			<button type='button' class='btn btn-danger delproductbtn' data-toggle='modal' data-target='#productcancel' data-backdrop='static' >Delete</button>"
			           	+"		</div>"
			           	+"	</td>"
					    +" </tr>"
 					);
 				});
 			}else{
 				$("<tr><td>No items. </td></tr>").insertAfter('#productlist');
 			}
 		}
 	}
 	
	$('.pdt_maintenance').click(function(e){
		
		if($(e.target).is('.editproductbtn')){			
			getAndSetData(e);
		}else{
			initData();
		}
		
	});
	
	function initData(){
		$('#itemcode').val("");
		$('#name').val("");
		
		$('#w_price').val("0.00");
		$('#r_price').val("0.00");
		$('#numbers').val("0");
		$('#volume').val("0");
		$('#volume2').val("0");
		$('#description').val("");
	}
	
	function getAndSetData(e){
		
		var $td = $(e.target).parents("tr").children("td");	
		
		$('#itemcode').val($td.eq(0).text());
		$('#name').val($td.eq(1).text());
		
		$('#w_price').val($td.eq(4).text());
		$('#r_price').val($td.eq(5).text());
		$('#numbers').val($td.eq(6).text());
		$('#volume').val($td.eq(7).text());
		$('#volume2').val($td.eq(8).text());
		$('#description').val($td.eq(8).text());
	}
});

