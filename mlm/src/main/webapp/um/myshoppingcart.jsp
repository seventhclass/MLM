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
						<a href="orderentry.jsp"><button type="button" class="btn"><span class="glyphicon glyphicon-list-alt"></span> My Order </button></a>
						<button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-shopping-cart"></span> Go Cart Settlement <span class="badge">2</span></button>
					</div>
				</div>
			</div>
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
												   <tbody>
												     <tr>
												       <td rowspan="4"><img src="../images/products/product1.png"
										           style="height: 50px; width: 55px;" alt=""></td>
										           		<td>Mt-1000</td>
												     </tr>    
												     <tr>
										           		<td>Prolo telomeres anti-oxidauil ....</td>
												     </tr>  
												     <tr>
										           		<td>90 Counts</td>
												     </tr> 		
												     <tr>
										           		<td>99.00$ x 1</td>
												     </tr> 
												     <tr>
												       <td rowspan="4"><img src="../images/products/product1.png"
										           style="height: 50px; width: 55px;" alt=""></td>
										           		<td>Mt-1000B</td>
												     </tr>    
												     <tr>
										           		<td>Second Generation of MT-1000</td>
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
											<a href="products.jsp"><button type="button" class="btn btn-primary">Continue Shopping</button></a>
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
			Copyright � 2015 <a href="http://7thclass-smallfoots.rhcloud.com/">7thclass</a> All Rights Reserved.
		</div>
	</div>
	 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>