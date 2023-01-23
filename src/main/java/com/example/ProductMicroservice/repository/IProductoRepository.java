package com.example.ProductMicroservice.repository;

import com.example.ProductMicroservice.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository  extends JpaRepository<Producto,Integer> {
    Producto findAllById(Integer idProducto);
}
