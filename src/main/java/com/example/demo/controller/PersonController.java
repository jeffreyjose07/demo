package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/create")
    public Person create(@RequestParam String id, @RequestParam String firstName, @RequestParam String lastName, @RequestParam int age){
        return personService.create(id, firstName, lastName, age);
    }

    @GetMapping(value = "/all")
    public List<Person> getAll(){
        return personService.getAll();
    }

    @GetMapping(value = "/getByName")
    public Person getPerson(@RequestParam String firstName){
        return personService.getByFirstName(firstName);
    }

    @GetMapping(value = "/getByAge")
    public List<Person> getPersonsByAge(@RequestParam int age){
        return personService.getByAge(age);
    }

    @PostMapping(value = "/update")
    public Person update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age){
        return personService.update(firstName, lastName, age);
    }

    @GetMapping(value = "/deleteAll")
    public String deleteAll(){
        personService.deleteAll();
        return "Deleted all records";
    }
}
