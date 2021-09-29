package com.knoldus.ebfts.service;

import com.knoldus.ebfts.model.Employee;
import com.knoldus.ebfts.model.Registration;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.util.Optional;

@Service
public class RegistrationService {
    public Optional<Registration> register(Employee employee) {
        if (employee != null) {
            Registration registration = new Registration();
            registration.setId(java.util.UUID.randomUUID());
            registration.setCreatedOn(Date.from(Instant.now()));
            registration.setEmployeeId(employee.getId());
            return Optional.of(registration);
        } else {
            return Optional.empty();
        }
    }
}
