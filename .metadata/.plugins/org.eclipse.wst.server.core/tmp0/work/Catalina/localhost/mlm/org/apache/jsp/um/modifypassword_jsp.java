/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2015-07-14 19:53:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.um;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modifypassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/um/../includes/header-nav.jsp", Long.valueOf(1433993521720L));
    _jspx_dependants.put("/um/../includes/footer.jsp", Long.valueOf(1431469116662L));
    _jspx_dependants.put("/um/../includes/nav-left.jsp", Long.valueOf(1431998658222L));
    _jspx_dependants.put("/um/../includes/getUserInfo.jsp", Long.valueOf(1431469116664L));
    _jspx_dependants.put("/um/../includes/header-img.jsp", Long.valueOf(1431469116665L));
    _jspx_dependants.put("/um/../includes/header.jsp", Long.valueOf(1431469116666L));
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
      out.write("/js/modifypassword.js\"></script>\t\t\r\n");
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
      out.write("\t\t\t\t<div class=\"col-md-9\">\r\n");
      out.write("\t\t\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h2\">Modify Password</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<form id=\"modifypassForm\" class=\"form-horizontal\" role=\"form\" action=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"subtitle\" >Modify Password Section</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"password\" class=\"col-sm-3 control-label\">Old Password:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"errmsg_opass\" class=\"col-sm-5 text-danger\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"newpassword1\" class=\"col-sm-3 control-label\">New Password:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"newpassword1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"errmsg_npass\" class=\"col-sm-5 text-danger\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"newpassword2\" class=\"col-sm-3 control-label\">Confirm\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tPassword:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"newpassword2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"errmsg_cpass\" class=\"col-sm-5 text-danger\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"response\" class=\"col-sm-offset-1 col-sm-10 alert alert-danger\" role=\"alert\"></div> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br/><br/>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-offset-3 col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Modify</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"modifypassword.jsp\"><button type=\"button\" class=\"btn btn-primary\">Reset</button></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div> <!-- end content -->\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"right\">\r\n");
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
