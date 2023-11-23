package com.intecap.tarea6.service;

import com.intecap.tarea6.model.FabricanteEntity;
import com.intecap.tarea6.response.FabricanteResponseRest;
import org.springframework.http.ResponseEntity;

public interface IFabricanteService {

    public ResponseEntity<FabricanteResponseRest> buscarFabricante();
    public ResponseEntity<FabricanteResponseRest> buscarFabricanteId(Long id);
    public ResponseEntity<FabricanteResponseRest> crearFabricante(FabricanteEntity fabricanteEntity);
    public ResponseEntity<FabricanteResponseRest> actualizarFabricante(FabricanteEntity fabricanteEntity,Long id);
    public ResponseEntity<FabricanteResponseRest> eliminarFabricante(Long id);

}