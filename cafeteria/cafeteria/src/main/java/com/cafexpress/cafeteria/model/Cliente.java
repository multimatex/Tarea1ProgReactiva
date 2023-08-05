package com.cafexpress.cafeteria.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Cliente {
    @Id
    private Integer id;
    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;

}
