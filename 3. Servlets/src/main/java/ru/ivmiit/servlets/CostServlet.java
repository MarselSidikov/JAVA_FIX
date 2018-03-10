package ru.ivmiit.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 07.03.2018
 * CostServlet
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class CostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String kmAsString = request.getParameter("km");
        String kgAsString = request.getParameter("kg");

        int km = Integer.parseInt(kmAsString);
        double kg = Double.parseDouble(kgAsString);

        CostCalculator costCalculator = new CostCalculator(500, 20);
        double cost = costCalculator.calcCost(kg, km);

        PrintWriter printWriter = response.getWriter();

        printWriter.write("<h1>Cost:</h1>");
        printWriter.write("<h2>" + cost + "</h2>");


    }
}
