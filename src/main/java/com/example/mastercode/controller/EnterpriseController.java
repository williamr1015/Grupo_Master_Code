package com.example.mastercode.controller;

import com.example.mastercode.services.EnterpriceService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnterpriseController {
    private final EnterpriceService enterpriceService;

    public EnterpriseController(EnterpriceService enterpriceService) {
        this.enterpriceService = enterpriceService;
    }
}
