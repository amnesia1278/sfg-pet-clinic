package com.example.sfgpetclinic.services;

import com.example.sfgpetclinic.model.Pet;

import java.util.Set;

public interface CrudService<T, ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
