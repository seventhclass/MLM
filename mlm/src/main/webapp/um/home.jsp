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
				      		<li class="active"><a href="home.jsp">Home</a></li>
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
		<div id="page">
			<div class="row">
				<div class="col-md-3">
					<div id="left">
						<ul class="nav nav-pills nav-stacked">
						    <li><a href="selectautoship.jsp">New Member Sign Up</a></li>
						 	<li><a href="editprofile.jsp">Edit Profile</a></li>
						 	<li><a href="modifypassword">Modify Password</a></li>
						 	<li><a href="##">Search Member</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="orderentry.jsp">Order Entry</a></li>
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
						<div class="row">
							<div class="col-md-12">
								<div class="h2">Your Profile Summary</div>
							</div>
						</div>									
						<div id="individual">
							<div class="row">
								<div class="col-md-12">															
									<form class="form-horizontal" role="form" action="">
										<div class="subtitle-info" >Personal
											Information</div>
										<div class="form-group">
											<label for="firstname" class="col-sm-3 control-label">First
												Name:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="firstname" disabled>
											</div>
										</div>
										<div class="form-group">
											<label for="lastname" class="col-sm-3 control-label">Last
												Name:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="lastname" disabled>
											</div>
										</div>
										<div class="subtitle-info">Contact
											Information</div>
										<div class="form-group">
											<label for="email" class="col-sm-3 control-label">E-mail:
											</label>
											<div class="col-sm-4">
												<input type="email" class="form-control" id="email" disabled>
											</div>
										</div>											
										<div class="form-group">
											<label for="mobilephone" class="col-sm-3 control-label">Mobile Phone:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="mobilephone" disabled>
											</div>
										</div>										
										<div class="form-group">
											<label for="officephone" class="col-sm-3 control-label">Phone(o):
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="officephone" disabled>
											</div>
										</div>																					
									</form>								
								</div>
							</div>										
						</div> <!-- end personal -->
						<div id="corporate">
							<div class="row">
								<div class="col-md-12">															
									<form class="form-horizontal" role="form" action="">
										<div class="subtitle-info" >Company
											Information</div>
										<div class="form-group">
											<label for="c_companyname" class="col-sm-3 control-label">Company
												Name:
											</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" id="c_companyname" disabled>
											</div>
										</div>
										<div class="form-group">
											<label for="c_companytype" class="col-sm-3 control-label">Company Type:
											</label>
											<div class="col-sm-3">												
												<input type="text" class="form-control" id="c_companytype" disabled>
											</div>
										</div>											
										<div class="subtitle-info">Contact
											Information</div>
										<div class="form-group">
											<label for="c_email" class="col-sm-3 control-label">E-mail:
											</label>
											<div class="col-sm-4">
												<input type="email" class="form-control" id="c_email" disabled>
											</div>
										</div>											
										<div class="form-group">
											<label for="c_mobilephone" class="col-sm-3 control-label">Mobile Phone:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="c_mobilephone" disabled>
											</div>
										</div>										
										<div class="form-group">
											<label for="c_officephone" class="col-sm-3 control-label">Phone(o):
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="c_officephone" disabled>
											</div>
										</div>																					
									</form>								
								</div>
							</div>										
						</div> <!-- end company -->																													
					</div> <!-- end content -->					
				</div>
			</div>
			<div id="right">
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