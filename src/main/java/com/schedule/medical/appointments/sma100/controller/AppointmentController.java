package com.schedule.medical.appointments.sma100.controller;

import com.schedule.medical.appointments.sma100.entities.Appointment;
import com.schedule.medical.appointments.sma100.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "*")
public class AppointmentController {
    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public Appointment store(@RequestBody Appointment appointment) {
        return this.appointmentService.save(appointment);
    }
}
