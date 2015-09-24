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
	<link href="<%=request.getContextPath()%>/css/contactus.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
        <script src="http://maps.googleapis.com/maps/api/js"></script>	
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/contactus.js"></script>	

	<script>
		function initialize() {
		  var mapProp = {
		    center:new google.maps.LatLng(45.5021677,-73.5740518),
		    zoom:5,
		    mapTypeId:google.maps.MapTypeId.ROADMAP
		  };
		  var map=new google.maps.Map(document.getElementById("google-maps"),mapProp);
		}
		google.maps.event.addDomListener(window, 'load', initialize);
	</script>
</head>
<body>
	 <div class="container">
		<div id="header">
			<%@ include file="../includes/header.jsp"%>
		</div> <!-- end header -->
		<div id="page">
			<div class="row">
				<div class="col-md-12">
					<div id="banner">
						<div class="h1 text-center">
							Get <span>In Touch</span> With Us
						</div>
						<div class="h3 text-center">
							See how your business can benefit with<br/> 
							you and your team.
						</div>
					</div> <!-- end content -->					
				</div>
			</div>
			<div class="row">
				<div class="col-md-6 messagebox">
					<form id="contactusForm" class="form-horizontal" role="form" action="" >
						<div class="form-group">
							<label for="fullname" class="col-sm-4 control-label">Full
								Name:<span class="starsymbol">*</span>
							</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="fullname" name="fullname" >
							</div>
						</div>					
						<div class="form-group">
							<label for="email" class="col-sm-4 control-label">E-mail:<span class="starsymbol">*</span>
							</label>
							<div class="col-sm-8">
								<input type="email" class="form-control" id="email" name="email" >
							</div>
						</div>	
						<div class="form-group">
							<label for="phone" class="col-sm-4 control-label">Phone Number:
							</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="phone" name="phone">
							</div>
						</div>	
						<div class="form-group">
							<label for="message" class="col-sm-4 control-label">Your
								Message:
							</label>
							<div class="col-sm-8">
								<textarea class="form-control" rows="10" id="message" name="message" ></textarea>
							</div>
						</div>							
						<div class="form-group">
							<div class="col-sm-offset-5 col-sm-6">
								<button type="submit" class="btn btn-danger btn-lg btnsubmit">Submit</button>
							</div>																				
						</div>						
					</form>
				</div>
				<div class="col-md-6 messagebox">
					<ul class="list-unstyled contactlist">
						<li>
							<span class="glyphicon glyphicon-home" style="color:#5cb85c;font-size:25px;">
							<b>Address</b></span>
							<!-- <div class="content">952 maisonneuve blvd. w, Montreal, Quebec, Canada H3A 0A5</div> -->						
							<div class="content">71 COMMERCIAL ST BOSTON, MA 02109</div>						
						</li>
						<li>
							<span class="glyphicon glyphicon-phone-alt" style="color:#5cb85c;font-size:25px;">
                                                        <b>Phone</b></span>						
							<!-- <div class="content">1-855-251-7833</div> -->
							<div class="content">1-866-617-7702</div>
						</li>
						<!-- <li>
							<span class="glyphicon glyphicon-print" style="color:#5cb85c;font-size:25px;"> 
                                                        <b>Send Us a Fax</b></span>						
							<div class="content">1-800-278-0816</strong></div>
						</li>	 -->					
						<li>
							<span class="glyphicon glyphicon-envelope" style="color:#5cb85c;font-size:25px;">
                                                        <b>Email</b></span>						
							<!-- <div class="content">milleansvie@gmail.com</div> -->
							<div class="content">vitalstate@vitalstatenutraceutical.com</div>
						</li>	
					</ul>
				</div>				
			</div>			
			<div class="row">
			<div id="google-maps"></div>
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