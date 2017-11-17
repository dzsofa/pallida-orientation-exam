package com.greenfox.dzsofaexam.services;

import com.greenfox.dzsofaexam.models.Car;
import com.greenfox.dzsofaexam.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarService {

    @Autowired
    CarRepository carRepository;

    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }

    public List<Car> getPolice() {
        return carRepository.fincPoliceCars();
    }

    public List<Car> getDiplomat() {
        return carRepository.findDiplomatcars();
    }
}
