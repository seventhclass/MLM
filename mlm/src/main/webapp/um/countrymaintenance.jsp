<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Welcome to milleans vie science</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
	<link href="../css/reset.css" rel="stylesheet" type="text/css" />
	<link href="../css/style.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="../js/mlm.js"></script>	
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
								<div class="h2">Country Maintenance</div>
							</div>
						</div>					
						<div class="row">
							<div class="col-md-12">
								<div class="subtitle" >Country List</div>
							</div>														
						</div>
						<div class="row">
							<div class="col-md-8">
								<div class="table-responsive ordertable">
									<table class="table">
										<thead>
											<tr>
												<th>Country Name</th>
											</tr>
										</thead>
									   <tbody>
									     <tr>
							           		<td>
							           			<div class="col-sm-8">Canada</div>
							           			<div class="col-sm-2">
							           				<button type="button" class="btn btn-success" data-toggle="modal" data-target=".countrymaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-2">
							           			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#countrycancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>
									     </tr>  
									     <tr>
							           		<td>
							           			<div class="col-sm-8">US</div>
							           			<div class="col-sm-2">
							           				<button type="button" class="btn btn-success" data-toggle="modal" data-target=".countrymaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-2">
							           			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#countrycancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>
									     </tr> 
									     <tr>
							           		<td>
							           			<div class="col-sm-8">China</div>
							           			<div class="col-sm-2">
							           				<button type="button" class="btn btn-success" data-toggle="modal" data-target=".countrymaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-2">
							           			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#countrycancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>
									     </tr> 	
									     <tr>
							           		<td>
							           			<div class="col-sm-8">France</div>
							           			<div class="col-sm-2">
							           				<button type="button" class="btn btn-success" data-toggle="modal" data-target=".countrymaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-2">
							           			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#countrycancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>
									     </tr> 									     								     									     
										</tbody>
									 </table>
								</div>	
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<button type="button" class="btn btn-success" data-toggle="modal" data-target=".countrymaintenance" data-backdrop="static" >Add New Item <span class="glyphicon glyphicon-plus-sign"></span></button>
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
	 
	<div class="modal fade bs-example-modal-lg countrymaintenance" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<h4 class="modal-title text-center">Country Maintenance</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" role="form" action="">
						<div class="form-group">
							<label for="countryname" class="col-sm-3 control-label">Country
								Name</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="countryname">
							</div>
						</div>
					</form>						
				</div>
				<div class="modal-footer text-center">					
					<button type="submit" class="btn btn-primary">Save</button>
				</div>
			</div>
		</div>
	</div>
	 
	<div id="countrycancel" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<h4 class="modal-title text-center">Confirmation</h4>
				</div>
				<div class="modal-body">
					<div class="h2 text-center">Alert</div>
					<div class="text-center">You sure you want to delete record?</div>
					<form class="form-horizontal" role="form" action="">
						<input type="hidden" id="p_id" value="">					
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal">No</button>					
					<button type="submit" class="btn btn-primary">Yes</button>				
				</div>
			</div>
		</div>
	</div>
	 		 
	 		 	 	 		 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>