package com.grupo2.favorswapp.controllers;

import com.grupo2.favorswapp.models.Provincia;
import com.grupo2.favorswapp.service.ProvinciaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FavorController {
    private final FavorController favorController;


    public FavorController(FavorController favorController) {
        this.favorController = favorController;
    }

    @GetMapping("/favores")
    public List<Provincia> obtenerTodas(){
        return favorController.obtenerTodas();
    }

    @GetMapping("/favores/{id}")
    public Provincia obtenerProvincia(@PathVariable String id){
        return favorController.;
    }

}
