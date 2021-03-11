package com.bolsadeideas.springboot.backend.apirest.controller;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private IClienteService iClienteService;

    @PostMapping("/crear")
    public Cliente guardar(@RequestBody Cliente cliente){
        return this.iClienteService.save(cliente);
    }

    @GetMapping("/listar")
    public List<Cliente> findAll(){
        return this.iClienteService.findAll();
    }

    @GetMapping("/buscar/{id}")
    public Cliente findById(@PathVariable Long id){
        return this.iClienteService.findById(id);
    }
}
