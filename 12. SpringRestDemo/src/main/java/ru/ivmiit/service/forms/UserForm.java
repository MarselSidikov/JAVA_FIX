package ru.ivmiit.service.forms;

import lombok.Data;

/**
 * 18.04.2018
 * UserForm
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Data
public class UserForm {
    private String firstName;
    private String lastName;
    private String login;
    private String password;
}
