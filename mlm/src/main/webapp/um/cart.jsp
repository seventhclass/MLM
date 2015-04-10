<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Welcome to milleans vie science</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
	<link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/cart.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/mlm.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/cart.js"></script>	
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
					<div class="col-md-8">	
						<div id="succes-info">										
							<div class="row">	
								<div class="col-sm-offset-1 col-sm-10">							
									<img style="width: 25px; height: 30px" src="../images/logo/ok.png" alt="">
									<span class="h4">Products have been successfully added to shopping cart!</span>
								</div>
							</div>
						</div>
						<div id="settle-btn">
							<div class="row">
								<div class="col-sm-offset-2 col-sm-3">
									<button type="button" class="btn btn-danger">Go Cart Settlement</button>
								</div>
								<div class="col-sm-5" style="margin-top:6px;">
									You can also <a href="products.jsp">continue shopping</a>
								</div>
							</div>
						</div>
					</div>
				</div> <!-- end content -->	
				<div id="showcart">
					<div class="col-md-4">
						<div id="cartlist">
							<div class="row">
								<div class="panel panel-info">
									<div class="panel-heading text-center"><a href="myshoppingcart.jsp"><span class="glyphicon glyphicon-shopping-cart"></span>		My shopping cart</a></div>
									<div class="panel-body">
										<div class="p_item">
											<table class="table">
											   <tbody id="shoppingCartList">										   											  
												     <tr>
												       <td rowspan="3"><img src="../images/products/product1.png"
										           style="height: 50px; width: 55px;" alt=""></td>
										           		<td>Mt-1000</td>
										           		<td rowspan="3" style="width:30px"><span data-id="1" class="glyphicon glyphicon-remove-sign close_item" style="color:red"></span></td>
												     </tr>    
												     <tr>
										           		<td>90 Counts</td>
												     </tr> 		
												     <tr>
										           		<td>99.00$ x 1</td>
												     </tr>
												     <tr>
												       <td rowspan="3"><img src="../images/products/product1.png"
										           style="height: 50px; width: 55px;" alt=""></td>
										           		<td>Mt-1000B</td>
										           		<td rowspan="3" style="width:30px"><span data-id="2" class="glyphicon glyphicon-remove-sign close_item" style="color:red"></span></td>
												     </tr>     
												     <tr>
										           		<td>25 Counts</td>
												     </tr> 		
												     <tr>
										           		<td>41.00$ x 1</td>
												     </tr> 												     													     										     												           
											   </tbody>
											 </table>
										</div>	
									</div>
									<div class="panel-footer">
										<p class="list-group-item-text">Total Quantity: 2</p>
										<p class="list-group-item-text">Total Amount: $140.00</p>										
									</div>									
									<div class="panel-footer text-center">
										<button type="button" class="btn btn-danger">Go Cart Settlement</button>
									</div>
								</div>							
							</div>
						</div>
					</div>
				</div> <!-- end showcart -->					
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