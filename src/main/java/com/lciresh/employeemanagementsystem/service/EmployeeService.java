package com.lciresh.employeemanagementsystem.service;

import com.lciresh.employeemanagementsystem.model.Employee;
import com.lciresh.employeemanagementsystem.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceInterface {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void saveNewEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();

        return employees;
    }

    @Override
    public Optional<Employee> getEmployeeById(Long employeeId) {
        Optional<Employee> employee = employeeRepository.getEmployeeByEmployeeId(employeeId);

        if (employee.isEmpty()) {
            throw new IllegalStateException("Employee not exist");
        }

        return employee;
    }

    @Override
    public Optional<Employee> updateEmployeeData(Long employeeId, Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.getEmployeeByEmployeeId(employeeId);

        if (employeeOptional.isEmpty()) {
            throw new IllegalStateException("Employee not exist");
        }

        employeeOptional.get().setFirstName(employee.getFirstName());
        employeeOptional.get().setLastName(employee.getLastName());
        employeeOptional.get().setDepartment(employee.getDepartment());

        return employeeOptional;
    }

    @Override
    public Employee deleteEmployee(Long employeeId) {
        Optional<Employee> employeeOptional = employeeRepository.getEmployeeByEmployeeId(employeeId);

        if (employeeOptional.isEmpty()) {
            throw new IllegalStateException("Employee not exist");
        }

        Employee employee = employeeRepository.findEmployeeByEmployeeId(employeeId);
        employeeRepository.delete(employee);

        return employee;
    }
}
