package com.cafexpress.cafeteria.service;

import com.cafexpress.cafeteria.model.Cuenta;
import com.cafexpress.cafeteria.repository.CuentaRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CuentaService {

    private final CuentaRepository cuentaRepository;

    public CuentaService(CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    public Flux<Cuenta> findAll() {
        return cuentaRepository.findAll();
    }

    public Mono<Cuenta> findById(Integer id) {
        return cuentaRepository.findById(id);
    }

    public Mono<Cuenta> save(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    public Mono<Void> deleteById(Integer id) {
        return cuentaRepository.deleteById(id);
    }
}
