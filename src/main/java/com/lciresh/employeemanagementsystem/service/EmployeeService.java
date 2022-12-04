package com.lciresh.employeemanagementsystem.service;

import com.lciresh.employeemanagementsystem.model.Employee;
import com.lciresh.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveNewEmployee(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Optional<Employee> getEmployeeById(Long employeeId) {
        return Optional.empty();
    }

    @Override
    public Employee updateEmployeeData(Long employeeId, Employee employee) {
        return null;
    }

    @Override
    public Employee deleteEmployee(Long employeeId) {
        return null;
    }
}
