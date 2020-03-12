package com.itrellis.cardealership.controller;

import com.itrellis.cardealership.model.Car;
import com.itrellis.cardealership.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Vikash Danee on 3/10/20
 */
@Controller
@RequestMapping("/register")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String getEventPage(ModelMap map) {
        return "carRegister";
    }

    @PostMapping
    public String getSaveEvent(@ModelAttribute Car car, ModelMap map) {
        carService.save(car);
        List<Car> cars = carService.getCars();
        map.put("cars", cars);
        return "redirect:/api/cars";
    }
}
