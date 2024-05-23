package com.tienda3d.gestion.dao;

import com.tienda3d.gestion.models.Cliente;
import com.tienda3d.gestion.models.Usuario;

import java.util.List;

public interface ClienteDao {
    List<Cliente> getClientes();

    void eliminarCliente(Long id);

    void agregarCliente(Cliente cliente);
}
