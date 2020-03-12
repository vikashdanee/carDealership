package com.itrellis.cardealership.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * @author Vikash Danee on 3/10/20
 */

@Entity
public class Car implements Serializable {

    private  static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String make;
    @Column
    private String year;
    @Column
    private String color;
    @Column
    private BigDecimal price;
    @Column
    private Boolean hasSunroof;
    @Column
    private Boolean fourWheelDrive;
    @Column
    private Boolean hasLowMiles;
    @Column
    private Boolean hasPowerWindows;
    @Column
    private Boolean hasNavigation;
    @Column
    private Boolean hasHeatedSeats;

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(Boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public Boolean getFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(Boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public Boolean getHasLowMiles() {
        return hasLowMiles;
    }

    public void setHasLowMiles(Boolean hasLowMiles) {
        this.hasLowMiles = hasLowMiles;
    }

    public Boolean getHasPowerWindows() {
        return hasPowerWindows;
    }

    public void setHasPowerWindows(Boolean hasPowerWindows) {
        this.hasPowerWindows = hasPowerWindows;
    }

    public Boolean getHasNavigation() {
        return hasNavigation;
    }

    public void setHasNavigation(Boolean hasNavigation) {
        this.hasNavigation = hasNavigation;
    }

    public Boolean getHasHeatedSeats() {
        return hasHeatedSeats;
    }

    public void setHasHeatedSeats(Boolean hasHeatedSeats) {
        this.hasHeatedSeats = hasHeatedSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id.equals(car.id) &&
                Objects.equals(make, car.make) &&
                Objects.equals(year, car.year) &&
                Objects.equals(color, car.color) &&
                Objects.equals(price, car.price) &&
                Objects.equals(hasSunroof, car.hasSunroof) &&
                Objects.equals(fourWheelDrive, car.fourWheelDrive) &&
                Objects.equals(hasLowMiles, car.hasLowMiles) &&
                Objects.equals(hasPowerWindows, car.hasPowerWindows) &&
                Objects.equals(hasNavigation, car.hasNavigation) &&
                Objects.equals(hasHeatedSeats, car.hasHeatedSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, year, color, price, hasSunroof, fourWheelDrive, hasLowMiles, hasPowerWindows, hasNavigation, hasHeatedSeats);
    }
}
