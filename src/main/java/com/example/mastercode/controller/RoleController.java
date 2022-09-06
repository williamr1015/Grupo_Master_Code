package com.example.mastercode.controller;

import com.example.mastercode.entities.Role;
import com.example.mastercode.services.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;

    }

    @GetMapping("/role")
    public List<Role> getRole() {
        return this.roleService.getRole();
    }


    @PostMapping("/role")
    public Role createRol(@RequestBody Role request) {
        System.out.println(request);

        return this.roleService.createRole(request);
        /*
        @PostMapping
        @GetMapping
        @PatchMapping
        @DeleteMapping
        @PutMapping
        */
    }
}
