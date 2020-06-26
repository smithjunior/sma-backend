package com.schedule.medical.appointments.sma100.repository;

import com.schedule.medical.appointments.sma100.entities.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
}
