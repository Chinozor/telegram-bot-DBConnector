package com.yuriyaleksin.spring.springboot.telegrambotfinal.service;


import com.yuriyaleksin.spring.springboot.telegrambotfinal.dto.PersonDTO;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.mapper.PersonMapper;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper mapper;

    @Autowired
    public PersonService(PersonRepository personRepository, PersonMapper mapper) {
        this.personRepository = personRepository;
        this.mapper = mapper;
    }

    public List<PersonDTO> getAllPersons() {
        return mapper.toListDTO(personRepository.findAll());
    }

    public PersonDTO savePerson(PersonDTO personDTO) {
        return mapper.toDTO(personRepository.save(mapper.ToEntity(personDTO)));
    }

    public PersonDTO getPerson(Long id) {
        return mapper.toDTO(personRepository.findById(id).orElse(null));
    }


    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

}
