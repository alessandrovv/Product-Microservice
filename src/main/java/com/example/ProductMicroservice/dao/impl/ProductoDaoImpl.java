package com.example.ProductMicroservice.dao.impl;

import com.example.ProductMicroservice.dao.interf.ProductoDao;
import com.example.ProductMicroservice.models.dto.ProductoDto;
import com.example.ProductMicroservice.models.entity.Producto;
import com.example.ProductMicroservice.repository.IProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class ProductoDaoImpl implements ProductoDao {
    @Autowired
    private IProductoRepository productoRepository;


    @Override
    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    @Override
    public void deleteProducto(Integer idProducto) {
        productoRepository.delete(productoRepository.findAllById(idProducto));
    }

    @Override
    public void registerProducto(ProductoDto productoDto) {
        productoRepository.save(new Producto(productoDto));
    }

    @Override
    public Producto getProductoById(Integer idProducto) {
        return productoRepository.findAllById(idProducto);
    }

    @Override
    public void editProduct(Producto producto) {
        productoRepository.save(producto);

    }
}
