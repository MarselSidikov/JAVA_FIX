package ru.ivmiit.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.ivmiit.service.repositories.UsersRepository;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * 18.04.2018
 * UsersController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class UsersController {


    @Value("${my.property}")
    private String myProperty;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        System.out.println(myProperty);
        model.addAttribute("usersFromServer", usersRepository.findAll());
        return "users";
    }
}
