<%@ page language='java' contentType='text/html; charset=ISO-8859-1'
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Welcome to milleans vie science</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
	<link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->
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
									<div class="panel-heading">AutoShip</div>
									<div class="panel-body">
										<div class="radio">
											<label>
												<input type="radio" name="optionsRadios" id="optionsRadios1" value="1" checked>Yes,I want to enroll as an Associate and participate in the Autoship Program for an annual fee of $28, which will provide valuable benefits such as
											</label>
										</div>										
										<ul>
										    <li>Reward Pricing. Get the absolute lowest price on all products including the special paks</li>
										    <li>Maintain active status and capture all group order volume within your organization</li>
										    <li>Stay qualified to participate in the compensation program</li>
										    <li>Participate in special and exclusive promotions</li>
										</ul>
										<br/>
										<div class="radio">
											<label>
												<input type="radio" name="optionsRadios" id="optionsRadios2" value="0" >No thanks, please show me other options.
											</label>
										</div>										
									</div>									
								</div>
							</div>
						</div>			
						<div class="row text-center">
							<div class="col-md-12">
								<button id="selectaship" class="btn btn-primary" type="button" >Next</button> 
							</div>
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
	 	 
	<!-- <script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>  -->	
		 
</body>
</html>