package com.knoldus.ebfts.service;

import com.knoldus.ebfts.model.Employee;
import com.knoldus.ebfts.model.Registration;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationServiceTest {

    @Test
    public void givenEmployeeAsNullShouldReturnEmpty() {
        RegistrationService sut = new RegistrationService();
        Optional<Registration> actualResult = sut.register(null);
        Optional<Registration> expectedResult = Optional.empty();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenValidEmployeeShouldReturnRegistrationObject() {
        String testId = "Test";
        RegistrationService sut = new RegistrationService();
        Employee validEmployee = new Employee();
        Registration registration = new Registration();
        registration.setEmployeeId(testId);
        validEmployee.setId(testId);
        Optional<Registration> actualResult = sut.register(validEmployee);
        Optional<Registration> expectedResult = Optional.of(registration);
        assertEquals(expectedResult.get().getEmployeeId(), testId);
    }

}