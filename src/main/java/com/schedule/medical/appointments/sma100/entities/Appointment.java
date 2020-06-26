package com.schedule.medical.appointments.sma100.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "appointments")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Appointment extends AbstractEntity{
    private String description;

    @ManyToOne
    private Person person;
    @ManyToOne
    private Doctor doctor;

    @Column(name = "appointment_at")
    private Instant appointmentDateTime;
}
