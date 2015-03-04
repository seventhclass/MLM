<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Welcome to milleans vie science</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
	<link href="../css/reset.css" rel="stylesheet" type="text/css" />
	<link href="../css/style.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="../js/mlm.js"></script>	
</head>
<body>
	 <div class="container">
		<div id="header">
			<div class="row">
				<div class="col-md-12">
					<img style="width: 100%; height: 75px" src="../images/header1.jpg"
						alt="milleans vie science">
				</div>
			</div>		
			<div class="row">
				<div class="navbar navbar-inverse" role="navigation">
					<div class="navbar-header">
						<button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".navbar-responsive-collapse">
							<span class="sr-only">Toggle Navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a href="##" class="navbar-brand text-center">
						<img style="width: 25px; height: 30px" src="../images/logo/logo.png" alt="milleans vie science">
						Milleans Vie Sciences
						</a>
					</div>
				  <!-- when screen width less than 768px, the content of div.navbar-responsive-collapse will be hidden, show icon-bar, when click icon-bar, it will extend. when screen width greater than 768px, show as default. -->
				  <div class="collapse navbar-collapse navbar-responsive-collapse">
				    	<ul class="nav navbar-nav">
				      		<li><a href="home.jsp">Home</a></li>
				      		<li class="active"><a href="products.jsp">Products</a></li>
				      		<li><a href="aboutus.jsp">About Us</a></li>
				      		<li><a href="contactus.jsp">Contact Us</a></li>
				      		<li><a href="selectautoship.jsp">Registration</a></li>
				      		<li><a href="login.jsp">Login</a></li>
				      		<li><a href="logout.jsp">Logout</a></li>
					 	</ul>
				  </div>
				</div>			
			</div>
		</div> <!-- end header -->
		<div id="functionbar">
			<div class="row">
				<div class="col-md-4">
					<p class="text-justify">Building A YOUNGER, HEALTHIER, WEALTHIER LIFE Enjoy Shopping</p>
				</div>
				<div class="col-md-8">
					<div class="col-sm-offset-7 col-sm-6">
						<button type="button" class="btn"><span class="glyphicon glyphicon-list-alt"></span> My Order </button>
						<button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-shopping-cart"></span> Go Cart Settlement <span class="badge">2</span></button>
					</div>
				</div>
			</div>
		</div>
		<div id="page">
			<div class="row">
				<div class="col-md-3">
					<div id="left">
						<ul class="nav nav-pills nav-stacked">
						    <li><a href="selectautoship.jsp">New Member Sign Up</a></li>
						 	<li><a href="editprofile.jsp">Edit Profile</a></li>
						 	<li><a href="modifypassword.jsp">Modify Password</a></li>						
						 	<li><a href="##">Search Member</a></li>
						    <li class="nav-divider"></li>
						    <li class="active"><a href="##">Order Entry</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="paymenttype.jsp">Payment Types</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="autoship.jsp">AutoShip</a></li>
						    <li><a href="autoshiplist.jsp">AutoShip List</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="productmaintenance.jsp">Product Maintenance</a></li>
						    <li><a href="countrymaintenance.jsp">Country Maintenance</a></li>
						    <li><a href="currencymaintenance.jsp">Currency Maintenance</a></li>
		  				 	<li><a href="addressmaintenance.jsp">Address Maintenance</a></li>
						</ul>			
					</div>
				</div>
				<div class="col-md-9">							
					<div id="content">				
						<div id="orderentry">
							<div class="list-group">
							    <div class="list-group-item list-group-item-info active"><span class="glyphicon glyphicon-list-alt"></span> My Order </div>
							    <div class="list-group-item">
									<div class="row">	
										<div class="col-sm-3">	
											Member ID: ABCDE00001
										</div>
										<div class="col-sm-4">	
											Michael Wang
										</div>	
										<div class="col-sm-5">
											<div class="list-group">
												<div class="list-group-item list-group-item-danger">
													<div class="row">
														<div class="col-sm-4">
															<img style="width: 80px; height: 80px; padding: 10px;" src="../images/logo/shopping-cart-icon-transparent.png" alt="shopping cart">
															
														</div>
														<div class="col-sm-7 text-right">
															<div class="row">
																Shopping Cart Item: 3
															</div>
															<div class="row">
																Total: $222.00 CAD
															</div>
															<div id="order_cart">
																<div class="row">
																	<a href="#">[Clear]</a> <a href="#">[Checkout]</a>
																</div>
															</div>
														</div>							    														
													</div>
												</div>
											</div>
										</div>									
									</div>								
								</div>
							    <div class="list-group-item">
										<div class="subtitle" >Order Checkout</div>
										<div class="table-responsive ordertable">
											<table class="table">
												<thead>
													<tr>
														<th>Item Code</th>
														<th>Description</th>
														<th>Qty</th>
														<th>Currency</th>
														<th>Price Each</th>
														<th>Volume</th>
														<th>Volume 2</th>
														<th>Price Total</th>
														<th>Points Total</th>
													</tr>
												</thead>
											   <tbody>
											     <tr>
													<td>A000000001</td>
									           		<td>Prolo telomeres anti-oxidauil ....</td>
									           		<td>1</td>
									           		<td>CAD</td>
									           		<td>99.00</td>
									           		<td>90</td>
									           		<td></td>
									           		<td>$99.00</td>
									           		<td>9</td>
											     </tr>  
											     <tr>
													<td>A000000002</td>
									           		<td>Second Generation of MT-1000</td>
									           		<td>1</td>
									           		<td>CAD</td>
									           		<td>41.00</td>
									           		<td>25</td>
									           		<td></td>
									           		<td>$41.00</td>
									           		<td>4</td>
											     </tr> 		
											     <tr>
													<td>A000000003</td>
									           		<td>Preulsor of a miracle moleeule</td>
									           		<td>1</td>
									           		<td>CAD</td>
									           		<td>82.00</td>
									           		<td>30</td>
									           		<td></td>
									           		<td>$82.00</td>
									           		<td>8</td>
											     </tr>
											     <tr>
											     	<td colspan="3"></td>
											     	<td>Total:</td>
											     	<td></td>
											     	<td>145</td>
											     	<td></td>
											     	<td>$222.00</td>
											     	<td>21</td>
											     </tr> 													     										       												     													     										     												           
											   </tbody>
											 </table>
										</div>	
										<div>											
											<form class="form-horizontal" role="form" action="">
												<div class="form-group">
													<div class="col-sm-2">													
														<button type="button" class="btn btn-success" data-toggle="modal" data-target="#productlist" data-backdrop="static" >Products List <span class="glyphicon glyphicon-circle-arrow-down"></span></button>
													</div>
													<div class="col-sm-2">
														<input type="text" class="form-control" id="itemcode"
															placeholder="Item Code">														
													</div>
													<div class="col-sm-2">
														Qty:<input type="number" name="quantity" min="1" max="999" value="1">
													</div>
													<div class="col-sm-offset-4 col-sm-2">
														<button type="submit" class="btn btn-success">Add Item <span class="glyphicon glyphicon-plus-sign"></span></button>
													</div>
												</div>											
											</form>
										</div>
										<div id="finish_order" class="text-center">
											<a href="payandship.jsp"><button type="button" class="btn btn-primary">Finished Order <span class="glyphicon glyphicon-ok-sign"></span></button></a>
										</div>
								</div>	
							    <div class="list-group-item">
									<div class="text-center">
										<a href="products.jsp">Countinue Shopping</a>
									</div>
								</div>															
							</div>
						</div> <!-- end orderentry -->							
					</div> <!-- end content -->		
				</div>			
			</div>
		</div>  <!-- end page -->
	</div><!-- end container -->
	<div id="footer">		  			
		<div class="text-center">
			Copyright © 2015 <a href="http://7thclass-smallfoots.rhcloud.com/">7thclass</a> All Rights Reserved.
		</div>
	</div>
	 	
	<div id="productlist" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<h4 class="modal-title text-center">Products List</h4>
				</div>
				<div class="modal-body">
					<div class="subtitle" >Products Selection</div>
						<div class="table-responsive ordertable">
							<table class="table">
								<thead>
									<tr>
										<th>Item Code</th>
										<th>Product Desc</th>
										<th>Package</th>
										<th>Qty</th>
										<th>Sel</th>
									</tr>
								</thead>
							   <tbody>
							     <tr>
									<td>A000000001</td>
					           		<td>Prolo telomeres anti-oxidauil ....</td>
					           		<td></td>
					           		<td><input type="number" name="quantity" min="1" max="999" value="1"></td>
					           		<td><input type="checkbox"></td>
							     </tr>  
							     <tr>
									<td>A000000002</td>
					           		<td>Second Generation of MT-1000</td>
					           		<td></td>
					           		<td><input type="number" name="quantity" min="1" max="999" value="1"></td>
					           		<td><input type="checkbox"></td>
							     </tr> 		
							     <tr>
									<td>A000000003</td>
					           		<td>Preulsor of a miracle moleeule</td>
					           		<td></td>
					           		<td><input type="number" name="quantity" min="1" max="999" value="1"></td>
					           		<td><input type="checkbox"></td>
							     </tr>					     										       												     													     										     												           
							   </tbody>
							 </table>
						</div>
						<div class="text-center">						
							<div id="pagination">
								<div>Dispaly results: <strong>1-10</strong> of <strong>20</strong></div>
								<ul class="pagination pagination-sm">
								  <li class="disabled"><a href="#"><span class="glyphicon glyphicon-step-backward" style="line-height: inherit;"></span></a></li>
								  <li class="disabled"><a href="#"><span class="glyphicon glyphicon-backward" style="line-height: inherit;"></span></a></li>
								  <li class="active"><a href="#">1</a></li>
								  <li><a href="#">2</a></li>
								  <li><a href="#">3</a></li>
								  <li><a href="#">4</a></li>
								  <li><a href="#">5</a></li>
								  <li><a href="#"><span class="glyphicon glyphicon-forward" style="line-height: inherit;"></span></a></li>
								  <li><a href="#"><span class="glyphicon glyphicon-step-forward" style="line-height: inherit;"></span></a></li>
								</ul>								
							</div>
						</div>					
				</div>
				<div class="modal-footer">					
					<button type="button" class="btn btn-primary">Submit</button>
				</div>
			</div>
		</div>
	</div>
	 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>