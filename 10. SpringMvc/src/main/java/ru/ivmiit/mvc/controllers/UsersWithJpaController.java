package ru.ivmiit.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.ivmiit.mvc.forms.UserForm;
import ru.ivmiit.mvc.models.User;
import ru.ivmiit.mvc.repositories.UsersRepository;

import java.util.List;

/**
 * 18.04.2018
 * UsersWithJpaController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class UsersWithJpaController {

    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(path = "/jpa/users", method = RequestMethod.GET)
    public ModelAndView getUsers(@RequestParam(required = false, name = "first_name") String firstName) {
        List<User> users = null;

        if (firstName != null) {
            users = usersRepository.findAllByFirstName(firstName);
        } else {
            users = usersRepository.findAll();
        }
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("usersFromServer", users);
        return modelAndView;
    }

    @RequestMapping(path = "/jpa/users", method = RequestMethod.POST)
    public String addUser(UserForm userForm) {
        User newUser = User.from(userForm);
        usersRepository.save(newUser);
        return "redirect:/jpa/users";
    }
}
