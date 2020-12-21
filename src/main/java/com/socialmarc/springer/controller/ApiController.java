package com.socialmarc.springer.controller;

import com.socialmarc.springer.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ApiController {

    @GetMapping("/test")
    public @ResponseBody String test() {
        String returnText = "Test api";
        return returnText;
    }

    @PostMapping(value = "/person/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String personJson(@RequestBody Person person) {
        Person p = new Person();
        p.age = person.age + 20;
        p.name = "JSON, " + person.name;
        return p.toString();
    }

    @PostMapping(value = "/person/xml", consumes = MediaType.APPLICATION_XML_VALUE)
    public String personXML(@RequestBody Person person) {
        Person p = new Person();
        p.age = person.age + 20;
        p.name = "JSON, " + person.name;
        return p.toString();
    }

    @GetMapping("/json")
    public @ResponseBody String json() {
        String jsonStr = "{'name': 'Marc Wiese'}";
        return jsonStr;
    }

}
