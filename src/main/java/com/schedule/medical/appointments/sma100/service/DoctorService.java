package com.schedule.medical.appointments.sma100.service;

import com.schedule.medical.appointments.sma100.entities.Doctor;
import com.schedule.medical.appointments.sma100.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAll() {
        return (List<Doctor>) this.doctorRepository.findAll();
    }

    public Doctor save(Doctor d) { return this.doctorRepository.save(d); }

    public Doctor find(Long id) { return this.doctorRepository.findById(id).get(); }

    public Doctor udpate(Long id, Doctor d) {
        return this.doctorRepository.findById(id).map(doctor -> {
            doctor.setName(d.getName());
            doctor.setCrm(d.getCrm());
            doctor.setState(d.getState());
            return this.doctorRepository.save(doctor);

        }).orElseGet(() -> {
            d.setId(id);
            return this.doctorRepository.save(d);
        });
    }

    public void delete(Long id) {
        this.doctorRepository.deleteById(id);
    }

}
