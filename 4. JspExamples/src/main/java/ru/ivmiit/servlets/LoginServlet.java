package ru.ivmiit.servlets;

import ru.ivmiit.repositories.UsersRepository;
import ru.ivmiit.repositories.UsersRepositoryInMemoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 14.03.2018
 * LoginServlet
 *
 * Сервлет, позволяющий польователю войти в систему
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    // ссылка на хранилище пользователей
    private UsersRepository usersRepository;

    @Override
    public void init() throws ServletException {
        this.usersRepository = new UsersRepositoryInMemoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // вытаскиваем из запроса имя пользователя и его пароль
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        // если пользователь есть в системе
        if (usersRepository.isExist(name, password)) {
            // создаем для него сессию
            HttpSession session = req.getSession();
            // кладем в атрибуты сессии атрибут user с именем пользователя
            session.setAttribute("user", name);
            // перенаправляем на страницу home
            req.getServletContext().getRequestDispatcher("/home").forward(req, resp);
        } else {
            resp.sendRedirect(req.getContextPath() + "/login");
        }

    }
}
