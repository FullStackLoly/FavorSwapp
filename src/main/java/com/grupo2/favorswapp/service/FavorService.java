package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Favor;

import java.util.List;

/**
 * Interfaz del servicio ProvinciaService
 */
public interface FavorService {
    public List<Favor> obtenerTodosFavores();
    public Favor obtenerFavor(int id);
}
