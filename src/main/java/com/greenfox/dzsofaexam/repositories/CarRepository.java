package com.greenfox.dzsofaexam.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.greenfox.dzsofaexam.models.*;

import java.util.List;


public interface CarRepository extends CrudRepository<Car, Long> {

    @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE 'DT_____'", nativeQuery = true)
    List<Car> findDiplomatcars();

    @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE 'RB_____'", nativeQuery = true)
    List<Car> fincPoliceCars();
//    @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE %?1% OR name LIKE %?1%", nativeQuery = true)
}
