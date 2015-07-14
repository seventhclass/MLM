<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<script type="text/javascript">
	$(document).ready(function(){
	 	var basePath=$('#basePath').attr("value");
	 	
	 	queryMyShoppingCartSummary();
	 	
	 	//Query my shopping cart summary information
	 	function queryMyShoppingCartSummary(){
	 	 	//send requrest to server.
	 	    $.ajax({
	 	    	url: basePath+'common/shoppingCartSummary',        	
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
	 	    		queryMyShoppingCartSummaryResponse(res);
	 	    			}
	 	    });    	
	 	}	 	
	 	
	 	function queryMyShoppingCartSummaryResponse(res){
	 		var result = res.result;			//response code
	 		var message = res.message;			//response message
	 		
	 		if (result == "success") {
	 			$('.myshoppingcartitemnumber').html("");	
		 		$('.myshoppingcartitemnumber').html(res.cartSummary.totalQuantily);	
	 			$('.myshoppingcartitemnumber').attr('data-totalamount',res.cartSummary.totalAmount);
	 		}else{
	    		if(message==null || message==""){
	    			message = "Sorry, loading shopping cart information failed.";
	    		}    			
	    		alert(message);
			}
	 	}
	}); 	 	 
</script>    
<div class='row'>
	<div class='col-md-4'>
		<p class='text-justify'>Building A YOUNGER, HEALTHIER, WEALTHIER LIFE Enjoy Shopping</p>
	</div>
	<div class='col-md-8'>
		<div class='col-sm-offset-7 col-sm-6'>
			<a class="myorder_btn" href='<%=request.getContextPath()%>/order/myOrderList'><button type='button' class='btn btn-info'><span class='glyphicon glyphicon-list-alt'></span> My Orders </button></a>
			<a class="myshoppingcart_btn" href='<%=request.getContextPath()%>/myshoppingcart'><button type='button' class='btn btn-danger'><span class='glyphicon glyphicon-shopping-cart'></span> My Shopping Cart <span data-totalamount="" class='badge myshoppingcartitemnumber'></span></button></a>
		</div>
	</div>
</div>