package com.scratchy.employeecontroller.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;

import com.scratchy.employeecontroller.dto.Employee;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void saveOrUpdateEmployee(Employee employee) {
        Session currentSession = getSession();
        currentSession.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session currentSession = getSession();
        Employee employee = currentSession.get(Employee.class, id);
        return employee;
    }

    @Override
    public List<Employee> getEmployees() {
        Session currentSession = getSession();
        Query<Employee> employeeQuery = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> employeeList = employeeQuery.getResultList();
        if(employeeList.size() == 0) {
            return Collections.emptyList();
        }
        return employeeList;
    }

    @Override
    public void deleteEmployeeById(int id) {
        Session currentSession = getSession();
        Query theQuery = currentSession.createQuery("delete from Employee where id =: customerId");
        theQuery.setParameter("customerId", id);
        theQuery.executeUpdate();
    }

    private Session getSession(){
        Session session = entityManager.unwrap(Session.class);
        return session;
    }

}