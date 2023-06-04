package com.grupo2.favorswapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

/**
 * Modelo de la tabla provincias
 */
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString
@Entity
@Table(name = "provincias")
public class Provincia {
    @Id
    private String id;
    private String nombre;

}
