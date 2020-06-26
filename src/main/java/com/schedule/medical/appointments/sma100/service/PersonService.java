package com.schedule.medical.appointments.sma100.service;

import com.schedule.medical.appointments.sma100.entities.Person;
import com.schedule.medical.appointments.sma100.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return (List<Person>) this.personRepository.findAll();
    }
}
