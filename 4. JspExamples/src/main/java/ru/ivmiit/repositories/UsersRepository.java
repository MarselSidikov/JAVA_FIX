package ru.ivmiit.repositories;

import ru.ivmiit.models.User;

import java.util.List;

/**
 * 14.03.2018
 * UsersRepository
 *
 * Интерфейс, описывающий поведение объекта, предоставляющего доступ к данным (паттерн DAO)
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersRepository {
    List<User> findAll();
    void save(User user);
    boolean isExist(String name, String password);
}
