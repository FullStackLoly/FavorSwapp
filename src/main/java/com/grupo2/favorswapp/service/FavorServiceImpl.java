package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Favor;
import com.grupo2.favorswapp.repository.FavorRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FavorServiceImpl implements FavorService{
    private final FavorRepo favorRepo;

    public FavorServiceImpl(FavorRepo favorRepo) {
        this.favorRepo = favorRepo;
    }

    @Override
    public List<Favor> obtenerTodosFavores() {
        return favorRepo.findAll();
    }

    @Override
    public Favor obtenerFavor(int id) {
        return favorRepo.findById(id).orElse(null);
    }

    @Override
    public Favor guardarFavor(Favor favor) {
        return favorRepo.save(favor);
    }
}
