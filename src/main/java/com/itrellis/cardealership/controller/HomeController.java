package com.itrellis.cardealership.controller;

import com.itrellis.cardealership.model.Car;
import com.itrellis.cardealership.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Vikash Danee on 3/10/20
 */
@RestController
@RequestMapping("/api/cars")
public class HomeController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List getEventPage() {
        return carService.getCars();
    }
}
