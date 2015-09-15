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
	<link href="<%=request.getContextPath()%>/css/unpaidorders.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/mlm.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/unpaidorders.js"></script>		
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
						<h1 ><small>Please check the orders that have been paid, then click 'Update'.</small></h1>				
						<div id="unpaidorders">
							<div class="list-group">
							    <div class="list-group-item list-group-item-info active"><span class="glyphicon glyphicon-list-alt"></span> Unpaid Orders </div>
							    <div class="list-group-item">
										<div class="table-hover table-striped unpaidordertable">
											<table class="table">
												<thead>
													<tr>
														<th>Order ID</th>
														<th>Member ID</th>
														<th>Order Date</th>
														<th>Name</th>
														<th>Amount</th>
														<th class="text-center">Paid&nbsp;&nbsp;<input type='checkbox' onclick="_chooseAll(this,'payornot[]')"/></th>
													</tr>
												</thead>
											   <tbody id="unpaidOrderList">
											   </tbody>
											 </table>
										</div>	
										<div id="update_orders" class="text-center">
											<button type="button" class="btn btn-primary upd_payment_btn">Update</button>
										</div>
								</div>	
							</div>
						</div> <!-- end orderentry -->							
					</div> <!-- end content -->		
				</div>			
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