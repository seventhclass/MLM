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
						    <li class="active"><a href="##">Payment Types</a></li>
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
								<div class="col-sm-6">
									<div class="subtitle" >Payment Type Summary</div>
								</div>
								<div class="col-sm-6">		
									<div class="subtitle" >Distributor: ABCDE00001</div>
								</div>			
							</div>														
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="col-sm-6 text-right">
									Add a new payment type:
								</div>	
								<div class="col-sm-4">																														
									<select id="selectpaymenttype" class="form-control" >
									    <option selected value="0">Please Choose...</option>
									    <option value="1">Credit Card</option>
									    <option value="2">Paypal</option>
									</select>
								</div>		
							</div>							
						</div>
						<div id="paymenttypelist">						
							<div class="row">
								<div id="pt_list_title" class="col-md-8">
									<div class="h4" >ABCDE00001 has the following accounts stored in the system:</div>
								</div>								
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="panel panel-danger">
										<div class="panel-heading">Payment Type: <strong>Credit Card</strong></div>
										<div class="panel-body">
											<form class="form-horizontal" role="form" action="">	
												<div class="form-group">
													<label for="firstname" class="col-sm-offset-1 col-sm-3 control-label">First
														Name:</label>
													<div class="col-sm-4">
														<input type="text" class="form-control" id="firstname" value="Michael">
													</div>
												</div>
												<div class="form-group">
													<label for="lastname" class="col-sm-offset-1 col-sm-3 control-label">Last
														Name:</label>
													<div class="col-sm-4">
														<input type="text" class="form-control" id="lastname" value="Wang">
													</div>
												</div>		
												<div class="form-group">
													<label for="cardno" class="col-sm-offset-1 col-sm-3 control-label">Card number:</label>
													<div class="col-sm-4">
														<input type="text" class="form-control" id="cardno" value="12345678901234">
													</div>
												</div>																																	
												<div class="form-group">
													<label for="bankname" class="col-sm-offset-1 col-sm-3 control-label">Bank Name:
													</label>
													<div class="col-sm-3">												
														<select class="form-control">
														    <option selected>Royal Bank Canada</option>
														    <option>BMO Bank</option>
														    <option>TD Bank</option>
														</select>
													</div>
												</div>
												<div class="form-group">
													<label for="cscno" class="col-sm-offset-1 col-sm-3 control-label">Card Security Code(CSC):</label>
													<div class="col-sm-4">
														<input type="text" class="form-control" id="cscno" value="123">
													</div>
												</div>										
												<div class="form-group">										
													<div class="col-sm-offset-1 col-sm-7 text-right">
														<input type="checkbox" name="defaultaccount" checked> This is the Default Account	
													</div>
												</div>																																																								
											</form>												
										</div>
										<div class="panel-footer text-right">
											<button type="submit" class="btn btn-success">Save</button>	
											<button type="submit" class="btn btn-danger">Delete</button>																			
										</div>
									</div>	
									<div class="panel panel-danger">
										<div class="panel-heading">Payment Type: <strong>Credit Card</strong></div>
										<div class="panel-body">
											<form class="form-horizontal" role="form" action="">	
												<div class="form-group">
													<label for="firstname" class="col-sm-offset-1 col-sm-3 control-label">First
														Name:</label>
													<div class="col-sm-4">
														<input type="text" class="form-control" id="firstname" value="Michael">
													</div>
												</div>
												<div class="form-group">
													<label for="lastname" class="col-sm-offset-1 col-sm-3 control-label">Last
														Name:</label>
													<div class="col-sm-4">
														<input type="text" class="form-control" id="lastname" value="Wang">
													</div>
												</div>		
												<div class="form-group">
													<label for="cardno" class="col-sm-offset-1 col-sm-3 control-label">Card number:</label>
													<div class="col-sm-4">
														<input type="text" class="form-control" id="cardno" value="22210214998332">
													</div>
												</div>																																	
												<div class="form-group">
													<label for="bankname" class="col-sm-offset-1 col-sm-3 control-label">Bank Name:
													</label>
													<div class="col-sm-3">												
														<select class="form-control">
														    <option>Royal Bank Canada</option>
														    <option selected>BMO Bank</option>
														    <option>TD Bank</option>
														</select>
													</div>
												</div>
												<div class="form-group">
													<label for="cscno" class="col-sm-offset-1 col-sm-3 control-label">Card Security Code(CSC):</label>
													<div class="col-sm-4">
														<input type="text" class="form-control" id="cscno" value="321">
													</div>
												</div>										
												<div class="form-group">										
													<div class="col-sm-offset-1 col-sm-7 text-right">
														<input type="checkbox" name="defaultaccount" > This is the Default Account	
													</div>
												</div>																																																								
											</form>												
										</div>
										<div class="panel-footer text-right">
											<button type="submit" class="btn btn-success">Save</button>	
											<button type="submit" class="btn btn-danger">Delete</button>																			
										</div>
									</div>	
									<div class="panel panel-danger">
										<div class="panel-heading">Payment Type: <strong>Paypal</strong></div>
										<div class="panel-body">
											<form class="form-horizontal" role="form" action="">	
												<div class="form-group">
													<label for="username" class="col-sm-offset-1 col-sm-3 control-label">User
														Name:</label>
													<div class="col-sm-4">
														<input type="text" class="form-control" id="firstname" value="Michael@gmail.com">
													</div>
												</div>
												<div class="form-group">
													<label for="password" class="col-sm-offset-1 col-sm-3 control-label">Password:</label>
													<div class="col-sm-4">
														<input type="password" class="form-control" id="password" value="123456">
													</div>
												</div>		
												<div class="form-group">
													<label for="password2" class="col-sm-offset-1 col-sm-3 control-label">Confirm Password:</label>
													<div class="col-sm-4">
														<input type="password" class="form-control" id="password2" value="123456">
													</div>
												</div>	
												<div class="form-group">										
													<div class="col-sm-offset-1 col-sm-7 text-right">
														<input type="checkbox" name="defaultaccount" > This is the Default Account	
													</div>
												</div>																																																																			
											</form>												
										</div>
										<div class="panel-footer text-right">
											<button type="submit" class="btn btn-success">Save</button>	
											<button type="submit" class="btn btn-danger">Delete</button>																			
										</div>
									</div>																																
								</div>
							</div>							
						</div> <!-- end paymenttypelist -->													
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
	 		
	<div id="addnewcreditcard" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<h4 class="modal-title text-center">Adding New Payment Information</h4>
				</div>
				<div class="modal-body">
					<div class="subtitle" >Credit Card Information</div>
					<div id="newcreditcardinfo">
						<form class="form-horizontal" role="form" action="">	
							<div class="form-group">
								<label for="newfirstname" class="col-sm-offset-1 col-sm-3 control-label">First
									Name:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="newfirstname">
								</div>
							</div>
							<div class="form-group">
								<label for="newlastname" class="col-sm-offset-1 col-sm-3 control-label">Last
									Name:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="newlastname">
								</div>
							</div>		
							<div class="form-group">
								<label for="newcardno" class="col-sm-offset-1 col-sm-3 control-label">Card number:</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="newcardno">
								</div>
							</div>																																	
							<div class="form-group">
								<label for="newbankname" class="col-sm-offset-1 col-sm-3 control-label">Bank Name:
								</label>
								<div class="col-sm-3">												
									<select class="form-control" id="newbankname">
									    <option value="1">Royal Bank Canada</option>
									    <option value="2">BMO Bank</option>
									    <option value="3">TD Bank</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label for="newcscno" class="col-sm-offset-1 col-sm-3 control-label">Card Security Code(CSC):</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="newcscno">
								</div>
							</div>										
							<div class="form-group">										
								<div class="col-sm-offset-1 col-sm-7 text-right">
									<input type="checkbox" name="defaultaccount" > This is the Default Account	
								</div>
							</div>																																																								
						</form>												
					</div>
				</div>
				<div class="modal-footer">					
					<button type="submit" class="btn btn-primary"> Add <span class="glyphicon glyphicon-plus-sign"></span></button>
				</div>
			</div>
		</div>
	</div>
	 		 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>