package com.schedule.medical.appointments.sma100.repository;

import com.schedule.medical.appointments.sma100.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String findByUsername);
}
