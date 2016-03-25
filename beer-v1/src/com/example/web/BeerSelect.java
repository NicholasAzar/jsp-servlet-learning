package com.example.web;

import com.example.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by nick on 25/03/16.
 */
public class BeerSelect extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("Hello World!!");
    }

    /**
     *
     * @param request
     * @param response
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.setContentType("text/html");

//        PrintWriter out = response.getWriter();
//        out.println("Beer Selection Advice<br />");

        String c = request.getParameter("color");
//        out.println("<br />Got beer color: " + c);

        BeerExpert beerExpert = new BeerExpert();
        List<String> brands = beerExpert.getBrands(c);

//        for (String brand : brands) {
//            out.println("<br />try: " + brand);
//        }

        request.setAttribute("styles", brands);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}
