package com.intecap.tarea6.controller;

import com.intecap.tarea6.model.ArticuloEntity;
import com.intecap.tarea6.response.ArticuloResponseRest;
import com.intecap.tarea6.service.IArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/tarea6")
public class ArticuloController {

    @Autowired
    private IArticuloService articuloService;

    @GetMapping("/articulos")
    public ResponseEntity<ArticuloResponseRest> darArticulo(){
        return articuloService.buscarArticulo();
    }

    @GetMapping("/articulos/{id}")
    public ResponseEntity<ArticuloResponseRest> darArticuloId(@PathVariable Long id){
        return articuloService.buscarArticuloId(id);
    }

    @PostMapping("/articulos")
    public ResponseEntity<ArticuloResponseRest> crearArticulo(@RequestBody ArticuloEntity request){
        return articuloService.crearArticulo(request);
    }

    @PutMapping("/articulos/{id}")
    public ResponseEntity<ArticuloResponseRest> actualizarArticulo(@RequestBody ArticuloEntity request, @PathVariable Long id){
        return articuloService.actualizarArticulo(request,id);
    }

    @DeleteMapping("/articulos/{id}")
    public ResponseEntity<ArticuloResponseRest> eliminarArticulo(@PathVariable Long id){
        return articuloService.eliminarArticulo(id);
    }

}