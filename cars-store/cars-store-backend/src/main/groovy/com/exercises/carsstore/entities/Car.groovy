package com.exercises.carsstore.entities

import com.exercises.carsstore.entities.common.BaseEntity
import org.springframework.stereotype.Component

@Component
class Car extends BaseEntity{
    private String brand
    private Integer horsepower
    private String color
    private Integer doors
    private String type

    Car(Long id, String name, Date createdAt, String brand, Integer horsepower, String color, Integer doors, String type) {
        super(id, name, createdAt)
        this.brand = brand
        this.horsepower = horsepower
        this.color = color
        this.doors = doors
        this.type = type
    }

    Car() {

    }

    String getBrand() {
        return brand
    }

    void setBrand(String brand) {
        this.brand = brand
    }

    Integer getHorsepower() {
        return horsepower
    }

    void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower
    }

    String getColor() {
        return color
    }

    void setColor(String color) {
        this.color = color
    }

    Integer getDoors() {
        return doors
    }

    void setDoors(Integer doors) {
        this.doors = doors
    }

    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }
}
