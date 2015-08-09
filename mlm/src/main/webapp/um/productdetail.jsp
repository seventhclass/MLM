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
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/productdetail.js"></script>		
</head>
<body>
	 <div class="container">
		<div id="header">
			<%@ include file="../includes/header.jsp"%>
		</div> <!-- end header -->	
		<div id="page">
			<div class="row">
				<div class="col-md-12">
					<div id="content">
						<div id="shopwindow">
							<div id="productdetailinfo" class="row">
								<%-- <div id="productthumbnail" class="col-md-3">
									<img src="<%=request.getContextPath()%>/images/products/product1.png"
										style="height: 200px; width: 150px; display: block;" alt="">
								</div>
								<div id="productcontent" class="col-md-9">
									<div class="caption">
										<h3 class="p_name">MT-1000</h3>
										<p class="p_itemCode"><font style="font-weight:bold;">Item No:&nbsp;&nbsp;</font>A000000001</p>																				
										<p><font style="font-weight:bold;">Price:&nbsp;&nbsp;</font>Reatil&nbsp;<span class="p_rPrice">99.00</span>$<span>&nbsp;&#47;&nbsp;</span>
										Assoc&nbsp;<span class="p_wPrice">58.00</span>$<span>&nbsp;&#47;&nbsp;</span>
										<span class="p_BV">40</span>BV
										</p>
										<p><font style="font-weight:bold;">Volume:&nbsp;&nbsp;</font><span class="p_numbers">90</span>&nbsp;Counts</p>
										<font style="font-weight:bold;">Description:</font>
										<hr/>
										<p>
											The main sources of TheFreeDictionary's Medical dictionary are The American Heritage® Stedman's Medical Dictionary, Second Edition and Dorland's Medical Dictionary for Health Care Consumers, which provide authoritative descriptions of medical conditions, medications, anatomical terms, noted medical personalities and much more.

The American Heritage® Stedman's Medical Dictionary is ideal for both medical professionals and anyone who wants to keep up with the burgeoning array of terminology found in today's medical news. By avoiding jargon, the dictionary offers concise and easily accessible information for users searching for descriptions of over-the-counter or prescription medications, medical abbreviations, test procedures, medical research topics, or illnesses. Over 45,000 entries from all areas of medicine and healthcare are included.

Dorland's Medical Dictionary for Health Care Consumers is based on the content of Dorland's Illustrated Medical Dictionary, which has been the premier dictionary for health care professionals for over 100 years. Created especially with the health care consumer in mind, Dorland's contains approximately 40,000 entries and more than 350 illustrations and provides authoritative, concise definitions for a wide range of terms used in the health sciences, including those related to anatomy, physiology, diseases, drugs, tests and procedures, and much, much more.

The Medical dictionary also draws from The Gale Encyclopedia of Medicine,Second Edition, which provides information on nearly 1,700 common medical disorders, tests, and treatments, and bridges the gap between basic consumer resources and highly technical professional materials.

Additional source materials include Mosby's Dental Dictionary, Second Edition, a compilation of 2,100 dentistry-related definitions; Mosby's Dictionary of Complementary and Alternative Medicine, which catalogs terms used in non-conventional medical and healing practices; and Saunders Comprehensive Veterinary Dictionary, Third Edition, which includes information on large and small animals and features more than 65,000 entries and over 1,000 new terms.
										</p>
									</div>									
								</div> --%>
							</div>
						</div> <!-- end shopwindow -->
					</div> <!-- end content -->					
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 text-center">
					<button type="button" class="btn btn-danger closewindow_btn">Close</button>
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