package com.example.mastercode.controllers;

import com.example.mastercode.entities.Empresa;
import com.example.mastercode.services.EmpresaService;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpresaController {

    EmpresaService Empresas;


    public EmpresaController() {
        this.Empresas = new EmpresaService();
    }

    @GetMapping("/enterprises")
    public Empresa getEmpresa(){
        return null;
    }

    @PostMapping("/enterprises")
    public Empresa postEmpresa(){
        return null;
    }

    @GetMapping("/enterprises/{id}")
    public Empresa getEmpresa(String id){
        return null;
    }

    @PatchMapping("/enterprises/{id}")
    public Empresa patchEmpresa(){
        return null;
    }

    @DeleteMapping("/enterprises/{id}")
    public Empresa deleteEmpresa(){
        return null;
    }

}
