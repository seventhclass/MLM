/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	
 	queryCountryInfo();   

 	//Query country information
 	function queryCountryInfo(){
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/country',        	
 			cache:false,
 			async: false,
 			type:'POST',			
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+" "+xhr.responseText);
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
 		    	
 		if (result == "success") {
 			$('#"countrylist"').html("");	
 			if(res.countryinfo && res.countryinfo.length>0){
 				$.each(res.countryinfo,function(i, item){
 					$('#"countrylist"').append(
					    "<tr>"
			           	+"	<td>"+item.countryId+"</td>"
			           	+"	<td>"+item.countryName+"</td>"
			           	+"	<td>"+item.countryCode+"</td>"
			           	+"  <td>"
			           	+"		<div class='col-sm-offset-1 col-sm-4 cnt_maintenance'>"
			           	+"			<button type='button' class='btn btn-success editcountrybtn' data-toggle='modal' data-target='.countrymaintenance' data-backdrop='static' >Edit</button>"
			           	+"		</div>"
			           	+"		<div class='col-sm-2 cnt_maintenance'>"
			           	+"			<button type='button' class='btn btn-danger delcountrybtn' data-toggle='modal' data-target='#countrycancel' data-backdrop='static' >Delete</button>"
			           	+"		</div>"
			           	+"	</td>"
					    +" </tr>"
 					);
 				});
 			}else{
 				$("<tr><td>No items. </td></tr>").insertAfter('#countrylist');
 			}				 			
 		}
 	}

	$('.cnt_maintenance').click(function(e){
		if($(e.target).is('.editcountrybtn')){
			getAndSetData(e);
		}else{
			initData();
		}
		
	});
	
	function initData(){		
		$('#countryname').val("");
		$('#countrycode').val("");
	}
	
	function getAndSetData(e){
		var $td = $(e.target).parents("tr").children("td");	
		$('#countryname').val($td.eq(1).text());
		$('#countrycode').val($td.eq(2).text());
	}
});

