package com.example.service;

import com.example.entity.Dessert;
import com.example.repository.DessertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DessertServiceImpl implements FoodService<Dessert> {

    @Autowired
    private DessertRepository repository;

    public List<Dessert> getAll() {
        return repository.findAll();
    }

    public Dessert getByID(int id) {
        return repository.findOne(id);
    }

    public Dessert save(Dessert ex) {
        return repository.saveAndFlush(ex);
    }

    public void remove(int id) {
        repository.delete(id);
    }
}
