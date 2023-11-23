package com.intecap.tarea6.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

@Entity(name="articulo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticuloEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "fabricante_id", nullable = true)
    private FabricanteEntity fabricanteEntity;

}