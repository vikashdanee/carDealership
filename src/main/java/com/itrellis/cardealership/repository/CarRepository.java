package com.itrellis.cardealership.repository;

import com.itrellis.cardealership.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Vikash Danee on 3/10/20
 */

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
