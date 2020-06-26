package com.schedule.medical.appointments.sma100;

import com.schedule.medical.appointments.sma100.entities.Doctor;
import com.schedule.medical.appointments.sma100.repository.DoctorRepository;
import com.schedule.medical.appointments.sma100.service.DoctorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
