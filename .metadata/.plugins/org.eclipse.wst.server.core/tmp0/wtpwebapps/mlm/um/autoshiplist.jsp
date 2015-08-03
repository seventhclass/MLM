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
		<div id="functionbar">
			<%@ include file="../includes/functionbar.jsp"%>
		</div>		
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
								<div class="subtitle" >Autoship List</div>
							</div>														
						</div>
						<div class="ashipdatebox">	
							<div class="row">							
								<div class="col-md-12">
									<label for="ashipdate" class="col-sm-2">Choose Date:</label>
									<div class="col-sm-3">
										<input type="date" id="ashipdate">
									</div>									
									<div class="col-sm-2">
										<button type="submit" class="btn btn-info">Go</button>
									</div>				
								</div>
							</div>
												
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="table-responsive ordertable">
									<table class="table">
										<thead>
											<tr>
												<th>Done</th>
												<th>Member ID</th>
												<th>Name</th>
												<th>Volume of Shipping</th>
												<th>Date of Shipping</th>
												<th>Method of Payment</th>
											</tr>
										</thead>
									   <tbody  id="autoShipList">
									     <!-- <tr>									     	
											<td>A000000001</td>
							           		<td>Michael</td>
							           		<td>145</td>
							           		<td>Feb 21, 2015</td>
							           		<td>Credit Card</td>
									     </tr> 
									     <tr>									     	
											<td>A000000002</td>
							           		<td>Leo</td>
							           		<td>145</td>
							           		<td>Feb 22, 2015</td>
							           		<td>Credit Card</td>
									     </tr>  
									     <tr>									     	
											<td>A000000003</td>
							           		<td>Jack</td>
							           		<td>137</td>
							           		<td>Feb 21, 2015</td>
							           		<td>Paypal</td>
									     </tr>  
									     <tr>									     	
											<td>A000000004</td>
							           		<td>Cavin</td>
							           		<td>95</td>
							           		<td>Feb 23, 2015</td>
							           		<td>Credit Card</td>
									     </tr>  
									     <tr>									     	
											<td>A000000005</td>
							           		<td>William</td>
							           		<td>110</td>
							           		<td>Feb 23, 2015</td>
							           		<td>Paypal</td>
									     </tr>  
									     <tr>									     	
											<td>A000000006</td>
							           		<td>Marie</td>
							           		<td>236</td>
							           		<td>Feb 24, 2015</td>
							           		<td>Paypal</td>
									     </tr>  --> 									     									     									     
									   </tbody>
									 </table>
								</div>														
							</div>
						</div>
						
						<div class="col-md-4 col-md-offset-4">
							<button type="button" class="btn btn-success" data-toggle="modal" data-target=".accounttypemaintenance" data-backdrop="static">Update</button>
						</div>
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