package com.example.mastercode.controllers;

import com.example.mastercode.entities.EmpleadoMC;
import com.example.mastercode.services.EmpleadoMCService;
import org.springframework.web.bind.annotation.*;

public class EmpleadoMCController {
    
    public EmpleadoMCController() {
     new EmpleadoMCService();   
    }

    @GetMapping("/empleado")
    public final EmpleadoMC getEmpleado(){
        return null;
    }

    @PostMapping("/empleado")
    public EmpleadoMC postEmpleado(){
        return null;
    }

    @PutMapping("/empleado")
    public EmpleadoMC putEmpleado(){
        return null;
    }

    @DeleteMapping("/empleado")
    public EmpleadoMC deleteEmpleado(){
        return null;
    }

    @PatchMapping("/empleado")
    public EmpleadoMC patchEmpleado(){
        return null;
    }

}
