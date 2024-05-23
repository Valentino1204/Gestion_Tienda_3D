package com.tienda3d.gestion.dao;

import com.tienda3d.gestion.models.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ClienteDaoImp implements ClienteDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Cliente> getClientes() {
        String query = "FROM Cliente";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminarCliente(Long id) {
        Cliente cliente = entityManager.find(Cliente.class, id);
        entityManager.remove(cliente);
    }

    @Override
    public void agregarCliente(Cliente cliente) {
        entityManager.merge(cliente);
    }
}
