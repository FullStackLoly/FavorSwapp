package com.grupo2.favorswapp.controllers.ApiV1;

import com.grupo2.favorswapp.models.Favor;
import com.grupo2.favorswapp.models.Provincia;
import com.grupo2.favorswapp.service.ProvinciaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProvinciaController {
    private final ProvinciaService provinciaService;


    public ProvinciaController(ProvinciaService provinciaService) {
        this.provinciaService = provinciaService;
    }

    @GetMapping("/provincias")
    public List<Provincia> obtenerTodas(){
        return provinciaService.obtenerTodasProvincias();
    }

    @GetMapping("/provincias/{id}")
    public Provincia obtenerProvincia(@PathVariable String id){
        return provinciaService.obtenerProvincia(id);
    }

    @PostMapping("/provincias")
    public void guardarProvincia(@RequestBody Provincia provincia){
        provinciaService.guardarProvincia(provincia);
    }
}
