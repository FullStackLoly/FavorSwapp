package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Favor;

import java.util.List;

/**
 * Interface del servicio ProvinciaService
 */
public interface FavorService {
    /**
     * Definición del método para obtener todos los favores de la BBDD
     * @return List con todos los favores.
     */
    List<Favor> obtenerTodosFavores();

    /**
     * Definición del método para obtener un favor de la BBDD por su id
     * @param id id del favor a obtener.
     * @return El favor con esa id, o null si no existe.
     */
    Favor obtenerFavor(int id);
    Favor guardarFavor(Favor favor);
}
