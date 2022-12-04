package com.lciresh.employeemanagementsystem.controller;

import com.lciresh.employeemanagementsystem.model.Department;
import com.lciresh.employeemanagementsystem.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(
        origins = "*",
        allowedHeaders = "*"
)
@RequestMapping(path = "employee-management-system/api/data/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<Department> saveNewDepartment(
            @RequestBody Department department
    ) {
        return new ResponseEntity<>(departmentService.saveNewDepartment(department), HttpStatus.OK);
    }
}
