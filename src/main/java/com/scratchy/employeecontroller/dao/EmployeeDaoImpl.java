package com.scratchy.employeecontroller.dao;

import java.util.List;

import javax.persistence.EntityManager;
import com.scratchy.employeecontroller.model.Employee;

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
        getSession().saveOrUpdate(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        Query<Employee> employeeQuery = getSession().createQuery("from Employee", Employee.class);
        List<Employee> employeeList = employeeQuery.getResultList();
        return employeeList;
    }

    @Override
    public void deleteEmployeeById(int id) {
        Query theQuery = getSession().createQuery("delete from Employee where id=:customerId");
        theQuery.setParameter("customerId", id);
        theQuery.executeUpdate();
    }
 
    private Session getSession(){
        Session session = entityManager.unwrap(Session.class);
        return session;
    }

}