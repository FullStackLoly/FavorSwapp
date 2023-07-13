package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Direccion;
import com.grupo2.favorswapp.repository.DireccionRepo;
import org.springframework.stereotype.Service;

@Service
public class DireccionServideImpl implements DireccionService{
    private final DireccionRepo direccionRepo;

    public DireccionServideImpl(DireccionRepo direccionRepo) {
        this.direccionRepo = direccionRepo;
    }


    @Override
    public Direccion guardarDireccion(Direccion direccion) {
        return direccionRepo.save(direccion);
    }
}
