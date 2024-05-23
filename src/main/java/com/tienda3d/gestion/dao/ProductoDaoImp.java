package com.tienda3d.gestion.dao;

import com.tienda3d.gestion.models.Producto;

import com.tienda3d.gestion.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Repository
@Transactional
public class ProductoDaoImp implements ProductoDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Producto> getProductos() {
        String query = "FROM Producto";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void insertProducto(Producto producto) {
        entityManager.merge(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        Producto producto = entityManager.find(Producto.class, id);
        entityManager.remove(producto);
    }


}
