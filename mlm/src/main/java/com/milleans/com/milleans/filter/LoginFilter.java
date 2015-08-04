package com.milleans.com.milleans.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by LeHu on 8/3/15 8:56 PM.
 */
@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter started ---------------------------");

        HttpServletRequest httpServletRequest = (HttpServletRequest) req;

        if (httpServletRequest.getRequestURI().indexOf("registration4admin.jsp") != -1) {
            chain.doFilter(req, resp);
            return;
        }

        if (httpServletRequest.getRequestURI().indexOf("login") != -1) {
            chain.doFilter(req, resp);
            return;
        }

        if (httpServletRequest.getRequestURI().indexOf("logout") != -1) {
            chain.doFilter(req, resp);
            return;
        }

        if (httpServletRequest.getRequestURI().indexOf("registration*") != -1) {
            chain.doFilter(req, resp);
            return;
        }

        HttpSession session = httpServletRequest.getSession();

        //HttpServletResponse httpServletResponse = (HttpServletResponse) resp;

        if (session.getAttribute("uid") != null) {
            chain.doFilter(req, resp);
        } else {
            ((HttpServletResponse) resp).sendRedirect("/login");
        }

        chain.doFilter(req, resp);
        System.out.println("filter end -------------------------------");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
