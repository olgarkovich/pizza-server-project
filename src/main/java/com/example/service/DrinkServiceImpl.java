package com.example.service;

import com.example.entity.Drink;
import com.example.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkServiceImpl implements DrinkService {

    @Autowired
    private DrinkRepository repository;

    public List<Drink> getAll() {
        return repository.findAll();
    }

    public Drink getByID(int id) {
        return repository.findOne(id);
    }

    public Drink save(Drink ex) {
        return repository.saveAndFlush(ex);
    }

    public void remove(int id) {
        repository.delete(id);
    }
}
