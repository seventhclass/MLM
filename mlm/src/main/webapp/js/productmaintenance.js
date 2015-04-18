/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	 	 	
 	queryProductInfo();   
 	
 	//Query category information
 	function queryCategoryInfo(){
 		
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/common/category',        	
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
 	    				queryCategoryInfoResponse(res);
 	    			}
 	    });    	
 	}

 	//Process query category information response 
 	function queryCategoryInfoResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('.categoryselect').html("");	
 			if(res.list && res.list.length>0){
 				$.each(res.list,function(i, item){
 					$('#categoryselect').append(
					    "<option value='"+item.id+"'>"+item.name+"</option>"
 					);
 				});
 			}else{
 				$("<option>No Any Category Item</option>").insertAfter('#categoryselect');
 			}
 		}
 	} 	 	 	
 	
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
 			$('#currencyselect').html("");	
 			if(res.symbol && res.symbol.length>0){
 				$.each(res.symbol,function(i, item){
 					$('#currencyselect').append(
					    "<option value='"+item.id+"'>"+item.symbol+" - "+item.name+"</option>"
 					);
 				});
 			}else{
 				$("<tr><td>No items. </td></tr>").insertAfter('#currencylist');
 			}
 		}
 	} 	
 	
 	//Query product information
 	function queryProductInfo(){
 		
 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/productList',        	
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
 			if(res.productInfo && res.productInfo.length>0){
 				$.each(res.productInfo,function(i, item){
 					$('#productlist').append(
					    "<tr>"
			           	+"	<td value='"+item.id+"'>"+item.itemCode+"</td>"
			           	+"	<td value='"+item.categoryId+"'>"+item.category+"</td>"
			           	+"	<td>"+item.productName+"</td>"
			           	+"	<td>"+item.wholeSalePrice+"</td>"
			           	+"	<td>"+item.retailPrice+"</td>"
			           	+"	<td value='"+item.currencyId+"'>"+item.currency+"</td>"
			           	+"	<td>"+item.number+"</td>"
			           	+"	<td>"+item.businessVolume+"</td>"
			           	+"	<td>"+item.businessVolume2+"</td>"
			           	+"  <td>"
			           	+"		<div class='col-sm-7'>"
			           	+"			<button type='button' class='btn btn-success editproductbtn' data-toggle='modal' data-target='.productmaintenance' data-backdrop='static' >Edit</button>"
			           	+"		</div>"
			           	+"		<div class='col-sm-5 '>"
			           	+"			<button type='button' class='btn btn-danger delproductbtn' data-toggle='modal' data-productid='"+item.id+"' data-target='#productcancel' data-backdrop='static' >Delete</button>"
			           	+"		</div>"
			           	+"		<div class='col-sm-5 pdt_maintenance'>"
						+"	 		<button type='button' class='btn btn-danger addproductimgbtn' data-toggle='modal' data-target='.productimg' data-backdrop='static' >Image</button>"
						+"	  	</div>"
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
		
		queryCategoryInfo();
		queryCurrencyInfo();  
		
		if($(e.target).is('.editproductbtn')){
			editProduct(e);
		}else if($(e.target).is('.addproductbtn')){
			addProduct(e);
		}else if($(e.target).is('.delproductbtn')){
			delProduct(e);
		}else if($(e.target).is('.editproductimgbtn')){
			editProductImage(e);
		}else{
			alert("Your operation is not available. ");
		}			
	});
	
	function editProductImage(e){
		;
	}
	
	function editProduct(e){
		getAndSetData(e);
		$('#productid').attr("data-model","upd");
	}
	
	function addProduct(e){
		initData();
		$('#productid').attr("data-model","add");
	}	
	
	function delProduct(e){
		getAndSetData(e);
		$('#productid').attr("data-model","del");
	}			
	
	$('#editProductbtn').click(function(){		
		sendRequestOfEditProduct();
	});
	
	$('#delProductbtn').click(function(){		
		sendRequestOfEditProduct();
	});

	function sendRequestOfEditProduct(){
		var i_model = $('#productid').attr("data-model");
		var i_id = $('#productid').val();
		var i_itemcode = $('#itemcode').val();
		var i_name = $('#name').val();
		var i_categoryid = $('#categoryselect').val();
		var i_currencyid = $('#currencyselect').val();
		var i_wprice = $('#w_price').val();
		var i_rprice = $('#r_price').val();
		var i_numbers = $('#numbers').val();
		var i_volume = $('#volume').val();
		var i_volume2 = $('#volume2').val();
		var i_desc = $('#description').val();
alert("model="+i_model+", id="+i_id+", itemcode="+i_itemcode+", name="+i_name+", categoryid="+i_categoryid+", currencyid="+i_currencyid+", wprice="+i_wprice+", rprice="+i_rprice+", numbers="+i_numbers+", volume="+i_volume+", volume2="+i_volume2+", description="+i_desc);
 	    $.ajax({
 	    	url: basePath+'editproduct',        	
 			cache:false,
 			async: false,
 			type:'POST',
 			data: {
 					model: i_model,
 					id: i_id,
 	    			itemcode: i_itemcode,
 	    			name: i_name,
 	    			categoryid: i_categoryid,
 	    			currencyid: i_currencyid,
 	    			w_price: i_wprice,
 	    			r_price: i_rprice,
 	    			numbers: i_numbers,
 	    			volume: i_volume,
 	    			volume2: i_volume2,
 	    			description: i_desc
 			},
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);		               
 	    			},        	
 	    	success:	function(res) {
 	    		sendRequestOfEditProductResponse(res);
 	    			}
 	    });		
	}
	 	
 	function sendRequestOfEditProductResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			window.location.href=basePath+"productmaintenance";
		}else{
    		if(message==null || message==""){
    			message = "Sorry, your request is failed.";
    		}    			
    		alert(message);
		}
 	}
 	
	function initData(){
		$('#itemcode').val("");
		$('#productid').val("");
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
		
		$('#productid').val($td.eq(0).val());
		$('#itemcode').val($td.eq(0).text());
		$("#categoryselect").val($td.eq(1).val());
		$('#name').val($td.eq(2).text());		
		$('#w_price').val($td.eq(3).text());
		$('#r_price').val($td.eq(4).text());
		$('#currencyselect').val($td.eq(5).val());
		$('#numbers').val($td.eq(6).text());
		$('#volume').val($td.eq(7).text());
		$('#volume2').val($td.eq(8).text());
	}
});

