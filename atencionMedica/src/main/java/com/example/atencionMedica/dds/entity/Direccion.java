// src/main/java/com/example/atencionMedica/dds/entity/Direccion.java
package com.example.atencionMedica.dds.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "calle")
    private String calle;

    @Column(name = "altura")
    private int altura;

    @ManyToOne
    @JoinColumn(name = "localidad_id", referencedColumnName = "id")
    private Localidad localidad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coordenada_id", referencedColumnName = "id")
    private Coordenada coordenada;
}