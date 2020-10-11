package com.example.controller;

import com.example.entity.Pizza;
import com.example.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class PizzaController {

    @Autowired
    private FoodService<Pizza> pizzaService;

    @RequestMapping(value = "/pizza/text", method = RequestMethod.GET)
    @ResponseBody
    public String getText() {
        return "Ahahahah";
    }

    @RequestMapping(value = "/pizza", method = RequestMethod.GET)
    @ResponseBody
    public List<Pizza> getAllExamples() {
        createMockPizza();
        return pizzaService.getAll();
    }

    @RequestMapping(value = "/pizzaa", method = RequestMethod.GET)
    @ResponseBody
    public Pizza setExamples() {
        return createMockPizza();
    }

    @RequestMapping(value = "/pizza/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Pizza getExample(@PathVariable("id") int exID) {
        return pizzaService.getByID(exID);
    }

    @RequestMapping(value = "/pizza", method = RequestMethod.POST)
    @ResponseBody
    public Pizza saveExamples(@RequestBody Pizza ex) {
        return pizzaService.save(ex);
    }

    @RequestMapping(value = "/pizza/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteExample(@PathVariable int id) {
        pizzaService.remove(id);
    }

    private Pizza createMockPizza() {
        Pizza p = new Pizza();
        p.setId(1);
        p.setName("Маргарита");
        p.setPrices("10 20 30");
        p.setWeights("15 25 35");
        p.setIngredient("Сыр");
        p.setPicture("dddd");

        return p;
    }
}
