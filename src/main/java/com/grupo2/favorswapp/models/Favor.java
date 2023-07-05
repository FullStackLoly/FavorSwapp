package com.grupo2.favorswapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Modelo de la tabla favores
 */
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString
@Entity
@Table(name = "favores")
public class Favor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String foto;
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;
    private boolean fumar;
    private boolean internet;
    private boolean mascota;
    private boolean climatizacion;
    private boolean adaptadoMovilidadReducida;
}
