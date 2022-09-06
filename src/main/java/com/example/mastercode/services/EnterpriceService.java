package com.example.mastercode.services;

import com.example.mastercode.repositories.EnterpriseRepository;
import org.springframework.stereotype.Service;

@Service
public class EnterpriceService {

    private final EnterpriseRepository enterpriseRepository;

    public EnterpriceService(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }
}
