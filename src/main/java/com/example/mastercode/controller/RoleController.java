package com.example.mastercode.controller;

import com.example.mastercode.entities.Role;
import com.example.mastercode.services.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("role")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;

    }

    @GetMapping()
    public List<Role> getRoleList() throws Exception {
        return roleService.findAll();
    }

    @PostMapping()
    public Role createRole(@RequestBody Role request) throws Exception {
        return roleService.create(request);
    }

    @GetMapping("/{id}")
    public Optional<Role> getRoleId(@PathVariable Long id) throws Exception {
        return Optional.ofNullable(roleService.findById(id));
    }

    @PatchMapping("/{id}")
    public Role modifyRole(@PathVariable Long id, @RequestBody Role role) throws Exception {
        return roleService.update(id, role);
    }

    @DeleteMapping("/{id}")
    public boolean deleteRole(@PathVariable Long id) throws Exception {
        return roleService.delete(id);
    }
        /*
        @PostMapping
        @GetMapping
        @PatchMapping
        @DeleteMapping
        @PutMapping
        */
}

