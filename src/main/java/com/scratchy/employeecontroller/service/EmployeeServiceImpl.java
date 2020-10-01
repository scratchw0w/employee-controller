package com.scratchy.employeecontroller.service;

import java.util.List;

import javax.transaction.Transactional;

import com.scratchy.employeecontroller.dao.EmployeeDao;
import com.scratchy.employeecontroller.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public void saveOrUpdateEmployee(Employee employee) {
        employeeDao.saveOrUpdateEmployee(employee);
    }

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int id) {
        employeeDao.deleteEmployeeById(id);
    }
    
}