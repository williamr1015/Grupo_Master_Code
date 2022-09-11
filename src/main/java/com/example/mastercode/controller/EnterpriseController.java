package com.example.mastercode.controller;

import com.example.mastercode.entities.Enterprise;
import com.example.mastercode.services.EnterpriseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("enterprise")
public class EnterpriseController {
    private final EnterpriseService enterpriseService;

    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

        @GetMapping()
        public List<Enterprise> getEnterpriseList() throws Exception {
            return enterpriseService.findAll();
        }

        @PostMapping()
        public Enterprise createEnterprise(@RequestBody Enterprise request) throws Exception {
            return enterpriseService.create(request);
        }

        @GetMapping("/{id}")
        public Optional<Enterprise> getEnterpriseId(@PathVariable Long id) throws Exception {
            return Optional.ofNullable(enterpriseService.findById(id));
        }

        @PatchMapping("/{id}")
        public Enterprise modifyEnterprise(@PathVariable Long id, @RequestBody Enterprise enterprise) throws Exception {
            return enterpriseService.update(id, enterprise);
        }

        @DeleteMapping("/{id}")
        public boolean deleteEnterprise(@PathVariable Long id) throws Exception {
            return enterpriseService.delete(id);
        }

}
