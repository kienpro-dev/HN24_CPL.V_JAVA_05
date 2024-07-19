package com.example.Lecture3.service;

import com.example.Lecture3.Repository.EmployeeRepository;
import com.example.Lecture3.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(String name, String address) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAddress(address);
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }
}
