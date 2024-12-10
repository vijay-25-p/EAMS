package com.GTS.EmployeeAMS.service.impl;

import com.GTS.EmployeeAMS.dto.EmployeeDto;
import com.GTS.EmployeeAMS.entity.Employee;
import com.GTS.EmployeeAMS.exception.ResourceNotFoundException;
import com.GTS.EmployeeAMS.mapper.EmployeeMapper;
import com.GTS.EmployeeAMS.repository.EmployeeRepository;
import com.GTS.EmployeeAMS.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
            .orElseThrow(() ->
                    new ResourceNotFoundException("Employee is not exist with given id : "+employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedemployee) {
       Employee employee= employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("Employee is not exist with given id : "+employeeId)
        );

       employee.setName(updatedemployee.getName());
       employee.setRoll(updatedemployee.getRoll());
       employee.setStartDate(updatedemployee.getStartDate());
        employee.setEndDate(updatedemployee.getEndDate());
        employee.setSalary(updatedemployee.getSalary());
       employee.setPhno(updatedemployee.getPhno());

       Employee updatedEmployeeObj = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee= employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("Employee is not exist with given id : "+employeeId)
        );

        employeeRepository.deleteById(employeeId);
    }

    @PostConstruct
    public void checkInitialization() {
        System.out.println("EmployeeRepository initialized: " + (employeeRepository != null));
    }
}


