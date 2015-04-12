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
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/productmaintenance.js"></script>		
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
								<div class="h2">Product Maintenance</div>
							</div>
						</div>						
						<div class="row">
							<div class="col-md-12">
								<div class="subtitle" >Product List</div>
							</div>														
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="table-responsive ordertable">
									<table class="table">
										<thead>
											<tr>
												<th>Item Code</th>
												<th>Category</th>
												<th>Name</th>
												<th>Whole Sale Price Each</th>
												<th>Retail Price Each</th>
												<th>Currency</th>	
												<th>Numbers of Capsules</th>											
												<th>Business Volume Each</th>
												<th>Business Volume2 Each</th>
												<th></th>
											</tr>
										</thead>
									   <tbody id="productlist">
									   <tr><td colspan="10">No Items.</td></tr>
<!-- 									     <tr>
											<td>A000000001</td>
											<td>Anti-Aging</td>
							           		<td>MT-1000</td>
							           		<td>58.00</td>
							           		<td>79.00</td>
							           		<td>CAD</td>							           									           	
							           		<td>90</td>
							           		<td>40BV</td>
							           		<td></td>							           		
							           		<td>
							           			<div class="col-sm-7 pdt_maintenance">
							           				<button type="button" class="btn btn-success editproductbtn" data-toggle="modal" data-target=".productmaintenance" data-backdrop="static" >Edit</button>
							           			</div>
							           			<div class="col-sm-5 pdt_maintenance">
							           			<button type="button" class="btn btn-danger delproductbtn" data-toggle="modal" data-target="#productcancel" data-backdrop="static" >Delete</button>
							           			</div>
							           		</td>
									     </tr>  --> 										     											     										       												     													     										     												           
									   </tbody>
									 </table>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12 pdt_maintenance">
								<button type="button" class="btn btn-success addproductbtn" data-toggle="modal" data-target=".productmaintenance" data-backdrop="static" >Add New Item <span class="glyphicon glyphicon-plus-sign"></span></button>
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
	 
	<div class="modal fade bs-example-modal-lg productmaintenance" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<h4 class="modal-title text-center">Products Maintenance</h4>
				</div>
				<div class="modal-body">
					<form id="editProductForm" class="form-horizontal" role="form" action="/addProduct" method="post">
						<div class="form-group">
							<label for="itemcode" class="col-sm-3 control-label">Item Code</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="itemcode">
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-3 control-label">Name</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="name">
							</div>
						</div>						
						<div class="form-group">
							<label for="category" class="col-sm-3 control-label">Category
							</label>
							<div class="col-sm-3">												
								<select id="categoryselect" name="categoryselect" class="form-control">
								    <option>Anti-Aging</option>
								    <option>Life Extension</option>
								    <option>Brain Health</option>
								    <option>Energy & Performance</option>
								    <option>Wealth Creation</option>
								</select>
							</div>
						</div>																					
						<div class="form-group">
							<label for="currency" class="col-sm-3 control-label">Currency</label>
							<div class="col-sm-3">												
								<select id="currencyselect" name="currencyselect" class="form-control">
								    <option selected value="0">Please Choose...</option>
								    <option value="1">CAD Dollars</option>
								    <option value="2">US Dollars</option>
								</select>
							</div>
						</div>	
						<div class="form-group">
							<label for="w_price" class="col-sm-3 control-label">Whole Sale Price</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="w_price" name="r_price">
							</div>
						</div>	
						<div class="form-group">
							<label for="r_price" class="col-sm-3 control-label">Retail Price</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="r_price" name="r_price">
							</div>
						</div>		
						<div class="form-group">
							<label for="numbers" class="col-sm-3 control-label">Numbers of Capsules</label>
							<div class="col-sm-3">
								<input id="numbers" type="number" name="numbers" min="1" max="9999" value="1">
							</div>
						</div>												
						<div class="form-group">
							<label for="volume" class="col-sm-3 control-label">Business Volume</label>
							<div class="col-sm-3">
								<input type="text" name="volume" class="form-control" id="volume">
							</div>
						</div>	
						<div class="form-group">
							<label for="volume2" class="col-sm-3 control-label">Business Volume2</label>
							<div class="col-sm-3">
								<input type="text" name="volume2" class="form-control" id="volume2">
							</div>
						</div>	
						<div class="form-group">
							<label for="description" class="col-sm-3 control-label">Description</label>
							<div class="col-sm-6">
								<textarea id="description" name="description" class="form-control" rows="2"></textarea>
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
	 
	<div id="productcancel" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<h4 class="modal-title text-center">Confirmation</h4>
				</div>
				<div class="modal-body">
					<div class="h2 text-center">Alert</div>
					<div class="text-center">You sure you want to delete record?</div>
					<form id="cancelProductForm" class="form-horizontal" role="form" action="">
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