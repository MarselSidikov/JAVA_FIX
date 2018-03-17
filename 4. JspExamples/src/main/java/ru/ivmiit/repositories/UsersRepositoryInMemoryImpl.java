package ru.ivmiit.repositories;

import ru.ivmiit.fake.FakeStorage;
import ru.ivmiit.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 14.03.2018
 * UsersRepositoryInMemoryImpl
 *
 * Реализация объекта доступа к данным с испольованием фейкового хранилища
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersRepositoryInMemoryImpl implements UsersRepository {
    public List<User> findAll() {
        return FakeStorage.storage().users();
    }

    @Override
    public void save(User user) {
        FakeStorage.storage().users().add(user);
    }

    @Override
    public boolean isExist(String name, String password) {
        for (User user : FakeStorage.storage().users()) {
            if (user.getName().equals(name) &&
                    user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }
}
