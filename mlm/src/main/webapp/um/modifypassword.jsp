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
						 	<li class="active"><a href="modifypassword.jsp">Modify Password</a></li>
						 	<li><a href="##">Search Member</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="orderentry.jsp">Order Entry</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="paymenttype.jsp">Payment Types</a></li>
						    <li class="nav-divider"></li>
						    <li><a href="autoship.jsp">AutoShip</a></li>
						    <li><a href="autoshiplist.jsp">AutoShip List</a></li>
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
								<div class="h2">Modify Password</div>
							</div>
						</div>									
						<div class="row">
							<div class="col-md-12">															
								<form class="form-horizontal" role="form" action="">
									<div class="subtitle" >Modify Password Section</div>
									<div class="form-group">
										<label for="password" class="col-sm-3 control-label">Old Password:</label>
										<div class="col-sm-4">
											<input type="password" class="form-control" id="password">
										</div>
									</div>
									<div class="form-group">
										<label for="newpassword1" class="col-sm-3 control-label">New Password:</label>
										<div class="col-sm-4">
											<input type="password" class="form-control" id="newpassword1">
										</div>
									</div>									
									<div class="form-group">
										<label for="newpassword2" class="col-sm-3 control-label">Confirm
											Password:
										</label>
										<div class="col-sm-4">
											<input type="password" class="form-control" id="newpassword2">
										</div>
									</div>										
									<br/><br/>											
									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-2">
											<button type="submit" class="btn btn-primary">Modify</button>
										</div>		
										<div class="col-sm-2">
											<a href="modifypassword.jsp"><button type="button" class="btn btn-primary">Reset</button></a>
										</div>																													
									</div>
								</form>								
							</div>
						</div>										
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