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
	<link href="<%=request.getContextPath()%>/css/orderentry.css" rel="stylesheet" type="text/css" />
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script> 
	<![endif]-->	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/mlm.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/myorders.js"></script>		
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
						<div id="orderentry">
							<div class="list-group">
								<div class="list-group-item list-group-item-info active">
									<span class="glyphicon glyphicon-list-alt"></span> My Order
								</div>
							    <div class="list-group-item">
									<div class="row">	
										<div class="col-sm-4">
											Member ID: <span id="memberId"></span>
										</div>
										<div class="col-sm-8">
											<span id="memberName"></span>
										</div>
										<%--<div class="col-sm-5">--%>
										<%--<div class="list-group">--%>
										<%--<div class="list-group-item list-group-item-danger">--%>
										<%--<div class="row">--%>
										<%--<div class="col-sm-4">--%>
										<%--<img style="width: 80px; height: 80px; padding: 10px;" src="<%=request.getContextPath()%>/images/logo/shopping-cart-icon-transparent.png" alt="shopping cart">--%>
										<%----%>
										<%--</div>--%>

										<%--&lt;%&ndash;<div class="col-sm-7 text-right">&ndash;%&gt;--%>
										<%--&lt;%&ndash;<div class="row">&ndash;%&gt;--%>
										<%--&lt;%&ndash;Shopping Cart Item: <span id="shoppingCartItemNumber">3</span>&ndash;%&gt;--%>
										<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
										<%--&lt;%&ndash;<div class="row">&ndash;%&gt;--%>
										<%--&lt;%&ndash;Total: $<span id="shoppingCartTotalAmt">222.00</span> CAD&ndash;%&gt;--%>
										<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
										<%--&lt;%&ndash;<div id="order_cart">&ndash;%&gt;--%>
										<%--&lt;%&ndash;<div class="row">&ndash;%&gt;--%>
										<%--&lt;%&ndash;<a id="clearShoppingCart" href="#">[Clear]</a> <a id="checkoutShoppingCart" href="#">[Checkout]</a>&ndash;%&gt;--%>
										<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
										<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
										<%--&lt;%&ndash;</div>&ndash;%&gt;--%>

										<%--</div>--%>
										<%--</div>--%>
										<%--</div>--%>
										<%--</div>									--%>
									</div>								
								</div>
							    <div class="list-group-item">
										<div class="subtitle" >Order List</div>
										<div class="table-responsive ordertable">
											<table class="table">
												<thead>
													<tr>
														<th>Date</th>
														<th>Order ID</th>
														<th>Detail</th>
													</tr>
												</thead>
											   <tbody id="myOrderList">
											     <%-- <tr>
											     	<td>${orderId}</td>
													<td>A000000001</td>
									           		<td>MT-1000</td>
									           		<td><input class="numbers" type="number" name="numbers" data-id="1" data-seq="1" min="1" max="9999" value="1"></td>
									           		<td>CAD</td>
									           		<td>99.00</td>
									           		<td>90</td>
									           		<td></td>
									           		<td id="subPriceTotal_id_11">$99.00</td>
									           		<td id="subPointsTotal_id_11">9</td>
									           		<td style="width:30px"><span data-id="1" data-seq="1" class="glyphicon glyphicon-remove-sign close_item" style="color:red"></span></td>
											     </tr>
											     <tr>
											     	<td>2015-03-15 10:20</td>
													<td>A000000002</td>
									           		<td>MT-1000B</td>
									           		<td><input class="numbers" type="number" name="numbers" data-id="1" data-seq="2" min="1" max="9999" value="2"></td>
									           		<td>CAD</td>
									           		<td>41.00</td>
									           		<td>25</td>
									           		<td></td>
									           		<td id="subPriceTotal_id_12">$41.00</td>
									           		<td id="subPointsTotal_id_12">4</td>
									           		<td style="width:30px"><span data-id="1" data-seq="2" class="glyphicon glyphicon-remove-sign close_item" style="color:red"></span></td>
											     </tr>
											     <tr>
											     	<td>2015-04-04 13:22</td>
													<td>A000000003</td>
									           		<td>Rejwvienator</td>
									           		<td><input class="numbers" type="number" name="numbers" data-id="1" data-seq="3" min="1" max="9999" value="1"></td>
									           		<td>CAD</td>
									           		<td>82.00</td>
									           		<td>30</td>
									           		<td></td>
									           		<td id="subPriceTotal_id_13">$82.00</td>
									           		<td id="subPointsTotal_id_13">8</td>
									           		<td style="width:30px"><span data-id="1" data-seq="3" class="glyphicon glyphicon-remove-sign close_item" style="color:red"></span></td>
											     </tr>
											     <tr>
											     	<td colspan="4"></td>
											     	<td>Total:</td>
											     	<td></td>
											     	<td id="VolumTotal">145</td>
											     	<td></td>
											     	<td id="PriceTotal">$222.00</td>
											     	<td id="PointsTotal">21</td>
											     </tr> --%>
											   </tbody>
											 </table>
										</div>	
										<!-- <div>											
											<form id="addProductForm" class="form-horizontal" role="form" action="">
												<div class="form-group">
													<div class="col-sm-2">													
														<button type="button" class="btn btn-success productsList_btn" data-toggle="modal" data-target="#productlist" data-backdrop="static" >Products List <span class="glyphicon glyphicon-circle-arrow-down"></span></button>
													</div>
													<div class="col-sm-2">
														<input type="text" class="form-control" id="itemcode"
															placeholder="Item Code">														
													</div>
													<div class="col-sm-2">
														Qty:<input id="itemqty" type="number" name="quantity" min="1" max="999" value="1">
													</div>
													<div class="col-sm-offset-4 col-sm-2">
														<button type="submit" class="btn btn-success">Add Item <span class="glyphicon glyphicon-plus-sign"></span></button>
													</div>
												</div>											
											</form>
										</div> -->
										<%--<div id="finish_order" class="text-center">--%>
											<%--<a href="<%=request.getContextPath()%>/payandship">--%>
												<%--<button type="button" class="btn btn-primary">Finished Order <span--%>
														<%--class="glyphicon glyphicon-ok-sign"></span></button>--%>
											<%--</a>--%>
										<%--</div>--%>
								</div>	
							    <div class="list-group-item">
									<div class="text-center">
										<a href="<%=request.getContextPath()%>/products">Countinue Shopping</a>
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
	 	
	<div id="productlist" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
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
										<th>Name</th>
										<th>Whole Sale Price</th>
										<th>Retail Price</th>
										<th>Currency</th>
										<th>Numbers of Capsules</th>
										<th>Business Volumes</th>
										<th>Qty</th>
										<th>Sel</th>
									</tr>
								</thead>
							   <tbody id="productsList">
							     <tr>
									<td>A000000001</td>
									<td>MT-1000</td>
					           		<td>58$</td>
					           		<td>79$</td>
					           		<td>CAD</td>
					           		<td>90</td>
					           		<td>40BV</td>
					           		<td><input type="number" name="quantity" min="1" max="999" value="1"></td>
					           		<td><input type="checkbox" data-id="1"></td>
							     </tr>  
							     <tr>
									<td>A000000002</td>
									<td>MT-1000 Second Generation</td>
					           		<td>63$</td>
					           		<td>82$</td>
					           		<td>CAD</td>
					           		<td>50</td>
					           		<td>40BV</td>
					           		<td><input type="number" name="quantity" min="1" max="999" value="1"></td>
					           		<td><input type="checkbox" data-id="2"></td>
							     </tr> 		
							     <tr>
									<td>A000000003</td>
									<td>Rejwvenetor</td>
					           		<td>65$</td>
					           		<td>82$</td>
					           		<td>CAD</td>
					           		<td>60</td>
					           		<td>40BV</td>
					           		<td><input type="number" name="quantity" min="1" max="999" value="1"></td>
					           		<td><input type="checkbox" data-id="3"></td>
							     </tr>	
							     <tr>
									<td>A000000004</td>
									<td>Forever Young</td>
					           		<td>95$</td>
					           		<td>105$</td>
					           		<td>CAD</td>
					           		<td>50</td>
					           		<td>55BV</td>
					           		<td><input type="number" name="quantity" min="1" max="999" value="1"></td>
					           		<td><input type="checkbox" data-id="4"></td>
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
					<button type="button" class="btn btn-primary selectProducts">Submit</button>
				</div>
			</div>
		</div>
	</div>
	 	 
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 	
		 
</body>
</html>