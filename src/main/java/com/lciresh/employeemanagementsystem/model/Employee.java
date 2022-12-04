package com.lciresh.employeemanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_tbl")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private Long employeeId;
    private String firstName;
    private String lastName;

//    @ManyToOne(
//            fetch = FetchType.EAGER,
//            optional = false
//    )
//    @JoinColumn(
//            name = "department_id",
//            referencedColumnName = "departmentId"
//    )
//    private Department department;
}
