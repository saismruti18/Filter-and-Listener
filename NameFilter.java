package com.sai;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NameFilter implements Filter {

    public void init(FilterConfig fc) {
        System.out.println("Filter initialized");
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        String lname = request.getParameter("lname");
        PrintWriter pw = response.getWriter();

        if (lname == null || lname.equals("")) {
            pw.println("<h3>Surname is required!</h3>");
        } else {
            chain.doFilter(request, response); // go to servlet
        }
    }

    public void destroy() {
        System.out.println("Filter destroyed");
    }
}

