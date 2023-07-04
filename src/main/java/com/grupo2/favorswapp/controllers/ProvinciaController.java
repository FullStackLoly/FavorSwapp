package com.grupo2.favorswapp.controllers;

import com.grupo2.favorswapp.service.ProvinciaService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvinciaController {
    private final ProvinciaService provinciaService;


    public ProvinciaController(ProvinciaService provinciaService) {
        this.provinciaService = provinciaService;
    }
}
