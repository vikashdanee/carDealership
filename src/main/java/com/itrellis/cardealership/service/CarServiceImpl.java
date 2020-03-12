package com.itrellis.cardealership.service;

import com.itrellis.cardealership.model.Car;
import com.itrellis.cardealership.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vikash Danee on 3/10/20
 */
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public void deleteCars() {
         carRepository.deleteAll();
    }
}
