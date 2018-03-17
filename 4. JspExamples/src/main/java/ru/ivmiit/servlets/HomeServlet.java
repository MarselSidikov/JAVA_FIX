package ru.ivmiit.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 14.03.2018
 * HomeServlet
 *
 * Сервлет, который работает со страницей home
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    // в случае GET-запроса следует просто отдать страницу home
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/jsp/home.jsp").forward(req, resp);
    }

    // обработка запроса, который должен поменять цвет заголовка
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // получаем параметр запроса
        String color = req.getParameter("color");
        // создаем Cookie с данным значением
        Cookie colorCookie = new Cookie("color", color);
        // кладем в ответ
        resp.addCookie(colorCookie);
        // перенаправляем пользователя обратно на страницу home
        resp.sendRedirect(req.getContextPath() + "/home");
    }
}
