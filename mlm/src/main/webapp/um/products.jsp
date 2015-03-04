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
					<form class="form-horizontal" role="form" action="">
						<div class="form-group">
							<div class="col-sm-8">
								<input type="text" class="form-control" id="p_search"
									placeholder="Search">
							</div>
							<div class="col-sm-4">
								<button type="submit" class="btn btn-danger">Go</button>
								<a href="myshoppingcart.jsp"><button type="button" class="btn"><span class="glyphicon glyphicon-shopping-cart"></span> Shopping Cart <span class="badge">2</span></button></a>
							</div>														
						</div>
					</form>
				</div>			
			</div>
		</div>
		<div id="page">
			<div class="row">
				<div class="col-md-3">
					<div id="left">
						<div class="btn-group-vertical">
							<button class="btn btn-success" type="button">Anti-Aging             </button>
							<button class="btn btn-success" type="button">Life Extension         </button>
							<button class="btn btn-success" type="button">Brain Health           </button>
							<button class="btn btn-success" type="button">Energy & Performance   </button>
							<button class="btn btn-success" type="button">Wealth Creation        </button>
						</div>
					</div>
				</div>
				<div class="col-md-9">
					<div id="content">
						<div id="shopwindow">
							<div class="row">
								<div class="col-xs-6 col-md-4">
									<a href="#" class="thumbnail"> <img
										src="../images/products/product1.png"
										style="height: 200px; width: 150px; display: block;" alt="">
									</a>
									<div class="caption">
										<h3>MT-1000</h3>
										<p>Prolo telomeres anti-oxidauil ....</p>
										<p>90 Counts</p>
										<p>Reatil 99.00$ / Assoc 58$ / 40BV</p>
										<p>
											Quantity:<input type="number" name="quantity" min="0"
												max="999" value="0"> <a href="cart.jsp"
												class="btn btn-danger"><span
												class="glyphicon glyphicon-shopping-cart"></span>Add to Cart</a>
										</p>
									</div>
								</div>
								<div class="col-xs-6 col-md-4">
									<a href="#" class="thumbnail"> <img
										src="../images/products/product1.png"
										style="height: 200px; width: 150px; display: block;" alt="">
									</a>
									<div class="caption">
										<h3>MT-1000B</h3>
										<p>Second Generation of MT-1000</p>
										<p>25 Counts</p>
										<p>Reatil 41.00$ / Assoc 31$ / 20BV</p>
										<p>
											Quantity:<input type="number" name="quantity" min="0"
												max="999" value="0"> <a href="cart.jsp"
												class="btn btn-danger"><span
												class="glyphicon glyphicon-shopping-cart"></span>Add to Cart</a>
										</p>
									</div>
								</div>
								<div class="col-xs-6 col-md-4">
									<a href="#" class="thumbnail"> <img
										src="../images/products/product1.png"
										style="height: 200px; width: 150px; display: block;" alt="">
									</a>
									<div class="caption">
										<h3>Rejwvienator</h3>
										<p>Preulsor of a miracle moleeule</p>
										<p>30 Counts</p>
										<p>Reatil 82.00$ / Assoc 62$ / 40BV</p>
										<p>
											Quantity:<input type="number" name="quantity" min="0"
												max="999" value="0"> <a href="cart.jsp"
												class="btn btn-danger"><span
												class="glyphicon glyphicon-shopping-cart"></span>Add to Cart</a>
										</p>
									</div>
								</div>
							</div>
						</div> <!-- end shopwindow -->
						<div id="pagination">
							<div class="row text-center">
								<div class="col-md-12">
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