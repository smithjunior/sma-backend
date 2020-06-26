package com.schedule.medical.appointments.sma100.service;

import com.schedule.medical.appointments.sma100.entities.Appointment;
import com.schedule.medical.appointments.sma100.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment save(Appointment a) {
        return this.appointmentRepository.save(a);
    }

}
