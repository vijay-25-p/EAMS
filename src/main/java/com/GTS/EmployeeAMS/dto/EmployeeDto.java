package com.GTS.EmployeeAMS.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto {

    private Long id;
    private String name;
    private String roll;
    private LocalDate startDate;
    private LocalDate endDate;
    private double salary;
    private String phno;


    // Constructor with all fields
    public EmployeeDto(Long id, String name, String roll, LocalDate startDate, LocalDate endDate, double salary, String phno) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
        this.phno = phno;
    }


    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}
