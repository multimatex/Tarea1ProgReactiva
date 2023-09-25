package com.cafexpress.cafeteria.controller;

import com.cafexpress.cafeteria.model.Producto;
import com.cafexpress.cafeteria.service.ProductoService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public Flux<Producto> getAllProductos() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Producto> getProductoById(@PathVariable Integer id) {
        return productoService.findById(id);
    }

    @PostMapping
    public Mono<Producto> save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable Integer id) {
        return productoService.deleteById(id);
    }
}