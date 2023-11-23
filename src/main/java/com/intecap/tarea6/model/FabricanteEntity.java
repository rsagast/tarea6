package com.intecap.tarea6.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity(name = "fabricante")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FabricanteEntity implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "El campo nombre es requerido")
    private String nombre;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "fabricanteEntity"
    )
    private Set<ArticuloEntity> articuloEntities;

}