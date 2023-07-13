package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Direccion;

/**
 * Interface del servicio DireccionService
 */
public interface DireccionService {
    /**
     * Definición del método para guardar una dirección.
     * @param direccion dirección a guardar.
     * @return dirección guardada o null si no se ha podido guardar.
     */
    Direccion guardarDireccion(Direccion direccion);
}
