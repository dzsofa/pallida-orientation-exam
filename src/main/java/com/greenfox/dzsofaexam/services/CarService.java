package service;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.CarRepository;

@Component
public class CarService {

    @Autowired
    CarRepository carRepository;

    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }
}
