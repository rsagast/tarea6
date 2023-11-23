package com.intecap.tarea6.response;

import com.intecap.tarea6.model.ArticuloEntity;

import java.util.List;

public class ArticuloResponse {
    List<ArticuloEntity> articuloEntityList;

    public List<ArticuloEntity> getArticuloEntityList() {
        return articuloEntityList;
    }

    public void setArticuloEntityList(List<ArticuloEntity> articuloEntityList) {
        this.articuloEntityList = articuloEntityList;
    }
}