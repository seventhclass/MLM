/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	 	
 	queryCurrencyInfo();   
 	
 	//Query currency information
 	function queryCurrencyInfo(){
 		
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/currency',        	
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
 	    				queryCurrencyInfoResponse(res);
 	    			}
 	    });    	
 	}

 	//Process query currency information response 
 	function queryCurrencyInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#currencylist').html("");	
 			if(res.currencyinfo && res.currencyinfo.length>0){
 				$.each(res.currencyinfo,function(i, item){
 					$('#currencylist').append(
					    "<tr>"
			           	+"	<td>"+item.currencyId+"</td>"
			           	+"	<td>"+item.provinceCode+"</td>"
			           	+"	<td>"+item.provinceName+"</td>"
			           	+"	<td>"+item.Abbreviation+"</td>"
			           	+"  <td>"
			           	+"		<div class='col-sm-offset-1 col-sm-4 cur_maintenance'>"
			           	+"			<button type='button' class='btn btn-success editcurrencybtn' data-toggle='modal' data-target='.currencymaintenance' data-backdrop='static' >Edit</button>"
			           	+"		</div>"
			           	+"		<div class='col-sm-2 cur_maintenance'>"
			           	+"			<button type='button' class='btn btn-danger delcurrencybtn' data-toggle='modal' data-target='#currencycancel' data-backdrop='static' >Delete</button>"
			           	+"		</div>"
			           	+"	</td>"
					    +" </tr>"
 					);
 				});
 			}else{
 				$("<tr><td>No items. </td></tr>").insertAfter('#currencylist');
 			}
 		}
 	}
 	
	$('.cur_maintenance').click(function(e){
		if($(e.target).is('.editcurrencybtn')){
			getAndSetData(e);
		}else{
			initData();
		}
		
	});
	
	function initData(){		
		$('#currencyname').val("");
		$('#currencycode').val("");
		$('#currencyabbr').val("");
	}
	
	function getAndSetData(e){
		var $td = $(e.target).parents("tr").children("td");	
		$('#currencycode').val($td.eq(1).text());
		$('#currencyname').val($td.eq(2).text());
		$('#currencyabbr').val($td.eq(3).text());
	}
});

