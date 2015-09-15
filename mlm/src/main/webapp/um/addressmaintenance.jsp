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
								<div class="h2">Address Maintenance</div>
							</div>
						</div>					
						<div class="row">
							<div class="col-md-12">
								<div class="subtitle" >Shipping Address Summary</div>
							</div>														
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="table-responsive ordertable">
									<table class="table">
										<thead>
											<tr>
												<th>First Name</th>
												<th>Last Name</th>
												<th>Address</th>
												<th>Zip</th>
												<th>Phone</th>
												<th></th>
											</tr>
										</thead>
									   <tbody id="addresslist">
									     <!-- <tr>
											<td>Michael</td>
							           		<td>Wang</td>
							           		<td>1234 Rue cote-des-neiges apt. 10 Montreal QC Canada</td>
							           		<td>A5W 1S3</td>
							           		<td> 514 888 1234</td>
							           		<td>
							           			<div class="col-sm-5">
							           				<button type="button" class="btn btn-success" data-toggle="modal" data-target=".addressmaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-4">
							           			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#addresscancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>
									     </tr>  
									     <tr>
											<td>Michael</td>
							           		<td>Wang</td>
							           		<td>1234 Rue cote-des-neiges apt. 10 Montreal QC Canada</td>
							           		<td>A5W 1S3</td>
							           		<td> 514 888 1234</td>
							           		<td>
							           			<div class="col-sm-5">
							           				<button type="button" class="btn btn-success" data-toggle="modal" data-target=".addressmaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-4">
							           			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#addresscancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>
									     </tr>  
									     <tr>
											<td>Michael</td>
							           		<td>Wang</td>
							           		<td>1234 Rue cote-des-neiges apt. 10 Montreal QC Canada</td>
							           		<td>A5W 1S3</td>
							           		<td> 514 888 1234</td>
							           		<td>
							           			<div class="col-sm-5">
							           				<button type="button" class="btn btn-success" data-toggle="modal" data-target=".addressmaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-4">
							           			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#addresscancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>
									     </tr>  
									     <tr>
											<td>Michael</td>
							           		<td>Wang</td>
							           		<td>1234 Rue cote-des-neiges apt. 10 Montreal QC Canada</td>
							           		<td>A5W 1S3</td>
							           		<td> 514 888 1234</td>
							           		<td>
							           			<div class="col-sm-5">
							           				<button type="button" class="btn btn-success" data-toggle="modal" data-target=".addressmaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-4">
							           			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#addresscancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>
									     </tr>  --> 									     									     
										</tbody>
									 </table>
								</div>	
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<button type="button" class="btn btn-success" data-toggle="modal" data-target=".addressmaintenance" data-backdrop="static" >Add New Item <span class="glyphicon glyphicon-plus-sign"></span></button>
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
	 
	<div class="modal fade bs-example-modal-lg addressmaintenance" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<h4 class="modal-title text-center">Address Maintenance</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" role="form" action="">
						<div class="form-group">
							<label for="firstname" class="col-sm-3 control-label">First
								Name</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="firstname">
							</div>
						</div>
						<div class="form-group">
							<label for="lastname" class="col-sm-3 control-label">Last
								Name</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="lastname">
							</div>
						</div>									
						<div class="form-group">
							<label for="address" class="col-sm-3 control-label">Address
							</label>
							<div class="col-sm-6">												
								<textarea id="address" class="form-control" rows="2"></textarea>												
							</div>
						</div>		
						<div class="form-group">
							<label for="country" class="col-sm-3 control-label">Country
							</label>
							<div class="col-sm-3">												
								<select class="form-control">
								    <option>None</option>
								    <!-- <option>Canada</option>
								    <option>US</option> -->
								</select>
							</div>
						</div>	
						<div class="form-group">
							<label for="state" class="col-sm-3 control-label">State/Province
							</label>
							<div class="col-sm-3">												
								<select class="form-control">
								    <option>None</option>
								    <!-- <option>Quebec</option>
								    <option>Ontario</option>
								    <option>British Columbia</option>
								    <option>Alberta</option>
								    <option>Nova Scotia</option>
								    <option>Newfoundland and Labrador</option>
								    <option>Saskatchewan</option>
								    <option>Manitoba</option>
								    <option>New Brunswick Canada</option>
								    <option>Prince Edward Island(PEI)</option> -->
								</select>
							</div>
						</div>	
						<div class="form-group">
							<label for="city" class="col-sm-3 control-label">City
							</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="city">
							</div>
						</div>										
						<div class="form-group">
							<label for="zip" class="col-sm-3 control-label">Zip
							</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="zip">
							</div>
						</div>											
						<div class="form-group">
							<label for="mobilephone" class="col-sm-3 control-label">Mobile Phone</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="mobilephone">
							</div>
						</div>										
						<div class="form-group">
							<label for="officephone" class="col-sm-3 control-label">Phone(o)
							</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="officephone">
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
	 
	<div id="addresscancel" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
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