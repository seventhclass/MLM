/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2015-05-30 02:43:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.um;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accounttypemaintenance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/um/../includes/header-nav.jsp", Long.valueOf(1431998658244L));
    _jspx_dependants.put("/um/../includes/footer.jsp", Long.valueOf(1431469116662L));
    _jspx_dependants.put("/um/../includes/nav-left.jsp", Long.valueOf(1431998658222L));
    _jspx_dependants.put("/um/../includes/getUserInfo.jsp", Long.valueOf(1431469116664L));
    _jspx_dependants.put("/um/../includes/header-img.jsp", Long.valueOf(1431469116665L));
    _jspx_dependants.put("/um/../includes/header.jsp", Long.valueOf(1431469116666L));
    _jspx_dependants.put("/um/../includes/functionbar.jsp", Long.valueOf(1431998658232L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Welcome to milleans vie science</title>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\">\r\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/css/reset.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t<script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script> \r\n");
      out.write("\t<![endif]-->\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/mlm.js\"></script>\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t <div class=\"container\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t<img style='width: 100%; height: 75px'\r\n");
      out.write("\t\t\t src='");
      out.print(request.getContextPath());
      out.write("/images/header7.jpg' alt='milleans vie science'/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");

		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	
      out.write("\r\n");
      out.write("\t<basePath value = \"");
      out.print(basePath);
      out.write("\" id = \"basePath\"></basePath>\t\r\n");
      out.write("</div>");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class='row'>\r\n");
      out.write(" \t<div class='navbar navbar-inverse' role='navigation'>\r\n");
      out.write("\t\t<div class='navbar-header'> \r\n");
      out.write("\t\t\t<button class='navbar-toggle' type='button' data-toggle='collapse' data-target='.navbar-responsive-collapse'>\r\n");
      out.write("\t\t\t\t<span class='sr-only'>Toggle Navigation</span>\r\n");
      out.write("\t\t\t\t<span class='icon-bar'></span>\r\n");
      out.write("\t\t\t\t<span class='icon-bar'></span>\r\n");
      out.write("\t\t\t\t<span class='icon-bar'></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a href='##' class='navbar-brand text-center'><img style='width: 25px; height: 30px' src='");
      out.print(request.getContextPath());
      out.write("/images/logo/logo-new.png' alt='milleans vie science'>Milleans Vie Sciences</a>\r\n");
      out.write(" \t\t</div>\r\n");
      out.write(" \t\t<!-- when screen width less than 768px, the content of div.navbar-responsive-collapse will be hidden, show icon-bar, when click icon-bar, it will extend. when screen width greater than 768px, show as default. -->\r\n");
      out.write("\t\t<div class='collapse navbar-collapse navbar-responsive-collapse'>\r\n");
      out.write("\t\t\t<ul class='nav navbar-nav'>\r\n");
      out.write("\t\t  \t\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/home'>Home</a></li>\r\n");
      out.write("  \t\t\t\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/products'>Products</a></li>\r\n");
      out.write("\t\t \t\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/common/aboutus'>About Us</a></li>\r\n");
      out.write("\t\t \t\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/common/contactus'>Contact Us</a></li>\r\n");
      out.write("  \t\t\t\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/selectAutoship'>Registration</a></li>\r\n");
      out.write("  \t\t\t\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/login'>Login</a></li>\r\n");
      out.write("  \t\t\t\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/logout'>Logout</a></li>\r\n");
      out.write("\t\t \t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t\t\r\n");
      out.write("</div>");
      out.write("   \r\n");
      out.write('\r');
      out.write('\n');

	String userId = session.getAttribute("userid")==null?null:session.getAttribute("userid").toString();
	String userName = session.getAttribute("username")==null?null:session.getAttribute("username").toString();	
	if(userId==null || userId==""){
		Cookie[] cookies = request.getCookies();
		if(cookies!=null && cookies.length>0){
			for(Cookie c:cookies){
				if(c.getName().equals("userid")){
					userId = c.getValue();
				}
				if(c.getName().equals("username")){
					userName = c.getValue();
				}
			}
		}		
	}

      out.write(" \r\n");
      out.write("<userInfo data-userid=\"");
      out.print(userId);
      out.write("\" data-username=\"");
      out.print(userName);
      out.write("\" id=\"get_userInfo\"></userInfo>");
      out.write("     \r\n");
      out.write("\t\r\n");
      out.write("\t\t</div> <!-- end header -->\r\n");
      out.write("\t\t<div id=\"functionbar\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t \tvar basePath=$('#basePath').attr(\"value\");\r\n");
      out.write("\t \t\r\n");
      out.write("\t \tqueryMyShoppingCartSummary();\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t//Query my shopping cart summary information\r\n");
      out.write("\t \tfunction queryMyShoppingCartSummary(){\r\n");
      out.write("\t \t \t//send requrest to server.\r\n");
      out.write("\t \t    $.ajax({\r\n");
      out.write("\t \t    \turl: basePath+'common/shoppingCartSummary',        \t\r\n");
      out.write("\t \t\t\tcache:false,\r\n");
      out.write("\t \t\t\tasync: false,\r\n");
      out.write("\t \t\t\ttype:'POST',\t\t\t\r\n");
      out.write("\t \t    \tdataType:'json',\r\n");
      out.write("\t \t    \ttimeout:5000,\r\n");
      out.write("\t \t    \terror:\tfunction(xhr, ajaxOptions, thrownError){\r\n");
      out.write("\t \t\t                alert(xhr.status+\"\\n\"+xhr.responseText);\r\n");
      out.write("\t \t\t                //$('#content').html(xhr.responseText); \t\t               \r\n");
      out.write("\t \t    \t\t\t},        \t\r\n");
      out.write("\t \t    \tsuccess:\tfunction(res) {\r\n");
      out.write("\t \t    \t\tqueryMyShoppingCartSummaryResponse(res);\r\n");
      out.write("\t \t    \t\t\t}\r\n");
      out.write("\t \t    });    \t\r\n");
      out.write("\t \t}\t \t\r\n");
      out.write("\t \t\r\n");
      out.write("\t \tfunction queryMyShoppingCartSummaryResponse(res){\r\n");
      out.write("\t \t\tvar result = res.result;\t\t\t//response code\r\n");
      out.write("\t \t\tvar message = res.message;\t\t\t//response message\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\tif (result == \"success\") {\r\n");
      out.write("\t \t\t\t$('.myshoppingcartitemnumber').html(\"\");\t\r\n");
      out.write("\t\t \t\t$('.myshoppingcartitemnumber').html(res.cartSummary.totalQuantily);\t\r\n");
      out.write("\t \t\t\t$('.myshoppingcartitemnumber').attr('data-totalamount',res.cartSummary.totalAmount);\r\n");
      out.write("\t \t\t}else{\r\n");
      out.write("\t    \t\tif(message==null || message==\"\"){\r\n");
      out.write("\t    \t\t\tmessage = \"Sorry, loading shopping cart information failed.\";\r\n");
      out.write("\t    \t\t}    \t\t\t\r\n");
      out.write("\t    \t\talert(message);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t \t}\r\n");
      out.write("\t}); \t \t \r\n");
      out.write("</script>    \r\n");
      out.write("<div class='row'>\r\n");
      out.write("\t<div class='col-md-4'>\r\n");
      out.write("\t\t<p class='text-justify'>Building A YOUNGER, HEALTHIER, WEALTHIER LIFE Enjoy Shopping</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class='col-md-8'>\r\n");
      out.write("\t\t<div class='col-sm-offset-7 col-sm-6'>\r\n");
      out.write("\t\t\t<a class=\"myorder_btn\" href='");
      out.print(request.getContextPath());
      out.write("/order/orderentry'><button type='button' class='btn btn-info'><span class='glyphicon glyphicon-list-alt'></span> My Order </button></a>\r\n");
      out.write("\t\t\t<a class=\"myshoppingcart_btn\" href='");
      out.print(request.getContextPath());
      out.write("/myshoppingcart'><button type='button' class='btn btn-danger'><span class='glyphicon glyphicon-shopping-cart'></span> My Shopping Cart <span data-totalamount=\"\" class='badge myshoppingcartitemnumber'></span></button></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t\t<div id=\"page\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t<div id=\"left\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<ul class='nav nav-pills nav-stacked'>\r\n");
      out.write("<li class='nav-divider'></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/selectAutoship'>New Member Sign Up</a></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/editprofile'>Edit Profile</a></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/modifypassword'>Modify Password</a></li>\r\n");
      out.write("\t<li><a href='##'>Search Member</a></li>\r\n");
      out.write("\t<li class='nav-divider'></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/order/orderentry'>Order Entry</a></li>\r\n");
      out.write("\t<li class='nav-divider'></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/paymenttype'>Payment Types</a></li>\r\n");
      out.write("\t<li class='nav-divider'></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/autoship'>AutoShip</a></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/autoshiplist'>AutoShip List</a></li>\r\n");
      out.write("\t<li class='nav-divider'></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/accounttypemaintenance'>Account Type Maintenance</a></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/productmaintenance'>Product Maintenance</a></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/countrymaintenance'>Country Maintenance</a></li>\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/provincemaintenance'>Province Maintenance</a></li>\t\r\n");
      out.write("\t<li><a href='");
      out.print(request.getContextPath());
      out.write("/currencymaintenance'>Currency Maintenance</a></li>\r\n");
      out.write(" \t<li><a href='");
      out.print(request.getContextPath());
      out.write("/addressmaintenance'>Address Maintenance</a></li>\r\n");
      out.write(" \t<li><a href='");
      out.print(request.getContextPath());
      out.write("/categorymaintenance'>Category Maintenance</a></li>\r\n");
      out.write("\t<li class='nav-divider'></li>\r\n");
      out.write("</ul>\r\n");
      out.write("   ");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-9\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"content\">\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h2\">Account Type Maintenance</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"subtitle\" >Account Type List</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"table-responsive ordertable\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Account Type Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>With AutoShip</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Annual Fee</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Minimum BV</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>With Compensation</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>Accept Promotions</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   <tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>Associate Account</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>Yes</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>$28.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>80</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>Yes</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t\tYes\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t\t<button type=\"button\" class=\"btn btn-success\" data-toggle=\"modal\" data-target=\".accounttypemaintenance\" data-backdrop=\"static\" >Edit</button>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<button type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#accounttypecancel\" data-backdrop=\"static\" >Delete</button>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\t\t\t\t\t\t\t           \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     </tr> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>Associate Account</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>No</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>$28.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>80</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>Yes</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t\tYes\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t\t<button type=\"button\" class=\"btn btn-success\" data-toggle=\"modal\" data-target=\".accounttypemaintenance\" data-backdrop=\"static\" >Edit</button>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<button type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#accounttypecancel\" data-backdrop=\"static\" >Delete</button>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\t\t\t\t\t\t\t           \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     </tr> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>Preferred Customer Account</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>Yes</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>$28.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>0</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>No</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t\tYes\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t\t<button type=\"button\" class=\"btn btn-success\" data-toggle=\"modal\" data-target=\".accounttypemaintenance\" data-backdrop=\"static\" >Edit</button>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<button type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#accounttypecancel\" data-backdrop=\"static\" >Delete</button>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\t\t\t\t\t\t\t           \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     </tr> \t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>Preferred Customer Account</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>No</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>$38.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>0</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>No</td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t\tYes\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t\t<button type=\"button\" class=\"btn btn-success\" data-toggle=\"modal\" data-target=\".accounttypemaintenance\" data-backdrop=\"static\" >Edit</button>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t<button type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#accounttypecancel\" data-backdrop=\"static\" >Delete</button>\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t\t</div>\t\t\t\t\t\t\t           \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           \t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     </tr> \t\t\t\t\t\t\t\t\t     \t\t\t\t\t\t\t\t     \t\t\t\t\t\t\t\t\t      \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-success\" data-toggle=\"modal\" data-target=\".accounttypemaintenance\" data-backdrop=\"static\" >Add New Item <span class=\"glyphicon glyphicon-plus-sign\"></span></button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div> <!-- end content -->\t\t\r\n");
      out.write("\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>  <!-- end page -->\r\n");
      out.write("\t</div><!-- end container -->\r\n");
      out.write("\t<div id=\"footer\">\t\t  \t\t\t\r\n");
      out.write("\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t");
      out.write('\r');
      out.write('\n');

	out.println("Copyright © 2015 <a href='http://7thclass-smallfoots.rhcloud.com/' target='_blank'>7thclass</a> All Rights Reserved.");

      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t \r\n");
      out.write("\t<div class=\"modal fade bs-example-modal-lg accounttypemaintenance\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog modal-lg\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\" style=\"background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title text-center\">Account Type Maintenance</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" role=\"form\" action=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"accounttypename\" class=\"col-sm-3 control-label\">Account Type\r\n");
      out.write("\t\t\t\t\t\t\t\tName:</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"accounttypename\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"withautoship\" class=\"col-sm-3 control-label\">With AutoShip?</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"withautoship\" value=\"1\" checked>Yes\r\n");
      out.write("\t\t\t\t\t\t\t\t</label> <label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"withautoship\" value=\"0\">No\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"annualfee\" class=\"col-sm-3 control-label\">Annual Fee:</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"annualfee\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"minbv\" class=\"col-sm-3 control-label\">Minimum BV:</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"minbv\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"withcompensation\" class=\"col-sm-3 control-label\">With Compensation?</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"withcompensation\" value=\"1\" checked>Yes\r\n");
      out.write("\t\t\t\t\t\t\t\t</label> <label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"withcompensation\" value=\"0\">No\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"promotion\" class=\"col-sm-3 control-label\">Accept Promotions?</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"promotion\" value=\"1\" checked>Yes\r\n");
      out.write("\t\t\t\t\t\t\t\t</label> <label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"promotion\" value=\"0\">No\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"description\" class=\"col-sm-3 control-label\">Description:\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea id=\"description\" class=\"form-control\" rows=\"2\"></textarea>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer text-center\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Save</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t \r\n");
      out.write("\t<div id=\"accounttypecancel\" class=\"modal fade bs-example-modal-sm\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog modal-sm\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\" style=\"background-color:#428bca;color:#fff;border-top-right-radius: 3px;border-top-left-radius: 3px;padding: 5px;\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title text-center\">Confirmation</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<div class=\"h2 text-center\">Alert</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"text-center\">You sure you want to delete record?</div>\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" role=\"form\" action=\"\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"p_id\" value=\"\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">No</button>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Yes</button>\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t \t\t \r\n");
      out.write("\t \t\t \t \t \t\t \t \r\n");
      out.write("\t<script src=\"http://libs.baidu.com/jquery/1.9.0/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script> \t\r\n");
      out.write("\t\t \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}