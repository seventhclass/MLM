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
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/editprofile.js"></script>	
</head>
<body>
	 <div class="container">
		<div id="header">
			<%@ include file="../includes/header.jsp"%>
		</div> <!-- end header -->
		<div id="page">
			<div id="welcombar">
				<%@ include file="../includes/welcomebar.jsp"%>
			</div>		
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
								<div class="h2">Edit Your Profile</div>
							</div>
						</div>									
						<div id="individual">
							<div class="row">
								<div class="col-md-12">															
									<form class="form-horizontal" role="form" action="">
										<div class="subtitle" >Personal
											Information</div>
										<div class="form-group">
											<label for="firstname" class="col-sm-3 control-label">First
												Name:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="firstname">
											</div>
										</div>
										<div class="form-group">
											<label for="lastname" class="col-sm-3 control-label">Last
												Name:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="lastname">
											</div>
										</div>
										<div class="form-group">
											<label for="gender" class="col-sm-3 control-label">Gender:</label>
											<div class="col-sm-4">
												<label class="radio-inline"> <input type="radio"
													name="optionsgender" value="Male" checked>Male
												</label> <label class="radio-inline"> <input type="radio"
													name="optionsgender" value="Female">Female
												</label>
											</div>
										</div>
										<div class="form-group">
											<label for="birthday" class="col-sm-3 control-label">Date
												of Birth:</label>
											<div class="col-sm-3">
												<input type="date" class="form-control" id="birthday">
											</div>
										</div>
										<!-- <div class="form-group">
											<label for="ssn" class="col-sm-3 control-label">SSN:</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="ssn">
											</div>
										</div> -->
										<div class="subtitle">Contact
											Information</div>
										<div class="form-group">
											<label for="address" class="col-sm-3 control-label">Address:
											</label>
											<div class="col-sm-6">												
												<textarea id="address" class="form-control" rows="2"></textarea>												
											</div>
										</div>											
										<div class="form-group">
											<label for="country" class="col-sm-3 control-label">Country:
											</label>
											<div class="col-sm-3">												
												<select id="countryid" name="countryid" class="form-control">
												    <option value="86">Canada</option>
												    <option value="87">US</option>
												</select>
											</div>
										</div>												
										<div class="form-group">
											<label for="state" class="col-sm-3 control-label">State/Province:
											</label>
											<div class="col-sm-3">												
												<select id="provinceid" name="provinceid" class="form-control">
												    <option value="QC">Quebec</option>
												    <option value="p002">Ontario</option>
												    <option value="p003">British Columbia</option>
												    <option value="p004">Alberta</option>
												    <option value="p005">Nova Scotia</option>
												    <option value="p006">Newfoundland and Labrador</option>
												    <option value="p007">Saskatchewan</option>
												    <option value="p008">Manitoba</option>
												    <option value="p009">New Brunswick Canada</option>
												    <option value="p010">Prince Edward Island(PEI)</option>
												</select>
											</div>
										</div>	
										<div class="form-group">
											<label for="city" class="col-sm-3 control-label">City:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="city">
											</div>
										</div>										
										<div class="form-group">
											<label for="zip" class="col-sm-3 control-label">Zip:
											</label>
											<div class="col-sm-3">
												<input type="text" class="form-control" id="zip">
											</div>
										</div>											
										<div class="form-group">
											<label for="mobilephone" class="col-sm-3 control-label">Mobile Phone:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="mobilephone">
											</div>
										</div>										
										<div class="form-group">
											<label for="officephone" class="col-sm-3 control-label">Phone(o):
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="officephone">
											</div>
										</div>											
										<div class="form-group">
											<label for="email" class="col-sm-3 control-label">E-mail:
											</label>
											<div class="col-sm-4">
												<input type="email" class="form-control" id="email">
											</div>
										</div>
										<br/><br/>											
										<div class="form-group">
											<div class="col-sm-offset-4 col-sm-4">
												<button type="submit" class="btn btn-primary">Save</button>
											</div>																				
										</div>
									</form>								
								</div>
							</div>										
						</div>
						<div id="corporate">
							<div class="row">
								<div class="col-md-12">															
									<form class="form-horizontal" role="form" action="">
										<div class="subtitle" >Company
											Information</div>
										<div class="form-group">
											<label for="c_companyname" class="col-sm-3 control-label">Company
												Name:
											</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" id="c_companyname">
											</div>
										</div>
										<div class="form-group">
											<label for="c_companytype" class="col-sm-3 control-label">Company Type:
											</label>
											<div class="col-sm-3">												
												<select id="companytype" class="form-control">
												    <option>Sole Proprietorship</option>
												    <option>Partnership</option>
												    <option>Corporation</option>
												    <option>Cooperative</option>
												</select>
											</div>
										</div>											
										<div class="subtitle">Contact
											Information</div>
										<div class="form-group">
											<label for="c_address" class="col-sm-3 control-label">Address:
											</label>
											<div class="col-sm-6">												
												<textarea id="c_address" class="form-control" rows="2"></textarea>												
											</div>
										</div>											
										<div class="form-group">
											<label for="c_country" class="col-sm-3 control-label">Country:
											</label>
											<div class="col-sm-3">												
												<select id="c_countryid" name="c_countryid" class="form-control">
												    <option value="86">Canada</option>
												    <option value="87">US</option>
												</select>
											</div>
										</div>												
										<div class="form-group">
											<label for="c_state" class="col-sm-3 control-label">State/Province:
											</label>
											<div class="col-sm-3">												
												<select id="c_provinceid" name="c_provinceid" class="form-control">
												    <option value="QC">Quebec</option>
												    <option value="p002">Ontario</option>
												    <option value="p003">British Columbia</option>
												    <option value="p004">Alberta</option>
												    <option value="p005">Nova Scotia</option>
												    <option value="p006">Newfoundland and Labrador</option>
												    <option value="p007">Saskatchewan</option>
												    <option value="p008">Manitoba</option>
												    <option value="p009">New Brunswick Canada</option>
												    <option value="p010">Prince Edward Island(PEI)</option>
												</select>
											</div>
										</div>	
										<div class="form-group">
											<label for="c_city" class="col-sm-3 control-label">City:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="c_city">
											</div>
										</div>										
										<div class="form-group">
											<label for="c_zip" class="col-sm-3 control-label">Zip:
											</label>
											<div class="col-sm-3">
												<input type="text" class="form-control" id="c_zip">
											</div>
										</div>											
										<div class="form-group">
											<label for="c_mobilephone" class="col-sm-3 control-label">Mobile Phone:
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="c_mobilephone">
											</div>
										</div>										
										<div class="form-group">
											<label for="c_officephone" class="col-sm-3 control-label">Phone(o):
											</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="c_officephone">
											</div>
										</div>											
										<div class="form-group">
											<label for="c_email" class="col-sm-3 control-label">E-mail:
											</label>
											<div class="col-sm-4">
												<input type="email" class="form-control" id="c_email">
											</div>
										</div>		
										<br/><br/>																					
										<div class="form-group">
											<div class="col-sm-offset-4 col-sm-4">
												<button type="submit" class="btn btn-primary">Save</button>
											</div>																			
										</div>
									</form>								
								</div>
							</div>						
						</div>	 <!-- end company -->																													
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