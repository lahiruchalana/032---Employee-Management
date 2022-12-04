package com.lciresh.employeemanagementsystem.repository;

import com.lciresh.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> getEmployeeByEmployeeId(Long employeeId);

    Employee findEmployeeByEmployeeId(Long employeeId);
}
