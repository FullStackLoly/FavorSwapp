package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Provincia;
import com.grupo2.favorswapp.repository.ProvinciaRepo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementación del servicio de provincias.
 */
@Service
public class ProvinciaServiceImpl implements ProvinciaService{
    /**
     * Variable de clase para inyectar ProvinciaRepo
     */
    private final ProvinciaRepo provinciaRepo;

    /**
     * Constructor para inyectar ProvinciaRepo
     * @param provinciaRepo Repositorio de provincias.
     */
    public ProvinciaServiceImpl(ProvinciaRepo provinciaRepo) {
        this.provinciaRepo = provinciaRepo;
    }

    /**
     * Implementación del método para obtener todas las provincias de la BBDD
     * @return List con todas las provincias.
     */
    @Override
    public List<Provincia> obtenerTodasProvincias() {
        return provinciaRepo.findAll() ;
    }

    /**
     * Implementación del método para obtener una provincia por su id de la BBDD
     * @param id id de la provincia a obtener.
     * @return Provincia obtenida, o null si no existe con esa id
     */
    @Override
    public Provincia obtenerProvincia(String id) {
        return provinciaRepo.findById(id).orElse(null);
    }

    /**
     * Implementación del método para guardar una provincia en la BBDD
     * @param provincia Provincia a guardar.
     */
    @Override
    public void guardarProvincia(Provincia provincia){
        provinciaRepo.save(provincia);
    }
}
