/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2015-07-14 19:08:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.um;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/um/../includes/header-nav.jsp", Long.valueOf(1433993521720L));
    _jspx_dependants.put("/um/../includes/footer.jsp", Long.valueOf(1431469116662L));
    _jspx_dependants.put("/um/../includes/getUserInfo.jsp", Long.valueOf(1431469116664L));
    _jspx_dependants.put("/um/../includes/header-img.jsp", Long.valueOf(1431469116665L));
    _jspx_dependants.put("/um/../includes/header.jsp", Long.valueOf(1431469116666L));
    _jspx_dependants.put("/um/../includes/functionbar.jsp", Long.valueOf(1436893059126L));
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
      out.write("\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/css/cart.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t<script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script> \r\n");
      out.write("\t<![endif]-->\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/mlm.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/cart.js\"></script>\t\r\n");
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
      out.write("\r\n");
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
      out.write("/order/myOrderList'><button type='button' class='btn btn-info'><span class='glyphicon glyphicon-list-alt'></span> My Orders </button></a>\r\n");
      out.write("\t\t\t<a class=\"myshoppingcart_btn\" href='");
      out.print(request.getContextPath());
      out.write("/myshoppingcart'><button type='button' class='btn btn-danger'><span class='glyphicon glyphicon-shopping-cart'></span> My Shopping Cart <span data-totalamount=\"\" class='badge myshoppingcartitemnumber'></span></button></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"page\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\t\r\n");
      out.write("\t\t\t\t\t\t<div id=\"succes-info\">\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-offset-1 col-sm-10\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img style=\"width: 25px; height: 30px\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/logo/ok.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"h4\">Products have been successfully added to shopping cart!</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"settle-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-offset-2 col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href='");
      out.print(request.getContextPath());
      out.write("/myshoppingcart'><button type=\"button\" class=\"btn btn-danger\">Go Cart Settlement</button></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-5\" style=\"margin-top:6px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tYou can also <a href=\"");
      out.print(request.getContextPath());
      out.write("/products\">continue shopping</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div> <!-- end content -->\t\r\n");
      out.write("\t\t\t\t");
      out.write("<!-- end showcart -->\t\t\t\t\t\r\n");
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
      out.write("\t \t \r\n");
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
