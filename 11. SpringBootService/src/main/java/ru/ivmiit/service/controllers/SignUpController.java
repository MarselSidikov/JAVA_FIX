package ru.ivmiit.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.ivmiit.service.forms.UserForm;
import ru.ivmiit.service.services.SignUpService;

/**
 * 25.04.2018
 * SignUpController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class SignUpController {

    @Autowired
    private SignUpService service;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(UserForm userForm) {
        service.signUp(userForm);
        return "redirect:/login";
    }
}
