package com.tienda3d.gestion.dao;

import com.tienda3d.gestion.models.Insumo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.hibernate.query.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class InsumoDaoImp implements InsumoDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Insumo> getInsumos() {
        String query = "FROM Insumo";
        List<Insumo> lista = entityManager.createQuery(query).getResultList();
        System.out.println(lista.size());
        return lista;
    }

    @Override
    public void eliminarInsumo(Long id) {
        Insumo insumo = entityManager.find(Insumo.class, id);
        entityManager.remove(insumo);
    }


    @Override
    public void insertInsumo(Insumo insumo) {
        entityManager.merge(insumo);
    }
}
