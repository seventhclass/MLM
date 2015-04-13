/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value");
 	 	
 	queryCategoryInfo();   
 	
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
 			$('#categorylist').html("");	
 			if(res.categoryinfo && res.categoryinfo.length>0){
 				$.each(res.categoryinfo,function(i, item){
 					$('#categorylist').append(
					    "<tr>"
			           	+"	<td>"+item.categoryId+"</td>"
			           	+"	<td>"+item.categoryName+"</td>"
			           	+"  <td>"
			           	+"		<div class='col-sm-offset-1 col-sm-4 cat_maintenance'>"
			           	+"			<button type='button' class='btn btn-success editcategorybtn' data-toggle='modal' data-target='.categorymaintenance' data-backdrop='static' >Edit</button>"
			           	+"		</div>"
			           	+"		<div class='col-sm-2 cat_maintenance'>"
			           	+"			<button type='button' class='btn btn-danger delcategorybtn' data-toggle='modal' data-target='#categorycancel' data-backdrop='static' >Delete</button>"
			           	+"		</div>"
			           	+"	</td>"
					    +" </tr>"
 					);
 				});
 			}else{
 				$("<tr><td>No items. </td></tr>").insertAfter('#categorylist');
 			}
 		}
 	}
 	
	$('.cat_maintenance').click(function(e){
		if($(e.target).is('.editcategorybtn')){
			editCategroy(e);
		}else if($(e.target).is('.addcategorybtn')){
			alert("111");
			addCategroy(e);
		}else if($(e.target).is('.delcategorybtn')){
			delCategroy(e);
		}else{
			alert("Your operation is not available. ");
		}		
	});
	
	function editCategory(e){
		getAndSetData(e);
		$('#categoryid').attr("data-model","upd");
		sendRequestOfEditCategory(); 		
	}
	
	function addCategroy(e){
		initData();
		$('#categoryid').attr("data-model","add");
		sendRequestOfEditCategory(); 		
	}	
	
	function delCategroy(e){
		getAndSetData(e);
		$('#categoryid').attr("data-model","del");
		sendRequestOfEditCategory(); 		
	}		
	
	function sendRequestOfEditCategory(){
 	    $.ajax({
 	    	url: basePath+'/common/editcategory',        	
 			cache:false,
 			async: false,
 			type:'POST',
 			data: {
 				model: $('#categoryid').attr("data-model"),
 				id: $('#categoryid').val(),
 	    		name: $('#categoryname').val()
 			},
 	    	dataType:'json',
 	    	timeout:5000,
 	    	error:	function(xhr, ajaxOptions, thrownError){
 		                alert(xhr.status+"\n"+xhr.responseText);		               
 	    			},        	
 	    	success:	function(res) {
 	    		sendRequestOfEditCategoryResponse(res);
 	    			}
 	    });		
	}
	 	
 	function sendRequestOfEditCategoryResponse(res){
 		var result = res.result;			//response code
 		var message = res.message;			//response message
 		
 		if (result == "success") {
 			;
		}else{
    		if(message==null || message==""){
    			message = "Sorry, your request is failed.";
    		}    			
    		alert(message);
		}
 	}
	
	function initData(){		
		$('#categoryname').val("");
	}
	
	function getAndSetData(e){
		var $td = $(e.target).parents("tr").children("td");	
		$('#categoryid').val($td.eq(0).text());
		$('#categoryname').val($td.eq(1).text());
	}
});

