package com.tienda3d.gestion.dao;

import com.tienda3d.gestion.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminarUsuario(Long id);
}
