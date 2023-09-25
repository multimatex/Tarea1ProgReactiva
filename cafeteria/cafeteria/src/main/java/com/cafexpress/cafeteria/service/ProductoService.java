package com.cafexpress.cafeteria.service;

import com.cafexpress.cafeteria.model.Producto;
import com.cafexpress.cafeteria.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Flux<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Mono<Producto> findById(Integer id) {
        return productoRepository.findById(id);
    }

    public Mono<Producto> save(Producto producto) {
        return productoRepository.save(producto);
    }

    public Mono<Void> deleteById(Integer id) {
        return productoRepository.deleteById(id);
    }
}
