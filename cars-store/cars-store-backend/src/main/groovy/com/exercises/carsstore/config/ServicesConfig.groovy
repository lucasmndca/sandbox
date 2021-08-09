package com.exercises.carsstore.config

import com.exercises.carsstore.services.AccessoriesService
import com.exercises.carsstore.services.CarsService
import com.exercises.carsstore.services.PartsService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ServicesConfig {

    @Bean
    AccessoriesService accessoriesService() {
        return new AccessoriesService()
    }

    @Bean
    CarsService carsService() {
        return new CarsService()
    }

    @Bean
    PartsService partsService() {
        return new PartsService()
    }
}
