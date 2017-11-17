package com.greenfox.dzsofaexam.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.greenfox.dzsofaexam.models.*;

import java.util.List;


public interface CarRepository extends CrudRepository<Car, Long> {

    @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE 'DT%'", nativeQuery = true)
    List<Car> getDiplomat();

    @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE 'RB%'", nativeQuery = true)
    List<Car> getPolice();


    @Query(value = "SELECT * FROM licence_plates WHERE car_brand = ?1", nativeQuery = true)
    List<Car> getByBrand(String brand);
//    @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE %?1% OR name LIKE %?1%", nativeQuery = true)
}
