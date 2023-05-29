package com.grupo2.favorswapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDateTime fechaNacimiento;
    @ManyToOne
    @JoinColumn(name = "id_direccion", referencedColumnName = "id")
    private Direccion direccion;
//    private int idDireccion;
    private boolean isAdmin;
    private String email;
    private String clave;
}
