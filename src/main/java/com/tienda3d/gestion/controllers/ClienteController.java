package com.tienda3d.gestion.controllers;

import com.tienda3d.gestion.dao.ClienteDao;
import com.tienda3d.gestion.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteDao clienteDao;

    @RequestMapping(value = "api/cliente/{id}")
    public Cliente getCliente(@PathVariable Long id){
        Cliente cliente = new Cliente();
        return cliente;
    }

    @RequestMapping(value = "api/clientes")
    public List<Cliente> getClientes(){
        return clienteDao.getClientes();
    }

    @RequestMapping(value = "api/clientes", method = RequestMethod.POST)
    public void agregarCliente(@RequestBody Cliente cliente){
        clienteDao.agregarCliente(cliente);
    }

    @RequestMapping(value = "cliente123")
    public Cliente editarCliente(){
        Cliente cliente = new Cliente();
        return cliente;
    }

    @RequestMapping(value = "api/clienteEliminar/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        clienteDao.eliminarCliente(id);
    }


}
