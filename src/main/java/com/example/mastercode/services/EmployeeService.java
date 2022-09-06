package com.example.mastercode.services;

import com.example.mastercode.entities.Employee;
import com.example.mastercode.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employeeName) {

        return employeeRepository.save(employeeName);
    }

    public Employee modifyEmployee(Long id, Employee employee){
        employee.setIdEmployee(id);
        return employeeRepository.save(employee);
    }

    public String deleteEmployee(Long id){
        employeeRepository.deleteById(id);
        return "Empleado eliminado correctamente";
    }

}
