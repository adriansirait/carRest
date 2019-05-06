package car.rest.controllers;

import car.rest.models.Cars;
import car.rest.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/home")
    public List<Cars> index(){
        return carRepository.findAll();
    }

    @GetMapping("/home/{id}")
    public Cars show(@PathVariable String id){
        int carId = Integer.parseInt(id);
        return carRepository.findOne(carId);
    }

}
