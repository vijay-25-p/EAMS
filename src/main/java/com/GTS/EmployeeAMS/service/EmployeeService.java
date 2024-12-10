package com.GTS.EmployeeAMS.service;

import com.GTS.EmployeeAMS.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);


    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedemployee);

    void deleteEmployee(Long employeeId);
}
