package com.intecap.tarea6.controller;

import com.intecap.tarea6.model.FabricanteEntity;
import com.intecap.tarea6.response.FabricanteResponseRest;
import com.intecap.tarea6.service.IFabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

@RestController
@RequestMapping("api/tarea6")
public class FabricanteController {

    @Autowired
    private IFabricanteService fabricanteService;

    FabricanteResponseRest response = new FabricanteResponseRest();

    @GetMapping("/fabricantes")
    public ResponseEntity<FabricanteResponseRest> darFabricantes(){
         return fabricanteService.buscarFabricante();
    }

    @GetMapping("/fabricantes/{id}")
    public ResponseEntity<FabricanteResponseRest> darFabricantesId(@PathVariable Long id){
        return fabricanteService.buscarFabricanteId(id);
    }

    @PostMapping("/fabricantes")
    public ResponseEntity<FabricanteResponseRest> crearFabricante(@Valid @RequestBody FabricanteEntity request, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            response.setMetadata("crearFabricante()", "400", Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        } else {
            return fabricanteService.crearFabricante(request);
        }
    }

    @PutMapping("/fabricantes/{id}")
    public ResponseEntity<FabricanteResponseRest> actualizarFabricante(@RequestBody FabricanteEntity request, @PathVariable Long id){
        return fabricanteService.actualizarFabricante(request,id);
    }

    @DeleteMapping("/fabricantes/{id}")
    public ResponseEntity<FabricanteResponseRest> eliminarFabricante(@PathVariable Long id){
        return fabricanteService.eliminarFabricante(id);
    }

}