package com.example.service;

import com.example.entity.Dessert;

import java.util.List;

public interface DessertService {

    List<Dessert> getAll();
    Dessert getByID(int id);
    Dessert save(Dessert ex);
    void remove(int id);
}
