package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    @Pattern(regexp="[A-Za-z]*", message="First name should not contain space and special characters")
    private String empFirstName;

    @Size(min = 2 , message = "Last Name Size atleast 2 digit")
    private String empLastName;

    @NotNull
    private String empAddress;

    @NotNull
    private double empSalary;

    @Range(min =1000000000, max = 9999999999L ,message = "Contact Number should be atleast 10 digit")
    @Digits()
    private long empContactNumber;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotNull
    private Date empDOB;

    @Email(message = "Email must be Valid")
    private String empEmailId;

    @Size(min = 4, message = "Password size is minimum 4")
    private String empPassword;



}
