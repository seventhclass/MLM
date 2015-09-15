<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Welcome to MilleanVie Science</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
	<link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/myshoppingcart.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/mlm.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/myshoppingcart.js"></script>	
</head>
<body>
	 <div class="container">
		<div id="header">
			<%@ include file="../includes/header.jsp"%>
		</div> <!-- end header -->
		<div id="functionbar">
			<%@ include file="../includes/functionbar.jsp"%>
		</div>
		<div id="page">
			<div class="row">
				<div id="content">				
					<div id="showcart">
						<div class="col-md-offset-2 col-md-8">
							<div id="cartlist">
								<div class="row">
									<div class="panel panel-info">
										<div class="panel-heading text-center"><span class="glyphicon glyphicon-shopping-cart"></span>		My shopping cart</div>
										<div class="panel-body">
											<div class="p_item">
												<table class="table">
												   <tbody id="shoppingCartList">
											 									     													     										     												           
												   </tbody>
												 </table>
											</div>	
										</div>
										<div class="panel-footer">
											<p class="list-group-item-text">Total Quantity: <span id="total_qty"></span></p>
											<p class="list-group-item-text">Total Amount: $<span id="total_amt"></span></p>										
										</div>									
										<div class="panel-footer text-center">
											<button id="makeOrder_btn" type="button" class="btn btn-danger">Make Order</button>
											<a href="<%=request.getContextPath()%>/products"><button type="button" class="btn btn-primary">Continue Shopping</button></a>
										</div>
									</div>							
								</div>
							</div>
						</div>
					</div> <!-- end showcart -->	
				</div> <!-- end content -->					
			</div>
		</div>  <!-- end page -->
	</div><!-- end container -->
	<div id="footer">		  			
		<div class="text-center">
			<%@ include file="../includes/footer.jsp"%>
		</div>
	</div>
	 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>