package com.GTS.EmployeeAMS.mapper;

import com.GTS.EmployeeAMS.dto.EmployeeDto;
import com.GTS.EmployeeAMS.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getName(),
                employee.getRoll(),
                employee.getstart_date(),
                employee.getend_date(),
                employee.getSalary(),
                employee.getPhno()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getName(),
                employeeDto.getRoll(),
                employeeDto.getStartDate(),
                employeeDto.getEndDate(),
                employeeDto.getSalary(),
                employeeDto.getPhno()
        );
    }
}
