package com.schedule.medical.appointments.sma100.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Person extends AbstractPerson {
    private String cpf;
}
