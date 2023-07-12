package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Favor;

import java.util.List;

/**
 * Interfaz del servicio ProvinciaService
 */
public interface FavorService {
    List<Favor> obtenerTodosFavores();
    Favor obtenerFavor(int id);
    Favor guardarFavor(Favor favor);
}
