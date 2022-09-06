package com.example.mastercode.services;

import com.example.mastercode.entities.Role;
import com.example.mastercode.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    //create role class object

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getRole(){
        return roleRepository.findAll();
    }

    public Role createRole(Role roleName) {

/*        Role role = new Role();
        role.setRole(roleName);*/

        return this.roleRepository.save(roleName);
    }
}
