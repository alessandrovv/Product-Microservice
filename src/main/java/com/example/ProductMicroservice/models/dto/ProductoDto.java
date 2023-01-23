package com.example.ProductMicroservice.models.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

public class ProductoDto {

    @Getter
    @Setter
    private boolean active;

    @Getter@Setter
    private String descripcion;

    @Getter@Setter
    private boolean eliminado;

    @Getter@Setter
    private String nombre;

    @Getter@Setter
    private Double precio;

    @Getter@Setter
    private Integer stock;

}
