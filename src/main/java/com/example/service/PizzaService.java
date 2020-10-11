package com.example.service;

import com.example.entity.Pizza;

import java.util.List;

public interface PizzaService {

    List<Pizza> getAll();
    Pizza getByID(int id);
    Pizza save(Pizza ex);
    void remove(int id);
}
