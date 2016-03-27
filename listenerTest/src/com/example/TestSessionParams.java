package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by nick on 27/03/16.
 */
public class TestSessionParams extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("test session attributes <br />");

        HttpSession session = request.getSession();

        synchronized (session) {
            session.setAttribute("foo", "22");
            session.setAttribute("bar", "42");

            out.println(session.getAttribute("foo"));
            out.println(session.getAttribute("bar"));
        }

    }
}
