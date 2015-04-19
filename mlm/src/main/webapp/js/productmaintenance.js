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
 			$('#categoryselect').html("");	
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
			           	+"	<td data-value='"+item.id+"'>"+item.itemCode+"</td>"
			           	+"	<td data-value='"+item.categoryId+"'>"+item.category+"</td>"
			           	+"	<td>"+item.name+"</td>"
			           	+"	<td>"+item.wholesalePrice+"</td>"
			           	+"	<td>"+item.retailPrice+"</td>"
			           	+"	<td data-value='"+item.currencyId+"'>"+item.currency+"</td>"
			           	+"	<td>"+item.capsuleNumber+"</td>"
			           	+"	<td>"+item.volume+"</td>"
			           	+"	<td>"+item.volume2+"</td>"
			           	+"  <td style='display:none;'>"+item.description+"</td>"
			           	+"  <td>"
			           	+"		<div >"
			           	+"			<button type='button' class='btn btn-success btn-sm editproductbtn' data-toggle='modal' data-target='.productmaintenance' data-backdrop='static' >&nbsp;&nbsp;Edit&nbsp;&nbsp;</button>"
			           	+"		</div>"
			           	+"		<div >"
			           	+"			<button type='button' class='btn btn-danger btn-sm delproductbtn' data-toggle='modal' data-productid='"+item.id+"' data-target='#productcancel' data-backdrop='static' >Delete</button>"
			           	+"		</div>"
			           	+"		<div class='pdt_maintenance'>"
						+"	 		<button type='button' class='btn btn-warning btn-sm addproductimgbtn' data-toggle='modal' data-productid='"+item.id+"' data-target='.productimg' data-backdrop='static' >Image</button>"
						+"	  	</div>"
			           	+"	</td>"
					    +" </tr>"
 					);
 				});
 			}else{
 				$("<tr><td colspan='10'>No items. </td></tr>").insertAfter('#productlist');
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
		}			
	});
	
	function editProductImage(e){
		var id = $(e.target).attr("data-productid");
		queryProductImages(id);
	}
	
	function queryProductImages(id){
		$('#uploadFilebtn').attr("data-productid",id);

 	 	//send requrest to server.
 	    $.ajax({
 	    	url: basePath+'/productImages',        	
 			cache:false,
 			async: false,
 			type:'POST',			
 			data: {
 				productId:  id
 			},
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);
 		                //$('#content').html(xhr.responseText); 		               
 	    			},        	
 	    	success:	function(res) {
 	    		queryProductImagesResponse(res);
 	    			}
 	    });    	
 	}

 	function queryProductImagesResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			$('#editProductImgForm').html("");	
 			if(res.albumInfo && res.albumInfo.length>0){
 				$.each(res.albumInfo,function(i, item){
 					$('#editProductImgForm').append(
					    "<div class='form-group'>"
						+"	<div class='col-sm-1'>"
						+"		<input type='checkbox' name='productimage' vaue='"+item.id+"'>"
						+"	</div>"
						+"	<div class='col-sm-6'>"
						+"		<img src='"+basePath+"/images/products/"+item.imageName+"' style='height: 80px; width: 50px; display: block;' alt=''>"
						+"	</div>"
						+"</div>"
 					);
 				});
 			}else{
 				$("<div class='form-group'><div>No items. </div>").insertAfter('#editProductImgForm');
 			}
 		}
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

	$('#uploadFilebtn').click(function(e){		
		sendRequestOfUploadFile(e);
	});

	function sendRequestOfUploadFile(e){
		var id = $('#uploadFilebtn').attr("data-productid");
		alert("id="+id);
        alert("file="+$('#uploadFile').val());
		
        var formData;

        formData = new FormData();
        formData.append('file', $('input[name=uploadFile]', this).get(0).files[0]);

	 	    $.ajax({
 	    	url: basePath+'uploadImageFile',        	
            contentType:"multipart/form-data",
// 			cache:false,
// 			async: false,
            processData: false,
 			type:'POST',
 			data: {
 					productId: id,
 					uploadFile: formData 
 			},
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);		               
 	    			},        	
 	    	success:	function(res) {
 	    		sendRequestOfUploadFileResponse(res,id);
 	    			}
 	    });		
	}

 	function sendRequestOfUploadFileResponse(res,id){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			queryProductImages(id);
		}else{
    		if(message==null || message==""){
    			message = "Sorry, your request is failed.";
    		}    			
    		alert(message);
		}
 	}

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

		$('#productid').val($td.eq(0).attr("data-value"));
		$('#itemcode').val($td.eq(0).text());
		$("#categoryselect").val($td.eq(1).attr("data-value"));
		$('#name').val($td.eq(2).text());		
		$('#w_price').val($td.eq(3).text());
		$('#r_price').val($td.eq(4).text());
		$('#currencyselect').val($td.eq(5).attr("data-value"));
		$('#numbers').val($td.eq(6).text());
		$('#volume').val($td.eq(7).text());
		$('#volume2').val($td.eq(8).text());
		$('#description').val($td.eq(9).text());
	}
});

