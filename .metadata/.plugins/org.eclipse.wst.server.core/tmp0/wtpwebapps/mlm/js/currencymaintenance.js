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
 	    	url: basePath+'/common/currency',        	
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
 			if(res.symbol && res.symbol.length>0){
 				$.each(res.symbol,function(i, item){
 					$('#currencylist').append(
					    "<tr>"
			           	+"	<td>"+item.id+"</td>"
			           	+"	<td>"+item.name+"</td>"
			           	+"	<td>"+item.symbol+"</td>"
			           	+"  <td>"
			           	+"		<div class='col-sm-offset-1 col-sm-4'>"
			           	+"			<button type='button' class='btn btn-success editcurrencybtn' data-toggle='modal' data-target='.currencymaintenance' data-backdrop='static' >Edit</button>"
			           	+"		</div>"
			           	+"		<div class='col-sm-2'>"
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
			editCurrency(e);
		}else if($(e.target).is('.addcurrencybtn')){
			addCurrency(e);
		}else if($(e.target).is('.delcurrencybtn')){
			delCurrency(e);
		}else{
			alert("Your operation is not available. ");
		}		
	});
	
	function editCurrency(e){
		getAndSetData(e);
		$('#currencyid').attr("data-model","upd");
	}
	
	function addCurrency(e){
		initData();
		$('#currencyid').attr("data-model","add");
	}	
	
	function delCurrency(e){
		getAndSetData(e);
		$('#currencyid').attr("data-model","del");
	}		
	
	$('#editCurrencybtn').click(function(){		
		sendRequestOfEditCurrency();
	});
	
	$('#delCurrencybtn').click(function(){		
		sendRequestOfEditCurrency();
	})
	
	function initData(){		
		$('#currencyname').val("");
		$('#currencyabbr').val("");
	}
	
	function getAndSetData(e){
		var $td = $(e.target).parents("tr").children("td");	
		$('#currencyid').val($td.eq(0).text());
		$('#currencyname').val($td.eq(1).text());
		$('#currencyabbr').val($td.eq(2).text());
	}
	
	function sendRequestOfEditCurrency(){
		var i_model = $('#currencyid').attr("data-model");
		var i_id = $('#currencyid').val();
		var i_name = $('#currencyname').val();
		var i_abbr = $('#currencyabbr').val();
//alert("model="+i_model+", id="+i_id+", name="+i_name+", abbr="+i_abbr);
 	    $.ajax({
 	    	url: basePath+'/common/editcurrency',        	
 			cache:false,
 			async: false,
 			type:'POST',
 			data: {
 				model: i_model,
 				id: i_id,
 	    		name: i_name,
 	    		abbr: i_abbr
 			},
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);		               
 	    			},        	
 	    	success:	function(res) {
 	    		sendRequestOfEditCurrencyResponse(res);
 	    			}
 	    });		
	}
	 	
 	function sendRequestOfEditCurrencyResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			window.location.href=basePath+"currencymaintenance";
		}else{
    		if(message==null || message==""){
    			message = "Sorry, your request is failed.";
    		}    			
    		alert(message);
		}
 	}	
});

