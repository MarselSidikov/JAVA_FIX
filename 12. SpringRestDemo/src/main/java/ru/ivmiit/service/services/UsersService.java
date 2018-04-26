package ru.ivmiit.service.services;

import ru.ivmiit.service.forms.UserForm;
import ru.ivmiit.service.models.User;

import java.util.List;

/**
 * 25.04.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

public interface UsersService {
    void signUp(UserForm userForm);

    List<User> findAll();

    User findOne(Long userId);
}
