package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Provincia;

import java.util.List;

/**
 * Interface del servicio ProvinciaService
 */
public interface ProvinciaService {
    /**
     * Definición del método para obtener todas las provincias de la BBDD
     * @return List de provincias.
     */
    List<Provincia> obtenerTodasProvincias();

    /**
     * Definición del método para obtener una provincia de la BBDD por su id
     * @param id id de la provincia a obtener.
     * @return Provincia con esa id, o null si no existe.
     */
    Provincia obtenerProvincia(String id);

    /**
     * Definición del método para guardar una provincia en la BBDD.
     * @param provincia Provincia a guardar.
     */
    void guardarProvincia(Provincia provincia);
}
