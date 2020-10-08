package com.example.service;

import com.example.entity.Example;
import com.example.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    private ExampleRepository repository;

    public List<Example> getAll() {
        return repository.findAll();
    }

    public Example getByID(int id) {
        return repository.findOne(id);
    }

    public Example save(Example ex) {
        return repository.saveAndFlush(ex);
    }

    public void remove(int id) {
        repository.delete(id);
    }
}
