package com.example.mastercode.services;

import com.example.mastercode.entities.Employee;
import com.example.mastercode.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements BaseService<Employee> {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public List<Employee> findAll() throws Exception {

        try {

            List<Employee> entities = employeeRepository.findAll();
            return entities;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public Employee findById(Long id) throws Exception {

        try {
            Optional<Employee> entityOptional = employeeRepository.findById(id);
            return entityOptional.get();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Employee create(Employee entity) throws Exception {

        try {
            entity = employeeRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Employee update(Long id, Employee entity) throws Exception {

        try {
            Optional<Employee> employeeOptional = employeeRepository.findById(id);
            Employee employeeUpdate = employeeOptional.get();
            employeeUpdate = employeeRepository.save(entity);
            return employeeUpdate;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {

        try {
            if (employeeRepository.existsById(id)) {
                employeeRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
