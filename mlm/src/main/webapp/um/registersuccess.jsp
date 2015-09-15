<%@ page import="com.milleans.model.User" %>
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
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/mlm.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/registersuccess.js"></script>		
</head>
<body>
	<%
		User user=(User)request.getAttribute("user");
	%>
	 <div class="container">
		<div id="header">
			<%@ include file="../includes/header.jsp"%>
		</div> <!-- end header -->
		<div id="page">
			<div class="row">
<%-- 				<div class="col-md-3">
					<div id="left">
						<%@ include file="../includes/nav-left.jsp"%>			
					</div>
				</div> --%>
				<div class="col-md-offset-2 col-md-8 ">
					<div id="content">
						<div class="row">
							<div class="col-md-12">
								<div class="h2">New Member Sign Up</div>
							</div>
						</div>
						<br/>
						<div class="row">
							<div class="col-md-12">
								<div class="alert alert-success" role="alert"><strong>Congratulations <% String username; username=(user.getCompanyName()!=""&&user.getCompanyName()!=null) ? user.getCompanyName() : user.getLastName()+" "+user.getFirstName(); out.print(username);  %>!</strong> You have successfully registered member.</div>
								<div>Your member id is: <strong id="memberid" style="color:red"><%=user.getUserId()%></strong> keep in mind,plese.</div>
								<div>At the same time we have sent the registration information to your mailbox(<strong style="color:blue"><%=user.getEmail()%></strong>), please check and properly preserved.</div>
								<div>Thank you!</div>
							</div>
						</div> 
						<div class="row text-center">
							<div id="regsuccess" >
								<div class="col-md-12">
									<button id="goLogin_btn" type="button" class="btn btn-primary">OK</button>
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
			<%@ include file="../includes/footer.jsp"%>
		</div>
	</div>
	 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>