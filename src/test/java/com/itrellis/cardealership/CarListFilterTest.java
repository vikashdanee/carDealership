package com.itrellis.cardealership;

import com.itrellis.cardealership.model.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Vikash Danee on 3/11/20
 */
public class CarListFilterTest extends CardealershipApplicationTests{

    private List<Car> cars;

    @Before
    public void setup(){
      createList();
    }

    @Test
    public void applyFilterByMake() throws Exception{
        List<Car> filteredCars= cars.stream()
                .filter(car->car.getMake().equalsIgnoreCase("Mercedes"))
                .collect(Collectors.toList());
        assertFalse(filteredCars.isEmpty());

    }

    @Test
    public void applyFilterByMakeAndYear() throws Exception{
        List<Car> filteredCars= cars.stream()
                .filter(car->car.getMake().equalsIgnoreCase("Chevy")
                        && car.getYear().equals("2014"))
                .collect(Collectors.toList());
        assertTrue(filteredCars.isEmpty());

    }

    @Test
    public void applyFilterByPrice() throws Exception{

        Car filteredCar= cars.stream()
                .filter(car->car.getPrice().compareTo(new BigDecimal(10000))>0)
                .findFirst().orElse(null);
        Assert.assertNotNull(filteredCar);

    }

    @Test
    public void applyFilterByAllCarOptions() throws Exception{

        Car filteredCar= cars.stream()
                .filter(car->car.getHasSunroof()
                        && car.getFourWheelDrive()
                        && car.getHasHeatedSeats()
                        && car.getHasLowMiles()
                        && car.getHasNavigation()
                        && car.getHasPowerWindows())
                .findFirst().orElse(null);
        Assert.assertNull(filteredCar);

    }

    private void createList(){
        cars= new ArrayList<>();

        Car car = new Car();
        car.setMake("Chevy");
        car.setYear("2016");
        car.setColor("Gray");
        car.setPrice(new BigDecimal(16106));
        car.setHasSunroof(false);
        car.setFourWheelDrive(true);
        car.setHasLowMiles(true);
        car.setHasPowerWindows(false);
        car.setHasNavigation(true);
        car.setHasHeatedSeats(false);
        cars.add(car);


        Car car1 = new Car();
        car1.setMake("Mercedes");
        car1.setYear("2012");
        car1.setColor("Silver");
        car1.setPrice(new BigDecimal(18696));
        car1.setHasSunroof(true);
        car1.setFourWheelDrive(true);
        car1.setHasLowMiles(false);
        car1.setHasPowerWindows(true);
        car1.setHasNavigation(false);
        car1.setHasHeatedSeats(true);
        cars.add(car1);

        Car car2 = new Car();
        car2.setMake("Mercedes");
        car2.setYear("2016");
        car2.setColor("Black");
        car2.setPrice(new BigDecimal(18390));
        car2.setHasSunroof(true);
        car2.setFourWheelDrive(false);
        car2.setHasLowMiles(false);
        car2.setHasPowerWindows(true);
        car2.setHasNavigation(true);
        car2.setHasHeatedSeats(false);
        cars.add(car2);
    }
}
