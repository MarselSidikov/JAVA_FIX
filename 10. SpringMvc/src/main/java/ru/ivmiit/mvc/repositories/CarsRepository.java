package ru.ivmiit.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.ivmiit.mvc.models.Car;

import java.util.List;

/**
 * 18.04.2018
 * CarsRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CarsRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByOwner_FirstName(String firstNameOwner);

    @Query(nativeQuery = true, value = "SELECT * FROM fix_car WHERE model = ?1;")
    List<Car> findAllByModel(String model);
}
