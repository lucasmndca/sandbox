package com.exercises.carsstore.web;

import com.exercises.carsstore.entities.Accessory
import com.exercises.carsstore.services.AccessoriesService;
import com.exercises.carsstore.web.common.CrudController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AccessoriesController extends CrudController<Accessory> {

   @Autowired
   AccessoriesService service

    @Override
    @PostMapping("accessories/save")
    Accessory save(@RequestBody Accessory entity) {
        return null
    }

    @Override
    @PostMapping("accessories/delete")
    Accessory delete(@RequestBody Accessory entity) {
        return null
    }

    @Override
    @PutMapping("accessories/update")
    Accessory update(@RequestBody Accessory entity) {
        return null
    }

    @Override
    @GetMapping("accessories/{id}")
    Accessory get(@RequestBody Long id) {
        return service.get(id)
    }

    @Override
    @GetMapping("accessories")
    List<Accessory> getAll() {
        return service.getAll()
    }
}
