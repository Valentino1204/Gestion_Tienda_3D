package com.tienda3d.gestion.controllers;

import com.tienda3d.gestion.dao.ProductoDao;
import com.tienda3d.gestion.dao.ProductoDaoImp;
import com.tienda3d.gestion.models.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController{

    @Autowired
    private ProductoDao productoDao;

    @RequestMapping(value = "api/producto/{id}")
    public Producto getProducto(@PathVariable Long id){
        Producto producto = new Producto();
        return producto;
    }

    @RequestMapping(value = "api/productos", method = RequestMethod.GET)
    public List<Producto> getProductos(){
        return productoDao.getProductos();
    }

    @RequestMapping(value = "api/productos", method = RequestMethod.POST)
    public void insertProducto(@RequestBody Producto producto){
        productoDao.insertProducto(producto);
    }

    @RequestMapping(value = "api/productoEliminar/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        productoDao.eliminarProducto(id);
    }


}
