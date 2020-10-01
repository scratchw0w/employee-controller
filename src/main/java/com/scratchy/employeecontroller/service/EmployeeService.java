package com.scratchy.employeecontroller.service;

import java.util.List;

import com.scratchy.employeecontroller.model.Employee;

public interface EmployeeService {

    public void saveOrUpdateEmployee(Employee employee);
    public List<Employee> getEmployees(); 
    public void deleteEmployeeById(int id);
    
}