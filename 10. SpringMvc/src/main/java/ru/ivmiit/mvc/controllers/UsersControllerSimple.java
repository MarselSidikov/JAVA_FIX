package ru.ivmiit.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import ru.ivmiit.mvc.dao.UsersDao;
import ru.ivmiit.mvc.models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 18.04.2018
 * UsersControllerSimple
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersControllerSimple implements Controller {

    @Autowired
    private UsersDao usersDao;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        if (httpServletRequest.getMethod().equals("GET")) {
            List<User> users = usersDao.findAll();
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("users");
            modelAndView.addObject("usersFromServer", users);
            return modelAndView;
        }

        return null;
    }
}
