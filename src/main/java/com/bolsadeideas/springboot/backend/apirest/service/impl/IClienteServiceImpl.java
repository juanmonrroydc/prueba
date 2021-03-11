package com.bolsadeideas.springboot.backend.apirest.service.impl;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.repository.IClienteRepository;
import com.bolsadeideas.springboot.backend.apirest.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteRepository iClienteRepository;

    @Override
    public Cliente save(Cliente cliente) {
        return this.iClienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) this.iClienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return this.iClienteRepository.findById(id).orElseGet(null);
    }
}
