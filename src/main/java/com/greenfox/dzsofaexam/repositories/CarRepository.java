package repository;

import model.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long>{


//    @Query(value = "SELECT * FROM licence_plates WHERE plate LIKE %?1% OR name LIKE %?1%", nativeQuery = true)
}
