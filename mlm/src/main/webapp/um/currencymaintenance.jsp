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
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/currencymaintenance.js"></script>	
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
								<div class="h2">Currency Maintenance</div>
							</div>
						</div>					
						<div class="row">
							<div class="col-md-12">
								<div class="subtitle" >Currency List</div>
							</div>														
						</div>
						<div class="row">
							<div class="col-md-10">
								<div class="table-responsive ordertable">
									<table class="table">
										<thead>
											<tr>
												<th>ID</th>
												<th>Currency Name</th>
												<th>Abbreviation</th>
												<th></th>
											</tr>
										</thead>
									   <tbody id="currencylist" class="cur_maintenance">
<!-- 									     <tr>
							           		<td>1</td>							     
							           		<td>Canada Dollar</td>
							           		<td>CA</td>
							           		<td>
							           			<div class="col-sm-offset-1 col-sm-4 cur_maintenance">
							           				<button type="button" class="btn btn-success editcurrencybtn" data-toggle="modal" data-target=".currencymaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-4">
							           				<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#currencycancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>						           		
									     </tr>  
									     <tr>
									     	<td>2</td>
							           		<td>United States Dollar</td>
							           		<td>US</td>
							           		<td>
							           			<div class="col-sm-offset-1 col-sm-4 cur_maintenance">
							           				<button type="button" class="btn btn-success editcurrencybtn" data-toggle="modal" data-target=".currencymaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-4 cur_maintenance">
							           				<button type="button" class="btn btn-danger delcurrencybtn" data-toggle="modal" data-target="#currencycancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>
									     </tr> 	 -->								     
										</tbody>
									 </table>
								</div>	
							</div>
						</div>
						<div class="row">
							<div class="col-md-12 cur_maintenance">
								<button type="button" class="btn btn-success addcurrencybtn" data-toggle="modal" data-target=".currencymaintenance" data-backdrop="static" >Add New Item <span class="glyphicon glyphicon-plus-sign"></span></button>
							</div>
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
	 
	<div class="modal fade bs-example-modal-lg currencymaintenance" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<h4 class="modal-title text-center">Currency Maintenance</h4>
				</div>
				<div class="modal-body">
					<form id="editCurrencyForm" class="form-horizontal" role="form" action="" method="post">
						<div class="form-group">
							<label for="currencyname" class="col-sm-3 control-label">Currency
								Name</label>
							<input type="hidden" name="currencyId" data-model="" id="currencyid">
							<div class="col-sm-6">
								<input type="text" name="currencyName" class="form-control" id="currencyname">
							</div>
						</div>					
						<div class="form-group">
							<label for="currencyabbr" class="col-sm-3 control-label">Abbreviation</label>
							<div class="col-sm-3">
								<input type="text" name="currencyAbbr" class="form-control" id="currencyabbr">
							</div>
						</div>						
					</form>						
				</div>
				<div class="modal-footer text-center">					
					<button id="editCurrencybtn" type="button" class="btn btn-primary">Save</button>
				</div>
			</div>
		</div>
	</div>
	 
	<div id="currencycancel" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<h4 class="modal-title text-center">Confirmation</h4>
				</div>
				<div class="modal-body">
					<div class="h2 text-center">Alert</div>
					<div class="text-center">You sure you want to delete record?</div>
					<form id="cancelCurrencyForm" class="form-horizontal" role="form" action="" method="post">
						<input type="hidden" id="c_id" value="">					
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal">No</button>					
					<button id="delCurrencybtn" type="button" class="btn btn-primary">Yes</button>				
				</div>
			</div>
		</div>
	</div>
	 		 
	 		 	 	 		 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>