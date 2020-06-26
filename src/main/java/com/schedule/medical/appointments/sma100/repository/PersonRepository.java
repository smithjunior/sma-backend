package com.schedule.medical.appointments.sma100.repository;

import com.schedule.medical.appointments.sma100.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
