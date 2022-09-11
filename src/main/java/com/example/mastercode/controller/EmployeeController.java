package com.example.mastercode.controller;

import com.example.mastercode.entities.Employee;
import com.example.mastercode.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public List<Employee> getEmployeeList() throws Exception {
        return employeeService.findAll();
    }

    @PostMapping()
    public Employee createEmployee(@RequestBody Employee request) throws Exception {
        return employeeService.create(request);
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeId(@PathVariable Long id) throws Exception {
        return Optional.ofNullable(employeeService.findById(id));
    }

    @PatchMapping("/{id}")
    public Employee modifyEmployee(@PathVariable Long id, @RequestBody Employee employee) throws Exception {
        return employeeService.update(id, employee);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEmployee(@PathVariable Long id) throws Exception {
        return employeeService.delete(id);
    }
/*
        @PostMapping : Crear un recurso nuevo
        @GetMapping : Consultar informacion de un recurso
        @PatchMapping : Modificar solamente un atributo
        @DeleteMapping : Eliminar un recurso determinado
        @PutMapping : modificar un recurso existente
*/
}
