package com.lciresh.employeemanagementsystem.service;

import com.lciresh.employeemanagementsystem.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {

    void saveNewEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Long employeeId);

    Optional<Employee> updateEmployeeData(Long employeeId, Employee employee);

    Employee deleteEmployee(Long employeeId);
}
