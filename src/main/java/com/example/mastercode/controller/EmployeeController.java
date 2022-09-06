package com.example.mastercode.controller;

import com.example.mastercode.entities.Employee;
import com.example.mastercode.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("employee")
@RestController
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public List<Employee> getEmployee() {
        return this.employeeService.getEmployee();
    }

    @PostMapping()
    public Employee createEmployee(@RequestBody Employee request) {
        return employeeService.createEmployee(request);
    }

    @GetMapping("/{id}")
    public List<Employee> getEmployeeId() {
        return this.employeeService.getEmployee();
    }

    @PatchMapping("/{id}")
    public Employee modifyEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.modifyEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return employeeService.deleteEmployee(id);
    }
/*
        @PostMapping : Crear un recurso nuevo
        @GetMapping : Consultar informacion de un recurso
        @PatchMapping : Modificar solamente un atributo
        @DeleteMapping : Eliminar un recurso determinado
        @PutMapping : modificar un recurso existente
*/
}
