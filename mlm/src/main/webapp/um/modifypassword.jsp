<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Welcome to MilleanVie Science</title>
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
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/modifypassword.js"></script>		
</head>
<body>
	 <div class="container">
		<div id="header">
			<%@ include file="../includes/header.jsp"%>
		</div> <!-- end header -->
		<div id="page">
			<div class="row">
				<div class="col-md-3">
					<div id="left">
						<%@ include file="../includes/nav-left.jsp"%>			
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
								<form id="modifypassForm" class="form-horizontal" role="form" action="">
									<div class="subtitle" >Modify Password Section</div>
									<div class="form-group">
										<label for="password" class="col-sm-3 control-label">Old Password:</label>
										<div class="col-sm-4">
											<input type="password" class="form-control" id="password" name="password">
										</div>
										<div id="errmsg_opass" class="col-sm-5 text-danger"></div>
									</div>
									<div class="form-group">
										<label for="newpassword1" class="col-sm-3 control-label">New Password:</label>
										<div class="col-sm-4">
											<input type="password" class="form-control" id="newpassword1" name="newpassword1">
										</div>
										<div id="errmsg_npass" class="col-sm-5 text-danger"></div>
									</div>									
									<div class="form-group">
										<label for="newpassword2" class="col-sm-3 control-label">Confirm
											Password:
										</label>
										<div class="col-sm-4">
											<input type="password" class="form-control" id="newpassword2">
										</div>
										<div id="errmsg_cpass" class="col-sm-5 text-danger"></div>
									</div>	
									<div class="form-group">
										<div id="response" class="col-sm-offset-1 col-sm-10 alert alert-danger" role="alert"></div> 
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
			<%@ include file="../includes/footer.jsp"%>
		</div>
	</div>
	 	 
	<%--<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>--%>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>