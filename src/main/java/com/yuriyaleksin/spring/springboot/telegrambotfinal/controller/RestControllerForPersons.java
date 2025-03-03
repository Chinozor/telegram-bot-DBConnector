package com.yuriyaleksin.spring.springboot.telegrambotfinal.controller;


import com.yuriyaleksin.spring.springboot.telegrambotfinal.dto.PersonDTO;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.mapper.PersonMapper;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/person")
public class RestControllerForPersons {

    private final PersonService personService;

    @Autowired
    public RestControllerForPersons(PersonService personService, PersonMapper personMapper) {
        this.personService = personService;
    }

    @GetMapping("/test1")
    public List<PersonDTO> getPersons() {
        return personService.getAllPersons();
    }

    @PostMapping("/test2")
    public ResponseEntity<PersonDTO> savePerson(PersonDTO personDTO) {
        var response = personService.savePerson(personDTO);
        return ResponseEntity.created(URI.create("/food-intake/")).body(response);
    }

    @GetMapping("/test3/{id}")
    public PersonDTO getPersonById(@PathVariable Long id) {
        return personService.getPerson(id);
    }

    @DeleteMapping("/test4/{id}")
    public void  deletePersonById(@PathVariable Long id) {
        personService.deletePerson(id);
    }
}