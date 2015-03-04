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
				<div class="col-md-1">
					<img style="width: 70px; height: 75px"
						src="../images/logo/logo.png" alt="milleans vie science">
				</div>
				<div class="col-md-11">
					<img style="width: 100%; height: 75px" src="../images/header1.jpg"
						alt="milleans vie science">
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<ol class="breadcrumb">
						<li><a href="home.jsp">Home</a></li>
						<li class="active">Sign in</li>
					</ol>
				</div>
			</div>
		</div> <!-- end header -->
		<div id="page">
			<div class="row">
				<div class="col-md-6">
					<div class="row">
						<div class="col-md-12">
							<h1>Sign In</h1>
							<p>Please enter your member ID and password to sign in</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<form class="form-horizontal" role="form" action="">
								<div class="form-group">
									<label for="inputUser3" class="col-sm-3 control-label">Member
										ID</label>
									<div class="col-sm-8">
										<input type="text" class="form-control" id="inputUser3"
											placeholder="Enter your member ID,please">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword3" class="col-sm-3 control-label">password</label>
									<div class="col-sm-5">
										<input type="password" class="form-control"
											id="inputPassword3" placeholder="Enter your password,please">
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-offset-3 col-sm-8">
										<div class="checkbox">
											<label> <input type="checkbox">Keep me
												logged-in<br />If this is a public or shared device, uncheck
												and sign out when you're done to protect your account.
											</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-offset-3 col-sm-9">
										<button type="submit" class="btn btn-primary">Sign In</button>
										<a class="col-sm-offset-2" href="##"><u>Forgot
												password?</u></a>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
				<div class="col-md-6 ">
					<div class="displaycenter text-center">
						<div class="row">
							<div class="col-md-12">
								<br />
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<h1>Not a registered member?</h1>
								<p>Get started now. It's fast and easy!</p>
								<br />
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<a href="selectautoship.jsp"><button class="btn btn-primary" type="button">Register</button></a>
							</div>
						</div>
					</div>
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