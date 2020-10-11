package com.example.service;

import com.example.entity.Drink;

import java.util.List;

public interface DrinkService {

    List<Drink> getAll();
    Drink getByID(int id);
    Drink save(Drink ex);
    void remove(int id);
}
