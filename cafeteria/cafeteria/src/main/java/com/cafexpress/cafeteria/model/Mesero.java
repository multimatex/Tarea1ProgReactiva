package com.cafexpress.cafeteria.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Mesero {
    @Id
    private Integer id;
    private String nombre;
}
