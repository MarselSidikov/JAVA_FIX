package ru.ivmiit.mvc.dao;

import java.util.List;
import java.util.Optional;

/**
 * 04.04.2018
 * CrudDao
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CrudDao<T> {
    Optional<T> find(Long id);
    void save(T model);
    void update(T model);
    void delete(Long id);

    List<T> findAll();
}
