package com.example.controller;

import com.example.entity.Example;
import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/app")
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping(value = "/examples/text", method = RequestMethod.GET)
    @ResponseBody
    public String getText() {
        return "Ahahahah";
    }

    @RequestMapping(value = "/examples", method = RequestMethod.GET)
    @ResponseBody
    public List<Example> getAllExamples() {
        createMockEx();
        return exampleService.getAll();
    }

    @RequestMapping(value = "/examples/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Example getExample(@PathVariable("id") int exID) {
        return exampleService.getByID(exID);
    }

    @RequestMapping(value = "/examples", method = RequestMethod.POST)
    @ResponseBody
    public Example saveExamples(@RequestBody Example ex) {
        return exampleService.save(ex);
    }

    @RequestMapping(value = "/examples/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteExample(@PathVariable int id) {
        exampleService.remove(id);
    }

    private Example createMockEx() {
        Example ex = new Example();
        ex.setId(1);
        ex.setRemindDate(new Date());
        ex.setTitle("First ex");

        return ex;
    }
}
