package ru.ivmiit.mvc.app;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.ivmiit.mvc.dao.UsersDao;
import ru.ivmiit.mvc.dao.UsersDaoJdbcTemplateImpl;
import ru.ivmiit.mvc.models.User;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * 18.04.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("qwerty007");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/fix_user_db");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl(dataSource);

        List<User> users = usersDao.findAll();

        System.out.println(users);
    }
}
