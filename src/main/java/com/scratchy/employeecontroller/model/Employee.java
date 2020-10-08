package com.scratchy.employeecontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "name")
    @Size(min = 2, max = 18, message="Enter your name")
    private String name;

    @Column(name = "surname")
    @Size(min = 2, max = 30, message="Enter your surname")
    private String surname;

    @Column(name = "age")
    @NotNull(message = "is required")
    @Min(value = 16, message = "Must be greater than 16")
    @Max(value = 120, message = "Invalid value")
    private int age;

    @Column(name = "post")
    @Size(min = 2, max = 30, message="Enter your post")
    private String post;


    public Employee() {}

    public Employee(String name, String surname, int age, String post){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.post = post;
    }

}