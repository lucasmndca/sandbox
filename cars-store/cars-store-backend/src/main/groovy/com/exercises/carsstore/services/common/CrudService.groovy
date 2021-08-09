package com.exercises.carsstore.services.common

abstract class CrudService<T> {
    /**
     * Saves an entity
     * @param entity
     * @return {@link T}
     */
    abstract T save(T entity)

    /**
     * Deletes an entity
     * @param entity
     * @return {@link T}
     */
    abstract T delete(T entity)

    /**
     * Updates an entity
     * @param entity
     * @return {@link T}
     */
    abstract T update(T entity)

    /**
     * Gets an entity
     * @param entity
     * @return {@link T}
     */
    abstract T get(Long id)

    /**
     * Gets all entities
     * @return {@link List}
     */
    abstract List<T> getAll()
}
