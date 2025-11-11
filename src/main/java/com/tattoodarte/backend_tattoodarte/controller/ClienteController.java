package com.tattoodarte.backend_tattoodarte.controller;

import com.tattoodarte.backend_tattoodarte.model.Cliente;
import com.tattoodarte.backend_tattoodarte.repository.ClienteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/api/clientes")
    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }
}