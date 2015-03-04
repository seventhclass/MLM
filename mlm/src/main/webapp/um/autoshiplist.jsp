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
				      		<li><a href="products.jsp">Products</a></li>
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
						<a href="orderentry.jsp"><button type="button" class="btn"><span class="glyphicon glyphicon-list-alt"></span> My Order </button></a>
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
						    <li><a href="orderentry.jsp">Order Entry</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="paymenttype.jsp">Payment Types</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="autoship.jsp">AutoShip</a></li>
						    <li class="active"><a href="##">AutoShip List</a></li>
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
						<div class="row">
							<div class="col-md-12">
								<div class="subtitle" >Autoship List</div>
							</div>														
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="table-responsive ordertable">
									<table class="table">
										<thead>
											<tr>
												<th>Member ID</th>
												<th>Name</th>
												<th>Volume of Shipping</th>
												<th>Date of Shipping</th>
												<th>Method of Payment</th>
											</tr>
										</thead>
									   <tbody>
									     <tr>									     	
											<td>A000000001</td>
							           		<td>Michael</td>
							           		<td>145</td>
							           		<td>Feb 21, 2015</td>
							           		<td>Credit Card</td>
									     </tr> 
									     <tr>									     	
											<td>A000000002</td>
							           		<td>Leo</td>
							           		<td>145</td>
							           		<td>Feb 22, 2015</td>
							           		<td>Credit Card</td>
									     </tr>  
									     <tr>									     	
											<td>A000000003</td>
							           		<td>Jack</td>
							           		<td>137</td>
							           		<td>Feb 21, 2015</td>
							           		<td>Paypal</td>
									     </tr>  
									     <tr>									     	
											<td>A000000004</td>
							           		<td>Cavin</td>
							           		<td>95</td>
							           		<td>Feb 23, 2015</td>
							           		<td>Credit Card</td>
									     </tr>  
									     <tr>									     	
											<td>A000000005</td>
							           		<td>William</td>
							           		<td>110</td>
							           		<td>Feb 23, 2015</td>
							           		<td>Paypal</td>
									     </tr>  
									     <tr>									     	
											<td>A000000006</td>
							           		<td>Marie</td>
							           		<td>236</td>
							           		<td>Feb 24, 2015</td>
							           		<td>Paypal</td>
									     </tr>  									     									     									     
									   </tbody>
									 </table>
								</div>														
							</div>
						</div>																						
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
	 		 	 	 		 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>