package com.example.controller;

import com.example.entity.Example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
@RequestMapping("/example")
public class ExampleController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getExample(ModelMap model) {
        return "re";
        //return createMockEx();
    }

    private Example createMockEx() {
        Example ex = new Example();
        ex.setId(1);
        ex.setRemindDate(new Date());
        ex.setTitle("First ex");

        return ex;
    }
}
