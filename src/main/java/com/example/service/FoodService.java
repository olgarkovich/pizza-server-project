package com.example.service;

import com.example.entity.Pizza;

import java.util.List;

public interface FoodService<T> {

    List<T> getAll();
    T getByID(int id);
    T save(T ex);
    void remove(int id);
}
