<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Welcome to milleans vie science</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
	<link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/mlm.js"></script>		
</head>
<body>
	 <div class="container">
		<div id="header">
			<%@ include file="../includes/header.jsp"%>
		</div> <!-- end header -->
		<div id="page">
			<div class="row">
				<%-- <div class="col-md-3">
					<div id="left">
						<%@ include file="../includes/nav-left.jsp"%>			
					</div>
				</div> --%>
				<div class="col-md-12">
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
												<input type="radio" name="optionsatype" id="account1" value="2" checked>Associate Account (without AutoShip) $28 Annual Membership Cost - If you like to have the lowest possible product pricing and have the possibility to make a substantial income in the process then this is the best choice for you! Get scheduled delivery of your favorite products, paks at our lowest prices, which reflect special rewards pricing on select items. Also, enjoy the benefits of our generous Compensation Plan and exclusive special promotions. 
											</label>
										</div>										
										<br/>
										<div class="radio">
											<label>
												<input type="radio" name="optionsatype" id="account2" value="3" >Preferred Customer Account (with AutoShip) $28 Annual Membership Cost - If you are not interested in the income opportunity but still want scheduled delivery of your favorite products at wholesale prices, then this is a good choice for you! Should you decide that you don not want to pass up the chance to earn some extra cash, then upgrade to Associate Status at no additional cost anytime within your first two years. 
											</label>
										</div>	
										<br/>
										<div class="radio">
											<label>
												<input type="radio" name="optionsatype" id="account3" value="4" >Preferred Customer Account (without Autoship) $38 Annual Membership Cost If you are not interested in the income opportunity but want to enjoy wholesale prices on products when you place your order each month, then this is the choice for you! Should you decide that you don not want to pass up the chance to earn some extra cash, then upgrade to Associate Status at no additional cost anytime within your first two years. 
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
								<button id="selectatype" class="btn btn-primary" type="button" >Next</button>
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
			<%@ include file="../includes/footer.jsp"%>
		</div>
	</div>
	 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>