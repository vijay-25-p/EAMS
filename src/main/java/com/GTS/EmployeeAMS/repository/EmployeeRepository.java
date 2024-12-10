package com.GTS.EmployeeAMS.repository;

import com.GTS.EmployeeAMS.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Long> {
}
