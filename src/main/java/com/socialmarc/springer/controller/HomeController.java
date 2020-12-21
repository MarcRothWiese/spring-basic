package com.socialmarc.springer.controller;

import com.socialmarc.springer.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/error")
    public String sayError() {
        return "Error happend";
    }

    @GetMapping("/person")
    public Person getPerson() {
        Person person = new Person();
        person.age = 40;
        person.name = "Marc Wiese";
        return person;
    }

}
