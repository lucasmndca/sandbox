package com.exercises.carsstore.web

import com.exercises.carsstore.entities.Car
import com.exercises.carsstore.services.CarsService
import com.exercises.carsstore.web.common.CrudController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CarsController extends CrudController<Car> {

    @Autowired
    CarsService service

    @Override
    @PostMapping("cars/save")
    Car save(@RequestBody Car entity) {
        return null
    }

    @Override
    @PostMapping("cars/delete")
    Car delete(@RequestBody Car entity) {
        return null
    }

    @Override
    @PutMapping("cars/update")
    Car update(@RequestBody Car entity) {
        return null
    }

    @Override
    @GetMapping("cars/{id}")
    Car get(@RequestBody Long id) {
        return service.get(id)
    }

    @Override
    @GetMapping("cars")
    List<Car> getAll() {
        return service.getAll()
    }
}
