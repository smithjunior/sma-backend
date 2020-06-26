package com.schedule.medical.appointments.sma100.repository;

import com.schedule.medical.appointments.sma100.entities.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
