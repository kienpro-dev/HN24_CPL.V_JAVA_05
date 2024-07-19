package com.example.Lecture3.controller;

import com.example.Lecture3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public ResponseEntity<?> listEmployee() {
        return ResponseEntity.ok().body(employeeService.findAllEmployee());
    }

    @PostMapping("/employee")
    public ResponseEntity<?> addEmployee(@RequestParam String name, @RequestParam String address) {
        return ResponseEntity.ok().body(employeeService.addEmployee(name, address));
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().body("Delete employee successfully");
    }
}
