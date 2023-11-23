package com.intecap.tarea6.model.dao;

import com.intecap.tarea6.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {
    public Usuario findByNombreUsuario(String nombreUsuario);

}