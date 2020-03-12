package com.itrellis.cardealership;

import com.itrellis.cardealership.model.Car;
import com.itrellis.cardealership.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author Vikash Danee on 3/10/20
 */
@Component
public class DataGenerator implements CommandLineRunner {
    private CarService carService;

    public DataGenerator(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void run(String... args) throws Exception {

        //check if database contains data or not
        if(this.carService.getCars()==null
                || this.carService.getCars().isEmpty()) {

            //creating test data
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

            carService.save(car);

            //second

            Car car1 = new Car();
            car1.setMake("Toyota");
            car1.setYear("2012");
            car1.setColor("Silver");
            car1.setPrice(new BigDecimal(18696));
            car1.setHasSunroof(true);
            car1.setFourWheelDrive(true);
            car1.setHasLowMiles(false);
            car1.setHasPowerWindows(true);
            car1.setHasNavigation(false);
            car1.setHasHeatedSeats(true);

            carService.save(car1);

            //third
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

            carService.save(car2);

            //fourth
            Car car3 = new Car();
            car3.setMake("Toyota");
            car3.setYear("2015");
            car3.setColor("White");
            car3.setPrice(new BigDecimal(15895));
            car3.setHasSunroof(true);
            car3.setFourWheelDrive(false);
            car3.setHasLowMiles(true);
            car3.setHasPowerWindows(true);
            car3.setHasNavigation(false);
            car3.setHasHeatedSeats(true);

            carService.save(car);

            //fifth
            Car car4 = new Car();
            car4.setMake("Ford");
            car4.setYear("2014");
            car4.setColor("Gray");
            car4.setPrice(new BigDecimal(19248));
            car4.setHasSunroof(false);
            car4.setFourWheelDrive(true);
            car4.setHasLowMiles(false);
            car4.setHasPowerWindows(false);
            car4.setHasNavigation(true);
            car4.setHasHeatedSeats(true);

            carService.save(car4);

            //sixth
            Car car5 = new Car();
            car5.setMake("Toyota");
            car5.setYear("2014");
            car5.setColor("Red");
            car5.setPrice(new BigDecimal(19248));
            car5.setHasSunroof(true);
            car5.setFourWheelDrive(false);
            car5.setHasLowMiles(true);
            car5.setHasPowerWindows(true);
            car5.setHasNavigation(true);
            car5.setHasHeatedSeats(true);

            carService.save(car5);

            //seventh
            Car car6 = new Car();
            car6.setMake("Mercedes");
            car6.setYear("2013");
            car6.setColor("Gray");
            car6.setPrice(new BigDecimal(15669));
            car6.setHasSunroof(false);
            car6.setFourWheelDrive(false);
            car6.setHasLowMiles(true);
            car6.setHasPowerWindows(false);
            car6.setHasNavigation(false);
            car6.setHasHeatedSeats(false);

            carService.save(car6);

            //eighth
            Car car7 = new Car();
            car7.setMake("Toyota");
            car7.setYear("2015");
            car7.setColor("White");
            car7.setPrice(new BigDecimal(16629));
            car7.setHasSunroof(false);
            car7.setFourWheelDrive(false);
            car7.setHasLowMiles(true);
            car7.setHasPowerWindows(false);
            car7.setHasNavigation(false);
            car7.setHasHeatedSeats(true);

            carService.save(car7);

            System.out.println("Database Initialized");
        }

    }

}
