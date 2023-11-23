package com.intecap.tarea6.response;

import com.intecap.tarea6.model.FabricanteEntity;

import java.util.List;

public class FabricanteResponse {
    private List<FabricanteEntity> fabricanteEntityList;

    public List<FabricanteEntity> getFabricanteEntityList() {
        return fabricanteEntityList;
    }

    public void setFabricanteEntityList(List<FabricanteEntity> fabricanteEntityList) {
        this.fabricanteEntityList = fabricanteEntityList;
    }
}
