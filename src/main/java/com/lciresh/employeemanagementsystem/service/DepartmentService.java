package com.lciresh.employeemanagementsystem.service;

import com.lciresh.employeemanagementsystem.model.Department;
import com.lciresh.employeemanagementsystem.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements DepartmentServiceInterface {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department saveNewDepartment(Department department) {
        departmentRepository.save(department);

        return department;
    }
}
