package com.example.ProductMicroservice.models.entity;

import com.example.ProductMicroservice.models.dto.ProductoDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRODUCT")
public class Producto {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter@Setter
    private int id;
    @Column(name = "active")
    @Getter@Setter
    private boolean active;
    @Column(name = "description")
    @Getter@Setter
    private String descripcion;
    @Column(name = "eliminado")
    @Getter@Setter
    private boolean eliminado;
    @Column(name = "name")
    @Getter@Setter
    private String nombre;

    @Column(name = "price")
    @Getter@Setter
    private Double precio;

    @Column(name = "stock")
    @Getter@Setter
    private Integer stock;



    public Producto(ProductoDto productoDto) {
        this.active = productoDto.isActive();
        this.descripcion = productoDto.getDescripcion();
        this.eliminado = productoDto.isEliminado();
        this.nombre = productoDto.getNombre();
        this.precio = productoDto.getPrecio();
        this.stock = productoDto.getStock();

    }

    public Producto() {

    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", active=" + active +
                ", descripcion='" + descripcion + '\'' +
                ", eliminado=" + eliminado +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
