package com.intecap.tarea6.model.dao;

import com.intecap.tarea6.model.FabricanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFabricanteDAO extends JpaRepository<FabricanteEntity,Long> {
}
