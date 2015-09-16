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
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/registration.js"></script>
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
								<div class="h2" >Adminstrator Sign Up</div>
							</div>
						</div>
						<br/>
						<div class="row">
							<div class="col-md-11">
								<div id="response" class="alert alert-danger" role="alert"></div> 
							</div>
						</div>	
						<div id="admin">
							<div class="row">
								<div class="col-md-12">															
									<form id="adminregForm" class="form-horizontal" role="form" action="<%=request.getContextPath()%>/signUp?type=admin" method="post">
										<div class="subtitle" >Personal
											Information</div>
										<input type="hidden" class="form-control accounttype" id="accountid" name="accountid">
										<div class="form-group">
											<label for="adminfirstname" class="col-sm-3 control-label">First
												Name<span class="starsymbol">*</span>
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="adminfirstname" name="firstname"
													placeholder="Enter your first name, please">
											</div>
											<div id="errmsg_afname" class="col-sm-5 text-danger"></div>
										</div>
										<div class="form-group">
											<label for="adminlastname" class="col-sm-3 control-label">Last
												Name<span class="starsymbol">*</span>
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="adminlastname" name="lastname"
													placeholder="Enter your last name, please">
											</div>
											<div id="errmsg_alname" class="col-sm-5 text-danger"></div>
										</div>
										<div class="form-group">
											<label for="admingender" class="col-sm-3 control-label">Gender<span
												class="starsymbol">*</span></label>
											<div class="col-sm-4">
												<label class="radio-inline"> <input type="radio"
													name="optionsgender" value="Male" checked>Male
												</label> <label class="radio-inline"> <input type="radio"
													name="optionsgender" value="Female">Female
												</label>
											</div>
										</div>
										<div class="form-group">
											<label for="adminbirthday" class="col-sm-3 control-label">Date
												of Birth</label>
											<div class="col-sm-3">
												<input type="date" class="form-control" id="adminbirthday" name="birthday">
											</div>
										</div>
										<div class="form-group">
											<label for="adminpassword1" class="col-sm-3 control-label">Password<span
												class="starsymbol">*</span></label>
											<div class="col-sm-4">
												<input type="password" class="form-control" id="adminpassword1" name="password1">
											</div>
											<div id="errmsg_apass" class="col-sm-5 text-danger"></div>
										</div>
										<div class="form-group">
											<label for="adminpassword2" class="col-sm-3 control-label">Confirm
												Password<span class="starsymbol">*</span>
											</label>
											<div class="col-sm-4">
												<input type="password" class="form-control" id="adminpassword2" name="password2">
											</div>
											<div id="errmsg_acpass" class="col-sm-5 text-danger"></div>
										</div>
										<div class="subtitle">Contact
											Information</div>
										<div class="form-group">
											<label for="adminaddress" class="col-sm-3 control-label">Address<span class="starsymbol">*</span>
											</label>
											<div class="col-sm-4">												
												<textarea id="adminaddress" name="address" class="form-control" rows="2"></textarea>												
											</div>
											<div id="errmsg_aaddress" class="col-sm-5 text-danger"></div>
										</div>	
										<div class="form-group">
											<label for="admincountry" class="col-sm-3 control-label">Country<span class="starsymbol">*</span>
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="admincountry" name="countrycode"
													placeholder="Enter country name, please">
											</div>
											<div id="errmsg_admincountry" class="col-sm-5 text-danger"></div>
										</div>	
										<div class="form-group">
											<label for="adminprovince" class="col-sm-3 control-label">Province<span class="starsymbol">*</span>
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="adminprovince" name="provincecode"
													placeholder="Enter province name, please">
											</div>
											<div id="errmsg_adminprovince" class="col-sm-5 text-danger"></div>
										</div>	
										<div class="form-group">
											<label for="admincity" class="col-sm-3 control-label">City<span class="starsymbol">*</span>
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="admincity" name="city"
													placeholder="Enter city name, please">
											</div>
											<div id="errmsg_admincity" class="col-sm-5 text-danger"></div>
										</div>										
										<div class="form-group">
											<label for="adminzip" class="col-sm-3 control-label">Zip<span class="starsymbol">*</span>
											</label>
											<div class="col-sm-3">
												<input type="text" class="form-control" id="adminzip" name="zip">
											</div>
											<div id="errmsg_adminzip" class="col-sm-5 text-danger"></div>
										</div>											
										<div class="form-group">
											<label for="adminmobilephone" class="col-sm-3 control-label">Mobile Phone<span class="starsymbol">*</span>
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="adminmobilephone" name="mobilephone"
													placeholder="Enter your mobile phone, please">
											</div>
											<div id="errmsg_amphone" class="col-sm-5 text-danger"></div>
										</div>										
										<div class="form-group">
											<label for="adminofficephone" class="col-sm-3 control-label">Phone(o)
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="adminofficephone" name="officephone">
											</div>
										</div>											
										<div class="form-group">
											<label for="adminemail" class="col-sm-3 control-label">E-mail<span class="starsymbol">*</span>
											</label>
											<div class="col-sm-4">
												<input type="email" class="form-control" id="adminemail" name="email"
													placeholder="Enter your email, please">
											</div>
											<div id="errmsg_aemail" class="col-sm-5 text-danger"></div>
										</div>												
										<br/><br/>											
										<div class="form-group">
											<label class="col-sm-7 control-label"><a href="<%=request.getContextPath()%>/um/termcondition.jsp" target="_BLANK">ACCEPT TERMS AND CONDITIONS</a><span class="starsymbol">*</span>
											</label>
											<div class="col-sm-1">
												<input class="policycheck" name="policycheck" type="checkbox" > 
											</div>
										</div>
										<div class="form-group">
											<div class="col-sm-offset-4 col-sm-4">
												<button type="submit" class="btn btn-primary btnsubmit sm_admin" disabled="disabled">Register New Admin</button>
											</div>																				
										</div>
									</form>								
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