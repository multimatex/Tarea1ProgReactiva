package com.cafexpress.cafeteria.controller;

import com.cafexpress.cafeteria.model.Mesero;
import com.cafexpress.cafeteria.service.MeseroService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/mesero")
public class MeseroController {

    private final MeseroService meseroService;

    public MeseroController(MeseroService meseroService) {
        this.meseroService = meseroService;
    }

    @GetMapping
    public Flux<Mesero> getAllMeseros() {
        return meseroService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Mesero> getMeseroById(@PathVariable Integer id) {
        return meseroService.findById(id);
    }

    @PostMapping
    public Mono<Mesero> save(@RequestBody Mesero mesero) {
        return meseroService.save(mesero);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable Integer id) {
        return meseroService.deleteById(id);
    }
}