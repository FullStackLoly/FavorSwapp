package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Provincia;
import com.grupo2.favorswapp.repository.ProvinciaRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImpl implements ProvinciaService{
    private final ProvinciaRepo provinciaRepo;

    public ProvinciaServiceImpl(ProvinciaRepo provinciaRepo) {
        this.provinciaRepo = provinciaRepo;
    }

    @Override
    public List<Provincia> obtenerTodasProvincias() {
        return provinciaRepo.findAll() ;
    }

    @Override
    public Provincia obtenerProvincia(String id) {
        return provinciaRepo.findById(id).orElse(null);
    }
}
