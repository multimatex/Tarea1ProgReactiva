package com.cafexpress.cafeteria.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Cuenta {
    @Id
    private Integer id;
    private String cedulaCliente;
    private String ID_Mesero;
    private String prodcuto;
    private Integer total;
}
