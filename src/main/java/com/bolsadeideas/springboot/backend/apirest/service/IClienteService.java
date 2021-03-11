package com.bolsadeideas.springboot.backend.apirest.service;


import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    Cliente save(Cliente cliente);

    List<Cliente> findAll();

    Cliente findById(Long id);
}
