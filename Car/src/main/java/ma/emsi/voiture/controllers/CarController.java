package ma.emsi.voiture.controllers;

import lombok.RequiredArgsConstructor;
import ma.emsi.voiture.entities.Car;
import ma.emsi.voiture.dto.CarResponse;
import ma.emsi.voiture.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/car")
public class CarController {

    @Autowired
    private  CarService carService;

    @GetMapping
    public List<CarResponse> findAll() {
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public CarResponse findById(@PathVariable Long id) throws Exception {
        return carService.findById(id);
    }

}
