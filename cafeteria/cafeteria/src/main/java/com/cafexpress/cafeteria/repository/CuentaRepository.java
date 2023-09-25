package com.cafexpress.cafeteria.repository;

import com.cafexpress.cafeteria.model.Cuenta;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends R2dbcRepository<Cuenta, Integer> {
}