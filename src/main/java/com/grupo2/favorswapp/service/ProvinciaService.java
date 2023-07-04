package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Provincia;

import java.util.List;

/**
 * Interfaz del servicio ProvinciaService
 */
public interface ProvinciaService {
    public List<Provincia> obtenerTodasProvincias();
    public Provincia obtenerProvincia(String id);
}
