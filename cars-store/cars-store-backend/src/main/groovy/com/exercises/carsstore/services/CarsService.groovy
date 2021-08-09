package com.exercises.carsstore.services

import com.exercises.carsstore.entities.Car
import com.exercises.carsstore.services.common.CrudService

class CarsService extends CrudService<Car> {
    @Override
    Car save(Car entity) {
        return new Car()
    }

    @Override
    Car delete(Car entity) {
        return new Car()
    }

    @Override
    Car update(Car entity) {
        return new Car()
    }

    @Override
    Car get(Long id) {
        return new Car()
    }

    @Override
    List<Car> getAll() {
        return Collections.singletonList(new Car())
    }
}
