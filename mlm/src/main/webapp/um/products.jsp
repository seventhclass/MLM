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
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/products.js"></script>		
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
						<div class="btn-group-vertical categorybox">
							<!-- <button class="btn btn-success category_btn" data-categoryid="1" type="button">Anti-Aging             </button>
							<button class="btn btn-success category_btn" data-categoryid="2" type="button">Life Extension         </button>
							<button class="btn btn-success category_btn" data-categoryid="3" type="button">Brain Health           </button>
							<button class="btn btn-success category_btn" data-categoryid="4" type="button">Energy & Performance   </button>
							<button class="btn btn-success category_btn" data-categoryid="5" type="button">Wealth Creation        </button> -->
						</div>
					</div>
				</div>
				<div class="col-md-9">
					<div id="content">
						<div id="shopwindow">
							<div id="productslist" class="row">
								<%-- <div class="col-xs-6 col-md-4">
									<a href="#" class="thumbnail"> 
										<img src="<%=request.getContextPath()%>/images/products/product1.png"
										style="height: 200px; width: 150px; display: block;" alt="">
									</a>
									<div class="caption">																		
										<h3 class="p_name">MT-1000</h3>
										<p class="p_itemCode">A000000001</p>																				
										<p>Reatil&nbsp;<span class="p_rPrice">99.00</span>$<span>&nbsp;&#47;&nbsp;</span>
										Assoc&nbsp;<span class="p_wPrice">58.00</span>$<span>&nbsp;&#47;&nbsp;</span>
										<span class="p_BV">40</span>BV
										</p>
										<p><span class="p_numbers">90</span>&nbsp;Counts</p>										
										<p>
											Quantity:<input class="p_quantity" type="number" name="quantity" min="1"
												max="999" value="1"> 
												<button type="button" class="btn btn-danger addtocart_btn"><span
												class="glyphicon glyphicon-shopping-cart"></span>&nbsp;Add to Cart</button>												
										</p>
									</div>
								</div>
								<div class="col-xs-6 col-md-4">
									<a href="#" class="thumbnail"> <img
										src="<%=request.getContextPath()%>/images/products/product1.png"
										style="height: 200px; width: 150px; display: block;" alt="">
									</a>
									<div class="caption">
										<h3 class="p_name">MT-1000B</h3>
										<p class="p_itemCode">A000000002</p>																				
										<p>Reatil&nbsp;<span class="p_rPrice">41.00</span>$<span>&nbsp;&#47;&nbsp;</span>
										Assoc&nbsp;<span class="p_wPrice">31.00</span>$<span>&nbsp;&#47;&nbsp;</span>
										<span class="p_BV">40</span>BV
										</p>
										<p><span class="p_numbers">25</span>&nbsp;Counts</p>
										<p>
											Quantity:<input class="p_quantity" type="number" name="quantity" min="1"
												max="999" value="1"> 
											<button type="button" class="btn btn-danger addtocart_btn"><span
												class="glyphicon glyphicon-shopping-cart"></span>&nbsp;Add to Cart</button>
										</p>
									</div>
								</div>
								<div class="col-xs-6 col-md-4">
									<a href="#" class="thumbnail"> <img
										src="<%=request.getContextPath()%>/images/products/product1.png"
										style="height: 200px; width: 150px; display: block;" alt="">
									</a>
									<div class="caption">
										<h3 class="p_name">Rejwvienator</h3>
										<p class="p_itemCode">A000000003</p>																				
										<p>Reatil&nbsp;<span class="p_rPrice">82.00</span>$<span>&nbsp;&#47;&nbsp;</span>
										Assoc&nbsp;<span class="p_wPrice">62.00</span>$<span>&nbsp;&#47;&nbsp;</span>
										<span class="p_BV">40</span>BV
										</p>
										<p><span class="p_numbers">30</span>&nbsp;Counts</p>
										<p>
											Quantity:<input class="p_quantity" type="number" name="quantity" min="1"
												max="999" value="1"> 
											<button type="button" class="btn btn-danger addtocart_btn"><span
												class="glyphicon glyphicon-shopping-cart"></span>&nbsp;Add to Cart</button>
										</p>
									</div>
								</div> --%>
							</div>
						</div> <!-- end shopwindow -->
						<!-- <div id="pagination">
							<div class="row text-center">
								<div class="col-md-12">
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
						</div> -->
					</div> <!-- end content -->					
				</div>
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