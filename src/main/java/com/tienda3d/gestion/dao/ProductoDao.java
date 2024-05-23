package com.tienda3d.gestion.dao;

import com.tienda3d.gestion.models.Producto;

import java.util.List;

public interface ProductoDao {
    List<Producto> getProductos();
    void insertProducto(Producto producto);
    void eliminarProducto(Long id);
}
