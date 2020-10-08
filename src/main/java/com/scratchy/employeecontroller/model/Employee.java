package com.scratchy.employeecontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

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
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    @Min(value = 0, message = "Must be greater than zero")
    @Max(value = 120, message = "Invalid value")
    private int age;

    @Column(name = "post")
    private String post;


    public Employee() {}

    public Employee(String name, String surname, int age, String post){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.post = post;
    }

}