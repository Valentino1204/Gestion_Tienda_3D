package com.tienda3d.gestion.controllers;


import com.tienda3d.gestion.dao.InsumoDao;
import com.tienda3d.gestion.models.Insumo;
import com.tienda3d.gestion.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InsumoController {

    @Autowired
    private InsumoDao insumoDao;

    @RequestMapping(value = "api/insumo/{id}")
    public Insumo getInsumo(@PathVariable Long id){
        Insumo insumo = new Insumo();
        return insumo;
    }

    @RequestMapping(value = "api/insumos", method = RequestMethod.GET)
    public List<Insumo> getInsumos(){
        return insumoDao.getInsumos();
    }

    @RequestMapping(value = "api/insumos", method = RequestMethod.POST)
    public void insertInsumo(@RequestBody Insumo insumo){
        insumoDao.insertInsumo(insumo);
    }

    @RequestMapping(value = "api/insumoEliminar/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        insumoDao.eliminarInsumo(id);
    }


}
