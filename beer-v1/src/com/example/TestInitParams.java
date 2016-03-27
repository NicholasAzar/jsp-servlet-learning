package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by nick on 25/03/16.
 */
public class TestInitParams extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        out.println("Servlet: adminEmail: " + getServletConfig().getInitParameter("adminEmail"));
        out.println("Context: adminEmail: " + getServletContext().getInitParameter("globalAdminEmail"));
    }
}
