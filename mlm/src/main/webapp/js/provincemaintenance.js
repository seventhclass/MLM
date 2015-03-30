/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	 	
 	queryCountryMenu();   

 	$("#countrymenu").change(function(){
 		var selectValue=$("#countrymenu").val();	
 		
 		queryProvinceInfo(selectValue);
 	});
 	
 	//Query country information
 	function queryCountryMenu(){
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/country',        	
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
 	    				queryCountryInfoResponse(res);
 	    			}
 	    });    	
 	}

 	//Process query country information response 
 	function queryCountryInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
		$('#countrymenu').html("");	
		$('#countrymenu').append(	
	           	"<option value='00'>Select Country</option>"			           	
			);  
		
 		if (result == "success") {			
 			if(res.countryinfo && res.countryinfo.length>0){
 				$.each(res.countryinfo,function(i, item){
 					$('#countrymenu').append(	
			           	"<option value='"+item.countryCode+"'>"+item.countryName+"</option>"			           	
 					);
 				});
 			}			 			
 		}
 	}

 	//Query province information
 	function queryProvinceInfo(countryCode){
 		//alert(countryCode);
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/province',        	
 			cache:false,
 			async: false,
 			data : {
 				countryId : countryCode
				},
 			type:'POST',			
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);
 		                //$('#content').html(xhr.responseText); 		               
 	    			},        	
 	    	success:	function(res) {
 	    				queryProvinceInfoResponse(res);
 	    			}
 	    });    	
 	}

 	//Process query province information response 
 	function queryProvinceInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#provincelist').html("");	
 			if(res.provinceinfo && res.provinceinfo.length>0){
 				$.each(res.provinceinfo,function(i, item){
 					$('#provincelist').append(
					    "<tr>"
			           	+"	<td>"+item.provinceId+"</td>"
			           	+"	<td>"+item.provinceName+"</td>"
			           	+"	<td>"+item.provinceCode+"</td>"
			           	+"  <td>"
			           	+"		<div class='col-sm-offset-1 col-sm-4 pvn_maintenance'>"
			           	+"			<button type='button' class='btn btn-success editprovincebtn' data-toggle='modal' data-target='.provincemaintenance' data-backdrop='static' >Edit</button>"
			           	+"		</div>"
			           	+"		<div class='col-sm-2 cnt_maintenance'>"
			           	+"			<button type='button' class='btn btn-danger delprovincebtn' data-toggle='modal' data-target='#provincecancel' data-backdrop='static' >Delete</button>"
			           	+"		</div>"
			           	+"	</td>"
					    +" </tr>"
 					);
 				});
 			}else{
 				$("<tr><td>No items. </td></tr>").insertAfter('#provincelist');
 			}
 		}
 	}
 	
	$('.pvn_maintenance').click(function(e){
		if($(e.target).is('.editprovincebtn')){
			getAndSetData(e);
		}else{
			initData();
		}
		
	});
	
	function initData(){		
		$('#provincename').val("");
		$('#provincecode').val("");
	}
	
	function getAndSetData(e){
		var $td = $(e.target).parents("tr").children("td");	
		$('#provincename').val($td.eq(1).text());
		$('#provincecode').val($td.eq(2).text());
	}
});

