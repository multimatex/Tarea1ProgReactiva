package com.cafexpress.cafeteria.controller;

import com.cafexpress.cafeteria.model.Cliente;
import com.cafexpress.cafeteria.service.ClienteService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public Flux<Cliente> getAllClientes() {
        return clienteService.findAll();
    }

    @GetMapping("/{cedula}")
    public Mono<Cliente> getClienteById(@PathVariable Integer cedula) {
        return clienteService.findById(cedula);
    }

    @PostMapping
    public Mono<Cliente> save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{cedula}")
    public Mono<Void> deleteById(@PathVariable Integer cedula) {
        return clienteService.deleteById(cedula);
    }
}