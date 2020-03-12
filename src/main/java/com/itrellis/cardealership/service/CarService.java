package com.itrellis.cardealership.service;

import com.itrellis.cardealership.model.Car;

import java.util.List;

/**
 * @author Vikash Danee on 3/10/20
 */
public interface CarService {

    Car save(Car car);
    List<Car> getCars();
    void deleteCars();
}
