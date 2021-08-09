package com.exercises.carsstore.entities.common

abstract class BaseEntity {

    private Long id
    private String name
    private Date createdAt

    public BaseEntity() {
    }

    public BaseEntity(Long id, String name, Date createdAt) {

    }

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Date getCreatedAt() {
        return createdAt
    }

    void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt
    }
}
