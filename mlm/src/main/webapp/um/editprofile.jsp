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
						 	<li class="active"><a href="editprofile.jsp">Edit Profile</a></li>
						 	<li><a href="modifypassword.jsp">Modify Password</a></li>
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
								<div class="h2">Edit Your Profile</div>
							</div>
						</div>									
						<div id="individual">
							<div class="row">
								<div class="col-md-12">															
									<form class="form-horizontal" role="form" action="">
										<div class="subtitle" >Personal
											Information</div>
										<div class="form-group">
											<label for="firstname" class="col-sm-3 control-label">First
												Name:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="firstname">
											</div>
										</div>
										<div class="form-group">
											<label for="lastname" class="col-sm-3 control-label">Last
												Name:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="lastname">
											</div>
										</div>
										<div class="form-group">
											<label for="gender" class="col-sm-3 control-label">Gender:</label>
											<div class="col-sm-4">
												<label class="radio-inline"> <input type="radio"
													name="optionsgender" value="Male" checked>Male
												</label> <label class="radio-inline"> <input type="radio"
													name="optionsgender" value="Female">Female
												</label>
											</div>
										</div>
										<div class="form-group">
											<label for="birthday" class="col-sm-3 control-label">Date
												of Birth:</label>
											<div class="col-sm-3">
												<input type="date" class="form-control" id="birthday">
											</div>
										</div>
										<div class="form-group">
											<label for="ssn" class="col-sm-3 control-label">SSN:</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="ssn">
											</div>
										</div>
										<div class="subtitle">Contact
											Information</div>
										<div class="form-group">
											<label for="address" class="col-sm-3 control-label">Address:
											</label>
											<div class="col-sm-6">												
												<textarea id="address" class="form-control" rows="2"></textarea>												
											</div>
										</div>											
										<div class="form-group">
											<label for="country" class="col-sm-3 control-label">Country:
											</label>
											<div class="col-sm-3">												
												<select class="form-control">
												    <option>Canada</option>
												    <option>US</option>
												</select>
											</div>
										</div>												
										<div class="form-group">
											<label for="state" class="col-sm-3 control-label">State/Province:
											</label>
											<div class="col-sm-3">												
												<select class="form-control">
												    <option>Quebec</option>
												    <option>Ontario</option>
												    <option>British Columbia</option>
												    <option>Alberta</option>
												    <option>Nova Scotia</option>
												    <option>Newfoundland and Labrador</option>
												    <option>Saskatchewan</option>
												    <option>Manitoba</option>
												    <option>New Brunswick Canada</option>
												    <option>Prince Edward Island(PEI)</option>
												</select>
											</div>
										</div>	
										<div class="form-group">
											<label for="city" class="col-sm-3 control-label">City:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="city">
											</div>
										</div>										
										<div class="form-group">
											<label for="zip" class="col-sm-3 control-label">Zip:
											</label>
											<div class="col-sm-3">
												<input type="text" class="form-control" id="zip">
											</div>
										</div>											
										<div class="form-group">
											<label for="mobilephone" class="col-sm-3 control-label">Mobile Phone:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="mobilephone">
											</div>
										</div>										
										<div class="form-group">
											<label for="officephone" class="col-sm-3 control-label">Phone(o):
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="officephone">
											</div>
										</div>											
										<div class="form-group">
											<label for="email" class="col-sm-3 control-label">E-mail:
											</label>
											<div class="col-sm-4">
												<input type="email" class="form-control" id="email">
											</div>
										</div>
										<br/><br/>											
										<div class="form-group">
											<div class="col-sm-offset-4 col-sm-4">
												<button type="submit" class="btn btn-primary">Save</button>
											</div>																				
										</div>
									</form>								
								</div>
							</div>										
						</div>
						<div id="corporate">
							<div class="row">
								<div class="col-md-12">															
									<form class="form-horizontal" role="form" action="">
										<div class="subtitle" >Company
											Information</div>
										<div class="form-group">
											<label for="c_companyname" class="col-sm-3 control-label">Company
												Name:
											</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" id="c_companyname">
											</div>
										</div>
										<div class="form-group">
											<label for="c_companytype" class="col-sm-3 control-label">Company Type:
											</label>
											<div class="col-sm-3">												
												<select class="form-control">
												    <option>Sole Proprietorship</option>
												    <option>Partnership</option>
												    <option>Corporation</option>
												    <option>Cooperative</option>
												</select>
											</div>
										</div>											
										<div class="subtitle">Contact
											Information</div>
										<div class="form-group">
											<label for="c_address" class="col-sm-3 control-label">Address:
											</label>
											<div class="col-sm-6">												
												<textarea id="c_address" class="form-control" rows="2"></textarea>												
											</div>
										</div>											
										<div class="form-group">
											<label for="c_country" class="col-sm-3 control-label">Country:
											</label>
											<div class="col-sm-3">												
												<select class="form-control">
												    <option>Canada</option>
												    <option>US</option>
												</select>
											</div>
										</div>												
										<div class="form-group">
											<label for="c_state" class="col-sm-3 control-label">State/Province:
											</label>
											<div class="col-sm-3">												
												<select class="form-control">
												    <option>Quebec</option>
												    <option>Ontario</option>
												    <option>British Columbia</option>
												    <option>Alberta</option>
												    <option>Nova Scotia</option>
												    <option>Newfoundland and Labrador</option>
												    <option>Saskatchewan</option>
												    <option>Manitoba</option>
												    <option>New Brunswick Canada</option>
												    <option>Prince Edward Island(PEI)</option>
												</select>
											</div>
										</div>	
										<div class="form-group">
											<label for="c_city" class="col-sm-3 control-label">City:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="c_city">
											</div>
										</div>										
										<div class="form-group">
											<label for="c_zip" class="col-sm-3 control-label">Zip:
											</label>
											<div class="col-sm-3">
												<input type="text" class="form-control" id="c_zip">
											</div>
										</div>											
										<div class="form-group">
											<label for="c_mobilephone" class="col-sm-3 control-label">Mobile Phone:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="c_mobilephone">
											</div>
										</div>										
										<div class="form-group">
											<label for="c_officephone" class="col-sm-3 control-label">Phone(o):
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="c_officephone">
											</div>
										</div>											
										<div class="form-group">
											<label for="c_email" class="col-sm-3 control-label">E-mail:
											</label>
											<div class="col-sm-4">
												<input type="email" class="form-control" id="c_email">
											</div>
										</div>		
										<br/><br/>																					
										<div class="form-group">
											<div class="col-sm-offset-4 col-sm-4">
												<button type="submit" class="btn btn-primary">Save</button>
											</div>																			
										</div>
									</form>								
								</div>
							</div>						
						</div>	 <!-- end company -->																													
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