package com.cafexpress.cafeteria.repository;

import com.cafexpress.cafeteria.model.Cliente;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends R2dbcRepository<Cliente, Integer> {
}