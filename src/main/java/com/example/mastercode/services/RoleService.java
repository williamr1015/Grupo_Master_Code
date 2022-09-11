package com.example.mastercode.services;

import com.example.mastercode.entities.Role;
import com.example.mastercode.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements BaseService<Role> {

    //create role class object

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    @Transactional
    public List<Role> findAll() throws Exception {
        try {

            List<Role> entities = roleRepository.findAll();
            return entities;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Role findById(Long id) throws Exception {
        try {
            Optional<Role> entityOptional = roleRepository.findById(id);
            return entityOptional.get();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Role create(Role entity) throws Exception {

        try {
            entity = roleRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Role update(Long id, Role entity) throws Exception {
        try {
            Optional<Role> roleOptional = roleRepository.findById(id);
            Role roleUpdate = roleOptional.get();
            roleUpdate = roleRepository.save(entity);
            return roleUpdate;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (roleRepository.existsById(id)) {
                roleRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
