package com.cafexpress.cafeteria.controller;

import com.cafexpress.cafeteria.model.Cuenta;
import com.cafexpress.cafeteria.service.CuentaService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {

    private final CuentaService cuentaService;

    public CuentaController(CuentaService cuentaService) {
        this.cuentaService = cuentaService;
    }

    @GetMapping
    public Flux<Cuenta> getAllCuentas() {
        return cuentaService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Cuenta> getCuentaById(@PathVariable Integer id) {
        return cuentaService.findById(id);
    }

    @PostMapping
    public Mono<Cuenta> save(@RequestBody Cuenta cuenta) {
        return cuentaService.save(cuenta);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable Integer id) {
        return cuentaService.deleteById(id);
    }
}
