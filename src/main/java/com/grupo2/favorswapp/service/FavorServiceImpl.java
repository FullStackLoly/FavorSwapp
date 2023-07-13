package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Favor;
import com.grupo2.favorswapp.repository.FavorRepo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementación del servicio de favores
 */
@Service
public class FavorServiceImpl implements FavorService{
    /**
     * Variable de clase para inyectar FavorRepo
     */
    private final FavorRepo favorRepo;

    /**
     * Constructor para inyectar FavorRepo
     * @param favorRepo Repositorio de favores
     */
    public FavorServiceImpl(FavorRepo favorRepo) {
        this.favorRepo = favorRepo;
    }

    /**
     * Implementación del método para obtener todos los favores de la BBDD
     * @return List con todos los favores.
     */
    @Override
    public List<Favor> obtenerTodosFavores() {
        return favorRepo.findAll();
    }

    /**
     * Implementación del método para obtener un Favor de la BBDD por su id
     * @param id id del favor a obtener.
     * @return el favor si existe con esa id, null en caso contrario.
     */
    @Override
    public Favor obtenerFavor(int id) {
        return favorRepo.findById(id).orElse(null);
    }

    /**
     * Implementación del método para guardar un favor en la BBDD.
     * @param favor favor a guardar.
     * @return El favor guardado, o null si no se ha insertado.
     */
    @Override
    public Favor guardarFavor(Favor favor) {
        return favorRepo.save(favor);
    }
}
