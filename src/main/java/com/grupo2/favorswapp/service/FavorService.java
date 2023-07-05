package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Favor;
import com.grupo2.favorswapp.models.Provincia;

import java.util.List;

/**
 * Interfaz del servicio ProvinciaService
 */
public interface FavorService {
    public List<Favor> obtenerTodosFavores();
    public Favor obtenerFavor(String id);
}
