package com.example.service;

import com.example.entity.Example;

import java.util.List;

public interface ExampleService {

    List<Example> getAll();
    Example getByID(int id);
    Example save(Example ex);
    void remove(int id);

}
