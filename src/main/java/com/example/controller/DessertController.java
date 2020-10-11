package com.example.controller;

import com.example.entity.Dessert;
import com.example.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class DessertController {

    @Autowired
    private FoodService<Dessert> dessertService;

    @RequestMapping(value = "/dessert/text", method = RequestMethod.GET)
    @ResponseBody
    public String getText() {
        return "Ahahahah";
    }

    @RequestMapping(value = "/dessert", method = RequestMethod.GET)
    @ResponseBody
    public List<Dessert> getAllExamples() {
        createMockDessert();
        return dessertService.getAll();
    }

    @RequestMapping(value = "/dessertt", method = RequestMethod.GET)
    @ResponseBody
    public Dessert setExamples() {
        return createMockDessert();
    }

    @RequestMapping(value = "/dessert/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Dessert getExample(@PathVariable("id") int exID) {
        return dessertService.getByID(exID);
    }

    @RequestMapping(value = "/dessert", method = RequestMethod.POST)
    @ResponseBody
    public Dessert saveExamples(@RequestBody Dessert d) {
        return dessertService.save(d);
    }

    @RequestMapping(value = "/dessert/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteExample(@PathVariable int id) {
        dessertService.remove(id);
    }

    private Dessert createMockDessert() {
        Dessert p = new Dessert();
        p.setId(1);
        p.setName("Маргарита");
        p.setPrice("10 20 30");
        p.setWeight("15 25 35");
        p.setCount(5);
        p.setIngredient("Сыр");
        p.setPicture("dddd");

        return p;
    }
}
