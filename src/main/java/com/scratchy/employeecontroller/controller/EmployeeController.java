package com.scratchy.employeecontroller.controller;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;

import com.scratchy.employeecontroller.model.Employee;
import com.scratchy.employeecontroller.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



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
        Employee employee = new Employee();
        theModel.addAttribute("employee", employee);
        return "employee-editor";
    }

    @PostMapping("/save-employee")
    public String saveEmployee(
            @Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "employee-editor";
        } else {
            emoloyeeService.saveOrUpdateEmployee(employee);
            return "redirect:/";
        }
    }

    @GetMapping("/update-employee-process")
    public String updateEmployee(@RequestParam("employeeId") int employeeId, Model theModel){
        Employee employee = emoloyeeService.getEmployeeById(employeeId);
        theModel.addAttribute("employee", employee);
        return "employee-editor";
    }

    @GetMapping("/delete-employee-process")
    public String deleteEmployee(@ModelAttribute("employeeId") int employeeId) {
        emoloyeeService.deleteEmployeeById(employeeId);
        return "redirect:/";
    }
    
}