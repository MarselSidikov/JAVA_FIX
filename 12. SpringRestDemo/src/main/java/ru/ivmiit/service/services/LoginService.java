package ru.ivmiit.service.services;

import ru.ivmiit.service.forms.LoginForm;
import ru.ivmiit.service.transfer.TokenDto;

/**
 * 25.04.2018
 * LoginService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface LoginService {
    TokenDto login(LoginForm loginForm);
}
