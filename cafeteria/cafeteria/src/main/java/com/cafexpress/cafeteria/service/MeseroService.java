package com.cafexpress.cafeteria.service;

import com.cafexpress.cafeteria.model.Mesero;
import com.cafexpress.cafeteria.repository.MeseroRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MeseroService {

    private final MeseroRepository meseroRepository;

    public MeseroService(MeseroRepository meseroRepository) {
        this.meseroRepository = meseroRepository;
    }

    public Flux<Mesero> findAll() {
        return meseroRepository.findAll();
    }

    public Mono<Mesero> findById(Integer id) {
        return meseroRepository.findById(id);
    }

    public Mono<Mesero> save(Mesero mesero) {
        return meseroRepository.save(mesero);
    }

    public Mono<Void> deleteById(Integer id) {
        return meseroRepository.deleteById(id);
    }
}