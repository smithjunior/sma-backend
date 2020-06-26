package com.schedule.medical.appointments.sma100.controller;

import com.schedule.medical.appointments.sma100.entities.Doctor;
import com.schedule.medical.appointments.sma100.service.DoctorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
@CrossOrigin(origins = "*")
public class DoctorController {

    private static final Logger log = LoggerFactory.getLogger(DoctorController.class);

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping(path = "")
    public List<Doctor> index(){
        return this.doctorService.getAll();
    }

    @GetMapping(path = "/{id}")
    public Doctor find(@PathVariable Long id){
        return this.doctorService.find(id);
    }

    @PostMapping(path = "")
    public Doctor store(@RequestBody Doctor d){
        return this.doctorService.save(d);
    }

    @PutMapping(path = "/{id}")
    public Doctor update(@RequestBody Doctor d, @PathVariable Long id) {
        return this.doctorService.udpate(id, d);
    }

    @DeleteMapping("/{id}")
    public void destroy(@PathVariable Long id) { this.doctorService.delete(id); }

}
