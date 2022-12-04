package com.lciresh.employeemanagementsystem.controller;

import com.lciresh.employeemanagementsystem.model.Employee;
import com.lciresh.employeemanagementsystem.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(
        origins = "*",
        allowedHeaders = "*"
)
@RequestMapping(path = "employee-management-system/api/data/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<?> saveNewEmployee(
            @RequestBody Employee employee
    ) {
        employeeService.saveNewEmployee(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @GetMapping(path = "/{employeeId}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(
            @PathVariable("employeeId") Long employeeId
    ) {
        return new ResponseEntity<>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
    }

    @PutMapping(path = "/{employeeId}/update")
    public ResponseEntity<Optional<Employee>> updateEmployeeData(
            @PathVariable("employeeId") Long employeeId,
            @RequestBody Employee employee
    ) {
        return new ResponseEntity<>(employeeService.updateEmployeeData(employeeId, employee), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/{employeeId}/delete")
    public ResponseEntity<Employee> deleteEmployee(
            @PathVariable("employeeId") Long employeeId
    ) {
        return new ResponseEntity<>(employeeService.deleteEmployee(employeeId), HttpStatus.NO_CONTENT);
    }
}
