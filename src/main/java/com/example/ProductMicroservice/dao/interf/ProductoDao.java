package com.example.ProductMicroservice.dao.interf;

import com.example.ProductMicroservice.models.dto.ProductoDto;
import com.example.ProductMicroservice.models.entity.Producto;

import java.util.List;

public interface ProductoDao {
    List<Producto> getProductos();
    void deleteProducto(Integer idProducto);

    void registerProducto(ProductoDto producto);
    Producto getProductoById(Integer idProducto);

    void editProduct(Producto producto);

}
