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
			<div class="row">
				<div class="col-md-12">
					<ol class="breadcrumb">						
						<li><a href="selectautoship.jsp">Select autoship</a></li>
						<li class="active">Select an account</li>
					</ol>
				</div>
			</div>
		</div> <!-- end header -->
		<div id="page">
			<div class="row">
				<div class="col-md-3">
					<div id="left">
						<ul class="nav nav-pills nav-stacked">
						    <li class="active"><a href="selectautoship.jsp">New Member Sign Up</a></li>
						 	<li><a href="editprofile.jsp">Edit Profile</a></li>
						 	<li><a href="modifypassword.jsp">Modify Password</a></li>	
						 	<li><a href="##">Search Member</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="##">Order Entry</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="##">Payment Types</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="##">AutoShip</a></li>
						    <li><a href="##">AutoShip List</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="##">Product Maintenance</a></li>
						    <li><a href="##">Country Maintenance</a></li>
						    <li><a href="##">Currency Maintenance</a></li>
		  				 	<li><a href="##">Address Maintenance</a></li>
						</ul>			
					</div>
				</div>
				<div class="col-md-9">
					<div id="content">
						<div class="row">
							<div class="col-md-12">
								<div class="h2">New Member Sign Up</div>
							</div>
						</div>
						<br/>
						<div class="row">
							<div class="col-md-12">
								<div class="panel panel-primary">
									<div class="panel-heading">Select an account</div>
									<div class="panel-body">
										<div class="radio">
											<label>
												<input type="radio" name="optionsRadios" id="account1" value="1" checked>Associate Account (with AutoShip) $28 Annual Membership Cost - If you like to have the lowest possible product pricing and have the possibility to make a substantial income in the process then this is the best choice for you! Get scheduled delivery of your favorite products, paks at our lowest prices, which reflect special rewards pricing on select items. Also, enjoy the benefits of our generous Compensation Plan and exclusive special promotions. 
											</label>
										</div>										
										<br/>
										<div class="radio">
											<label>
												<input type="radio" name="optionsRadios" id="account2" value="2" >Preferred Customer Account (with AutoShip) $28 Annual Membership Cost - If you are not interested in the income opportunity but still want scheduled delivery of your favorite products at wholesale prices, then this is a good choice for you! Should you decide that you don not want to pass up the chance to earn some extra cash, then upgrade to Associate Status at no additional cost anytime within your first two years. 
											</label>
										</div>	
										<br/>
										<div class="radio">
											<label>
												<input type="radio" name="optionsRadios" id="account3" value="3" >Preferred Customer Account (without Autoship) $38 Annual Membership Cost If you are not interested in the income opportunity but want to enjoy wholesale prices on products when you place your order each month, then this is the choice for you! Should you decide that you don not want to pass up the chance to earn some extra cash, then upgrade to Associate Status at no additional cost anytime within your first two years. 
											</label>
										</div>																													
									</div>									
								</div>
							</div>
						</div>			
						<div class="row text-center">
							<div class="col-md-3"></div>
							<div class="col-md-3">
								<a href="selectautoship.jsp"><button class="btn btn-primary" type="button" >Back</button></a>							
							</div>
							<div class="col-md-3">
								<a href="registration.jsp?aship=no"><button class="btn btn-primary" type="button" >Next</button></a>
							</div>
							<div class="col-md-3"></div>								 								 							
						</div>
					</div>					
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