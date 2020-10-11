package com.example.controller;


import com.example.entity.Drink;
import com.example.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class DrinkController {

    @Autowired
    private FoodService<Drink> drinkService;

    @RequestMapping(value = "/drink/text", method = RequestMethod.GET)
    @ResponseBody
    public String getText() {
        return "Ahahahah";
    }

    @RequestMapping(value = "/drink", method = RequestMethod.GET)
    @ResponseBody
    public List<Drink> getAllExamples() {
        createMockPizza();
        return drinkService.getAll();
    }

    @RequestMapping(value = "/drinkk", method = RequestMethod.GET)
    @ResponseBody
    public Drink setExamples() {
        return createMockPizza();
    }

    @RequestMapping(value = "/drink/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Drink getExample(@PathVariable("id") int exID) {
        return drinkService.getByID(exID);
    }

    @RequestMapping(value = "/drink", method = RequestMethod.POST)
    @ResponseBody
    public Drink saveExamples(@RequestBody Drink ex) {
        return drinkService.save(ex);
    }

    @RequestMapping(value = "/drink/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteExample(@PathVariable int id) {
        drinkService.remove(id);
    }

    private Drink createMockPizza() {
        Drink p = new Drink();
        p.setId(1);
        p.setName("Маргарита");
        p.setPrices("10 20 30");
        p.setVolumes("15 25 35");
        p.setPicture("dddd");

        return p;
    }
}
