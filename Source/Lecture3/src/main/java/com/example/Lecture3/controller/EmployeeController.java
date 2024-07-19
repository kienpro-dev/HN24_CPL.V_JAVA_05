package com.example.Lecture3.controller;

import com.example.Lecture3.Repository.EmployeeRepository;
import com.example.Lecture3.model.Employee;
import com.example.Lecture3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public ModelAndView showView()
    {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("items", employeeService.findAllEmployee());
        return mv;
    }

    @PostMapping("/add")
    public String add(@RequestParam String name, @RequestParam String address)
    {
        Employee employee = employeeService.addEmployee(name, address);
        return "redirect:/employee";
    }
}