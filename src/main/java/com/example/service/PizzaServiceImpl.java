package com.example.service;

import com.example.entity.Pizza;
import com.example.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements FoodService<Pizza> {

    @Autowired
    private PizzaRepository repository;

    public List<Pizza> getAll() {
        return repository.findAll();
    }

    public Pizza getByID(int id) {
        return repository.findOne(id);
    }

    public Pizza save(Pizza p) {
        return repository.saveAndFlush(p);
    }

    public void remove(int id) {
        repository.delete(id);
    }
}
