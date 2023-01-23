package com.example.ProductMicroservice.controller;

import com.example.ProductMicroservice.dao.interf.ProductoDao;
import com.example.ProductMicroservice.models.dto.ProductoDto;
import com.example.ProductMicroservice.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductoController {
    @Autowired
    private ProductoDao productoDao;


    @GetMapping(value = "api/productos")
    public List<Producto> getAllProducto(){
        return productoDao.getProductos();
    }

    @GetMapping(value = "api/productos/{idProducto}")
    public Producto getProductoById(@PathVariable Integer idProducto){
        return  productoDao.getProductoById(idProducto);
    }
    @DeleteMapping(value = "api/productos/{idProducto}")
    public void deleteProducto(@PathVariable Integer idProducto){
        productoDao.deleteProducto(idProducto);
    }

    @PostMapping(value = "api/productos/save")
    public void saveProducto(@RequestBody ProductoDto productoDto) {
        productoDao.registerProducto(productoDto);
    }

    @PostMapping(value = "api/productos/edit")
    public void editProducto(@RequestBody Producto producto){
        productoDao.editProduct(producto);
    }
}
