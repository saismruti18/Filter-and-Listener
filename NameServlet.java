package com.sai;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NameServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException
    {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");

        PrintWriter pw = response.getWriter();

        pw.println("<html><body>");
        pw.println("<h2>Name Saved Successfully</h2>");
        pw.println("First Name: " + fname + "<br>");
        pw.println("Surname: " + lname);
        pw.println("</body></html>");
    }
}