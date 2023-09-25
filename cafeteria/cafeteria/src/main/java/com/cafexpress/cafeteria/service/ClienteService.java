package com.cafexpress.cafeteria.service;

import com.cafexpress.cafeteria.model.Cliente;
import com.cafexpress.cafeteria.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Flux<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Mono<Cliente> findById(Integer cedula) {
        return clienteRepository.findById(cedula);
    }

    public Mono<Cliente> save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Mono<Void> deleteById(Integer cedula) {
        return clienteRepository.deleteById(cedula);
    }
}
