package com.exercises.carsstore.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com/exercises/carsstore")
class CarsStoreApplication {

	static void main(String[] args) {
		SpringApplication.run(CarsStoreApplication, args)
	}

}
