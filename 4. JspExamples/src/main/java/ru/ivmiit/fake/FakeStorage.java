package ru.ivmiit.fake;

import ru.ivmiit.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 14.03.2018
 * FakeStorage
 *
 * Класс, реализующий паттеррн Singleton
 * Представляет собой InMemory-хранилище для получения информации о зарегистрированных пользователях
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class FakeStorage {
    // переменная, которая хранит ссылку на единственный экземпляр объекта класса FakeStorage
    private static final FakeStorage storage;

    // статически инициализатор, создающий объект класса FakeStorage. Вызывается один раз при загрузке класса в JVM
    static {
        storage = new FakeStorage();
    }

    // поле-список, хранящее список пользователей системы
    private List<User> users;

    // приватный констуктор, выполняющий инициализацию списка
    private FakeStorage() {
        this.users = new ArrayList<>();
        User user = new User("Marsel", "qwerty007", LocalDate.parse("1994-02-02"));
        User user1 = new User("Marsel1", "qwerty007", LocalDate.parse("1994-02-02"));
        User user2 = new User("Marsel2", "qwerty007", LocalDate.parse("1994-02-02"));

        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    // метод, предоставляющий доступ к объекту класса
    public static FakeStorage storage() {
        return storage;
    }

    // метод, возвращающий список пользователей
    public List<User> users() {
        return users;
    }
}
