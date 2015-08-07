package com.milleans.com.milleans.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by LeHu on 8/3/15 8:56 PM.
 */
//@WebFilter(filterName = "LoginFilter", urlPatterns = {"/*"},
//        initParams = {
//                @WebInitParam(name = "noCheck",
//                        value = "login;login.jsp;index.jsp;selectAutoship;selectAccount;registration;logout;registration4admin.jsp;termcondition.jsp")})
public class LoginFilter implements Filter {

    private FilterConfig filterConfig;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter started ---------------------------");

        HttpServletRequest httpServletRequest = (HttpServletRequest) req;

        String noCheck = filterConfig.getInitParameter("noCheck");

        if (noCheck != null) {
            String[] strArray = noCheck.split(noCheck);
            for (int i = 0; i < strArray.length; i++) {

                if (strArray[i] == null || "".equals(strArray[i]))
                    continue;

                if (httpServletRequest.getRequestURI().indexOf(strArray[i]) != -1) {
                    chain.doFilter(req, resp);
                    return;
                }
            }
        }

        HttpSession session = ((HttpServletRequest) req).getSession();
        HttpServletResponse httpResponse = (HttpServletResponse) resp;

        if (session.getAttribute("uid") != null) {
            chain.doFilter(req, resp);
        } else {
            httpResponse.sendRedirect("login");
        }

        System.out.println("filter end -------------------------------");
    }

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig = config;
    }

}
