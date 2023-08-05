package com.cafexpress.cafeteria.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Producto {
    @Id
    private Integer id;
    private String nombre;
    private Integer precio;
}
