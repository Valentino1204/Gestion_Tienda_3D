package com.tienda3d.gestion.dao;

import com.tienda3d.gestion.models.Insumo;

import java.util.List;

public interface InsumoDao {
    List<Insumo> getInsumos();

    void eliminarInsumo(Long id);


    void insertInsumo(Insumo insumo);
}
