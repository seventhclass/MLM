package com.milleans.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

public class LoginFilter implements Filter {

	private FilterConfig config;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		
		HttpServletRequest   request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		HttpSession          session = request.getSession();
		
		String noLoginPaths = config.getInitParameter("noLoginPaths");
		
		if(noLoginPaths!= null){
		
			String[] strArray = noLoginPaths.split(";");
		
			for(int i = 0; i < strArray.length; i++){
				
				if(strArray[i] == null ) continue; //|| "".equals(strArray[i])
				
				if(request.getRequestURI().indexOf(strArray[i]) != -1){
					arg2.doFilter(arg0, arg1);
					return;
				}
			}
		}
		
		
		if (session.getAttribute("userid") != null){
			arg2.doFilter(arg0, arg1);
		}else{
			response.sendRedirect("um/login.jsp");
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		config = arg0;
	}

}
