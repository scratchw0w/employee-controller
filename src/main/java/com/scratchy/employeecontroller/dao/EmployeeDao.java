package com.scratchy.employeecontroller.dao;

import java.util.List;

import com.scratchy.employeecontroller.dto.Employee;

public interface EmployeeDao {
    
    public void saveOrUpdateEmployee(Employee employee);
    public List<Employee> getEmployees();
    public Employee getEmployeeById(int id);
    public void deleteEmployeeById(int id);

}