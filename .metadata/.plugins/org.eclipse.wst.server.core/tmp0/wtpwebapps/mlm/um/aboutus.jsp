<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>>Welcome to milleans vie science</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
	<link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/aboutus.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>	
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/aboutus.js"></script>
</head>

<body>
	 <div class="container">
		<div id="header">
			<%@ include file="../includes/header.jsp"%>
		</div> <!-- end header -->
		<div id="page">
			<h2>Who are we?</h2>
			<div class="media">
				<div class="media-right media-middle">
				<img style="float:right" src="<%=request.getContextPath()%>/images/about/happy.jpg" class="img-thumbnail"/>
				<div class="content-heading"><h3>Who are we?</h3></div>
				<p  style="clear:both">Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
					Duae sunt enim res quoque, ne tu verba solum putes. 
					Istam voluptatem, inquit, Epicurus ignorat? 
					Quia dolori non voluptas contraria est, sed doloris privatio. 
					Egone non intellego, quid sit don Graece, Latine voluptas? 
					Parvi enim primo ortu sic iacent, tamquam omnino sine animo sint. 
					Duo Reges: constructio interrete.</p>
				</div>
			</div>
			
			<h2>What do we do?</h2>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
			Duae sunt enim res quoque, ne tu verba solum putes. 
			Istam voluptatem, inquit, Epicurus ignorat? 
			Quia dolori non voluptas contraria est, sed doloris privatio. 
			Egone non intellego, quid sit don Graece, Latine voluptas? 
			Parvi enim primo ortu sic iacent, tamquam omnino sine animo sint. 
			Duo Reges: constructio interrete.</p>
			<p><a href='<%=request.getContextPath()%>/common/contactus'>Click here to contact us</a>.</p>
			
		</div>
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