package ru.ivmiit.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.ivmiit.mvc.dao.UsersDao;
import ru.ivmiit.mvc.forms.UserForm;
import ru.ivmiit.mvc.models.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * 18.04.2018
 * UsersController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class UsersController {

    @Autowired
    private UsersDao usersDao;

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public ModelAndView getAllUsers(@RequestParam(value = "first_name", required = false) String firstName) {
        List<User> users = null;

        if (firstName != null) {
            users = usersDao.findAllByFirstName(firstName);
        } else {
            users = usersDao.findAll();
        }
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("usersFromServer", users);
        return modelAndView;
    }

    @RequestMapping(path = "/users/{user-id}", method = RequestMethod.GET)
    public ModelAndView getUserById(@PathVariable("user-id") Long userId) {
        Optional<User> userCandidate = usersDao.find(userId);
        ModelAndView modelAndView = new ModelAndView("users");
        userCandidate.ifPresent(user -> modelAndView.addObject("usersFromServer",
                Collections.singletonList(user)));
        return modelAndView;
    }

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public String addUser(UserForm userForm) {
        User newUser = User.from(userForm);
        usersDao.save(newUser);
        return "redirect:/users";
    }
}
