package com.intecap.tarea6.model.dao;

import com.intecap.tarea6.model.ArticuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticuloDAO extends JpaRepository<ArticuloEntity,Long> {
}
