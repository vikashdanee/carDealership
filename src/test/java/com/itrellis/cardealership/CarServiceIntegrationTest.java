package com.itrellis.cardealership;

import com.itrellis.cardealership.model.Car;
import com.itrellis.cardealership.repository.CarRepository;
import com.itrellis.cardealership.service.CarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Vikash Danee on 3/11/20
 */

public class CarServiceIntegrationTest extends CardealershipApplicationTests{

    @Autowired
    private CarService carService;

    @Test
    public void testSave(){
        Car car = new Car();
        car.setMake("Mercedes");

        Car foundCar= carService.save(car);
        assertEquals(foundCar.getMake(),car.getMake());
    }

    @Test
    public void testFindAll(){
        Car car = new Car();
        car.setMake("Mercedes");
        carService.save(car);

        List<Car> cars = carService.getCars();
        assertFalse(cars.isEmpty());
    }
}
