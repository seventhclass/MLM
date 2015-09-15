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
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/autoship.js"></script>	
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
								<div class="subtitle" >Autoship Order for: ABCDE00001</div>
							</div>														
						</div>
						<div class="row">
							<div class="col-md-6">
								<div id="left_panel">
									<div class="panel panel-default">
									    <div class="panel-body">
									    	<div class="row">
									    		<div class="col-sm-offset-1 col-sm-6">
									    			Autoship Pay Method
									    		</div>
									    	</div>
											<br/>
									    	<div class="row">
									    		<div class="col-sm-offset-1 col-sm-6">
													<select id="a_paymethod" class="form-control" >
													    <option selected value="0">Please Choose...</option>
														<!--
													    <option value="1">Credit Card</option>

													    <option value="2">Paypal</option>
														-->
														<option value="1">Cheque</option>

													</select>
												</div>
									    	</div>									    	
									    </div>
									</div>	
								</div>						
							</div>
							<div class="col-md-6">
								<div id="right_panel">
									<div class="panel panel-default">
									    <div class="panel-body">
									    	<div class="row">
									    		<div class="col-sm-offset-1 col-sm-6">
									    			Please select currency:
									    		</div>
									    	</div>
									    	<br/>
									    	<div class="row">
									    		<div class="col-sm-offset-1 col-sm-6">
													<select id="a_paymethod" class="form-control" >
													    <option selected value="0">Please Choose...</option>
													    <option value="1">CAD Dollars</option>
													    <option value="2">US Dollars</option>
													</select>
												</div>
									    	</div>									    	
									    </div>
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
												<th>Qty</th>
												<th>Item Code</th>
												<th>Description</th>
												<th>Currency</th>
												<th>Price Each</th>
												<th>Points Each</th>
												<th>Price Total</th>
												<th>Points Total</th>
											</tr>
										</thead>
									   <tbody>
									     <tr>
									     	<td><input type="number" name="quantity" min="0" max="999" value="1"></td>
											<td>A000000001</td>
							           		<td>Prolo telomeres anti-oxidauil ....</td>
							           		<td>CAD</td>
							           		<td>99.00</td>
							           		<td>9P</td>
							           		<td>$99.00</td>									           										           		
							           		<td>9</td>
									     </tr>  
									     <tr>
									     	<td><input type="number" name="quantity" min="0" max="999" value="1"></td>
											<td>A000000002</td>
							           		<td>Second Generation of MT-1000</td>
							           		<td>CAD</td>
							           		<td>41.00</td>
							           		<td>4P</td>
							           		<td>$41.00</td>
							           		<td>4</td>
									     </tr> 		
									     <tr>
									     	<td><input type="number" name="quantity" min="0" max="999" value="1"></td>
											<td>A000000003</td>
							           		<td>Preulsor of a miracle moleeule</td>
							           		<td>CAD</td>
							           		<td>82.00</td>
							           		<td>8P</td>
							           		<td>$82.00</td>
							           		<td>8</td>
									     </tr>
									   </tbody>
									 </table>
								</div>									
							</div>
						</div>
						<div class="row">
							<div class="col-md-2">
								<div class="shipfeebox">
									<button type="button" class="btn btn-success" data-toggle="modal" data-target="#productlist" data-backdrop="static" >Products List <span class="glyphicon glyphicon-circle-arrow-down"></span></button>
								</div>
							</div>
							<div class="col-md-10">
								<div class="row">
									<div class="shipfeebox">
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="rstar_fee_default" value="1" checked>Default
											</label> 										
										</div>
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="rstar_fee_once" value="2" >Once
											</label> 										
										</div>
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="rstar_fee_permanent" value="2" >Permanent
											</label> 										
										</div>									
										<div class="col-sm-3 text-right">
											Restart Aship Fee $ 							
										</div>	
										<div class="col-sm-1">
											<input type="text" id="rstart_fee" value="0">	
										</div>	
									</div>								
								</div>
								<div class="row">
									<div class="shipfeebox">
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="ship_fee_default" value="1" checked>Default
											</label> 										
										</div>
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="ship_fee_once" value="2" >Once
											</label> 										
										</div>
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="ship_fee_permanent" value="2" >Permanent
											</label> 										
										</div>									
										<div class="col-sm-3 text-right">
											Shipping Fee $ 							
										</div>	
										<div class="col-sm-1">
											<input type="text" id="ship_fee" value="10.00">	
										</div>
									</div>									
								</div>	
								<div class="row">
									<div class="shipfeebox">
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="insurance_fee_default" value="1" checked>Default
											</label> 										
										</div>
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="insurance_fee_once" value="2" >Once
											</label> 										
										</div>
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="insurance_fee_permanent" value="2" >Permanent
											</label> 										
										</div>									
										<div class="col-sm-3 text-right">
											Insurance Fee $ 							
										</div>	
										<div class="col-sm-1">
											<input type="text" id="insurance_fee" value="0">	
										</div>
									</div>									
								</div>
								<div class="row">
									<div class="shipfeebox">
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="eclc_fee_default" value="1" checked>Default
											</label> 										
										</div>
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="eclc_fee_once" value="2" >Once
											</label> 										
										</div>
										<div class="col-sm-2">
											<label class="radio-inline"> <input type="radio"
												name="eclc_fee_permanent" value="2" >Permanent
											</label> 										
										</div>									
										<div class="col-sm-3 text-right">
											E-Collect Fee $ 							
										</div>	
										<div class="col-sm-1">
											<input type="text" id="eclc_fee" value="0">	
										</div>
									</div>									
								</div>	
								<div class="row">
									<div class="shipfeebox">								
										<div class="col-sm-offset-6 col-sm-3 text-right">
											Tax $ 							
										</div>	
										<div class="col-sm-1">
											<input type="text" id="tax_fee" value="0">	
										</div>
									</div>									
								</div>																															
							</div>													
						</div>
						<div class="ashipdatebox">	
							<div class="row ashipdatestyle">							
								<div class="col-md-12">
									<label for="ashipdate" class="col-sm-3">Date of last Autoship:</label>
									<div class="col-sm-3">
										<input type="date" id="ashipdate">
									</div>									
									<label class="col-sm-2" >Total:</label>									
									<div class="col-sm-2">
										$232.00
									</div>		
									<div class="col-sm-2">
										21P
									</div>					
								</div>
							</div>
							<div class="row ashipdatestyle">
								<div class="col-md-12">									
									<label class="col-sm-2">Order Number:</label>17440									
								</div>
							</div>					
						</div>
						<div class="ashipdatebox">	
							<div class="row ashipdatestyle">							
								<div class="col-md-offset-3 col-md-7 text-danger text-center">	
									Please keep in mind this amount does not include taxes and shipping,
									please adjust accordingly.										
								</div>
							</div>
							<div class="row ashipdatestyle">
								<div class="col-md-12 text-center">									
									<button type="button" class="btn btn-primary btn-sm ">Skip Next Autoship</button>
									<button type="button" class="btn btn-primary btn-sm ">Cancel Autoship</button>
									<button type="button" class="btn btn-primary btn-sm ">Update Next Autoship Date</button>
									<button type="button" class="btn btn-primary btn-sm ">Process Autoship Now</button>
									<button type="button" class="btn btn-primary btn-sm ">Update</button>									
								</div>
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
	 		 	 
