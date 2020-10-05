package com.scratchy.employeecontroller.controller;

import java.util.List;

import com.scratchy.employeecontroller.model.Employee;
import com.scratchy.employeecontroller.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeController {

    @Autowired
    EmployeeService emoloyeeService;

    
    @GetMapping("/")
    public String welcomePage(Model theModel){
        List<Employee> employees = emoloyeeService.getEmployees();
        theModel.addAttribute("employees", employees);
        return "welcome-page";
    }

    @GetMapping("/employee-editor")
    public String formPage(Model theModel) {
        return "form-page";
    }

}