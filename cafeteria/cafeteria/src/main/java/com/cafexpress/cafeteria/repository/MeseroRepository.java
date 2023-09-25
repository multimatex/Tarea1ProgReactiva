package com.cafexpress.cafeteria.repository;

import com.cafexpress.cafeteria.model.Mesero;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeseroRepository extends R2dbcRepository<Mesero, Integer> {
}