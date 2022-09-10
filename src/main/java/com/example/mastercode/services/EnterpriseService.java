package com.example.mastercode.services;

import com.example.mastercode.entities.Enterprise;
import com.example.mastercode.repositories.EnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriceService implements BaseService<Enterprise>{

    private final EnterpriseRepository enterpriseRepository;

    public EnterpriceService(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    @Override
    public List<Enterprise> findAll() throws Exception {
        return null;
    }

    @Override
    public Enterprise findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Enterprise create(Enterprise entity) throws Exception {
        return null;
    }

    @Override
    public Enterprise update(Long id, Enterprise entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
