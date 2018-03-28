package org.hhw.study.restonspringwebmvc.controller;

import org.hhw.study.restonspringwebmvc.domain.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * {@link Person}
 *  Created by houhongwei on 2018/3/26.
 */
@RestController
public class PersonRestController {

    @GetMapping("/person/{id}")
    public Person person(@PathVariable Long id, @RequestParam(required=false) String name){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        return person;
    }

    @PostMapping(value = "/person/json/to/properties",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = "application/properties+person"
    )
    public Person person2Properties(@RequestBody Person person) {
        return  person;
    }

    @PostMapping(value = "/person/properties/to/json",
            consumes = "application/properties+person",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public Person person2Json(@RequestBody Person person) {
        return  person;
    }
}