<!-- 	<div id="productlist" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header" style="background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
					<h4 class="modal-title text-center">Products List</h4>
				</div>
				<div class="modal-body">
					<div class="subtitle" >Products Selection</div>
						<div class="table-responsive ordertable">
							<table class="table">
								<thead>
									<tr>
										<th>Item Code</th>
										<th>Product Desc</th>
										<th>Package</th>
										<th>Qty</th>
										<th>Sel</th>
									</tr>
								</thead>
							   <tbody>
							     <tr>
									<td>A000000001</td>
					           		<td>Prolo telomeres anti-oxidauil ....</td>
					           		<td></td>
					           		<td><input type="number" name="quantity" min="1" max="999" value="1"></td>
					           		<td><input type="checkbox"></td>
							     </tr>  
							     <tr>
									<td>A000000002</td>
					           		<td>Second Generation of MT-1000</td>
					           		<td></td>
					           		<td><input type="number" name="quantity" min="1" max="999" value="1"></td>
					           		<td><input type="checkbox"></td>
							     </tr> 		
							     <tr>
									<td>A000000003</td>
					           		<td>Preulsor of a miracle moleeule</td>
					           		<td></td>
					           		<td><input type="number" name="quantity" min="1" max="999" value="1"></td>
					           		<td><input type="checkbox"></td>
							     </tr>					     										       												     													     										     												           
							   </tbody>
							 </table>
						</div>
						<div class="text-center">						
							<div id="pagination">
								<div>Dispaly results: <strong>1-10</strong> of <strong>20</strong></div>
								<ul class="pagination pagination-sm">
								  <li class="disabled"><a href="#"><span class="glyphicon glyphicon-step-backward" style="line-height: inherit;"></span></a></li>
								  <li class="disabled"><a href="#"><span class="glyphicon glyphicon-backward" style="line-height: inherit;"></span></a></li>
								  <li class="active"><a href="#">1</a></li>
								  <li><a href="#">2</a></li>
								  <li><a href="#">3</a></li>
								  <li><a href="#">4</a></li>
								  <li><a href="#">5</a></li>
								  <li><a href="#"><span class="glyphicon glyphicon-forward" style="line-height: inherit;"></span></a></li>
								  <li><a href="#"><span class="glyphicon glyphicon-step-forward" style="line-height: inherit;"></span></a></li>
								</ul>								
							</div>
						</div>					
				</div>
				<div class="modal-footer">					
					<button type="button" class="btn btn-primary">Submit</button>
				</div>
			</div>
		</div>
	</div> -->
	 		 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>