package com.example.Lecture3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public ModelAndView showView()
    {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("items", employeeRepository.findAll());
        return mv;
    }

    @PostMapping("/add")
    public String add(@RequestParam String name, @RequestParam String address)
    {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAddress(address);
        employeeRepository.save(employee);
        return "redirect:/employee";
    }
}