package com.milleans.com.milleans.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
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




        chain.doFilter(req, resp);
        System.out.println("filter end -------------------------------");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
