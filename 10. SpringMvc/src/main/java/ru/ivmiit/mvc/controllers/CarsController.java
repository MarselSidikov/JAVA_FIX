package ru.ivmiit.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ru.ivmiit.mvc.models.Car;
import ru.ivmiit.mvc.repositories.CarsRepository;
import ru.ivmiit.mvc.repositories.UsersRepository;

import java.util.List;

/**
 * 18.04.2018
 * CarsController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class CarsController {

    @Autowired
    private CarsRepository carsRepository;

    @RequestMapping(path = "/cars", method = RequestMethod.GET)
    @ResponseBody
    public String getCarsByOwnerFirstName(@RequestParam(name = "first_name") String firstName) {
        List<Car> cars = carsRepository.findAllByOwner_FirstName(firstName);
        return cars.toString();
    }
}
