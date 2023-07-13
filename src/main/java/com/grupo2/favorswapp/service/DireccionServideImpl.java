package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Direccion;
import com.grupo2.favorswapp.repository.DireccionRepo;
import org.springframework.stereotype.Service;

/**
 * Implementación del servicio de direcciones
 */
@Service
public class DireccionServideImpl implements DireccionService{
    /**
     * Variable de clase para inyectar DireccionRepo
     */
    private final DireccionRepo direccionRepo;

    /**
     * Constructor para inyectar DirecciónRepo
     * @param direccionRepo Repositorio de direcciones.
     */
    public DireccionServideImpl(DireccionRepo direccionRepo) {
        this.direccionRepo = direccionRepo;
    }

    /**
     * Implementación del método para guardar una dirección en la BBDD
     * @param direccion dirección a guardar.
     * @return dirección guardada, o null si no se ha podido guardar.
     */
    @Override
    public Direccion guardarDireccion(Direccion direccion) {
        return direccionRepo.save(direccion);
    }
}
