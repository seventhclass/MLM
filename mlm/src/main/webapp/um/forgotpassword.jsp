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
	<link href="../css/reset.css" rel="stylesheet" type="text/css" />
	<link href="../css/style.css" rel="stylesheet" type="text/css" />
	<link href="../css/style-forgotpass.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->
</head>
<body>
	<div class="ctn-box">
	 	<div id="backgroundbox">
	 		<img src="../images/h3.png" alt="">
	 	</div>
	 	<div id="contentbox">
			 <div class="container">
			 	<div class="row">
					<div class="col-md-6">
						<div class="panel panel-default">
					   		<div class="panel-heading text-center h2">	
					   			Milleans<img style='width: 20px; height: 25px' src='../images/logo/logo.png' alt=''>					   									   			
				   			</div>
						    <div class="panel-body">
						    	<div class="h3 text-center">
						    		Change your password
						    	</div>
						    	<div class="text-danger">&nbsp;
						    	</div>
								<form class="form-horizontal" role="form" action="">
									<div class="form-group">
										<div class="col-sm-9">
											<input type="email" class="form-control" id="email"
												placeholder="Email address">
										</div>
										<div class="col-sm-2">
											<button type="submit" class="btn btn-primary">Continue</button>
										</div>									
									</div>
								</form>					    
							</div>
						</div>
					</div>
				</div>
			</div><!-- end container -->
		</div><!-- end content box -->
	</div><!-- end container-box -->
	<div id="footer">		  			
		<div class="text-center">
			<%@ include file="../includes/footer.jsp"%>
		</div>
	</div>
	 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>