package com.exercises.carsstore.web

import com.exercises.carsstore.entities.Part
import com.exercises.carsstore.services.PartsService
import com.exercises.carsstore.web.common.CrudController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping

import java.util.List

class PartsController extends CrudController<Part> {

    @Autowired
    PartsService service

    @Override
    @PostMapping("parts/save")
    Part save(Part entity) {
        return null
    }

    @Override
    @PostMapping("parts/delete")
    Part delete(Part entity) {
        return null
    }

    @Override
    @PutMapping("parts/update")
    Part update(Part entity) {
        return null
    }

    @Override
    @GetMapping("parts/{id}")
    Part get(Long id) {
        return service.get(id)
    }

    @Override
    @GetMapping("parts")
    List<Part> getAll() {
        return service.getAll()
    }
}
