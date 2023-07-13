package com.grupo2.favorswapp.controllers.ApiV1;

import com.grupo2.favorswapp.models.Provincia;
import com.grupo2.favorswapp.service.ProvinciaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Restcontroller para controlar las acciones de Provincias
 */
@RestController
@RequestMapping("/api/v1")
public class ProvinciaController {
    /**
     * Parámetro de servicio a inyectar
     */
    private final ProvinciaService provinciaService;

    /**
     * Inyeccion de ProvinciaService por constructor
     * @param provinciaService es el servicio de provincias pasado como parámetro
     */
    public ProvinciaController(ProvinciaService provinciaService) {
        this.provinciaService = provinciaService;
    }

    /**
     * Se encarga de gestionar las peticiones get a /api/v1/provincias
     * @return lista de todas las provincias de la base de datos.
     */
    @GetMapping("/provincias")
    public List<Provincia> obtenerTodas(){
        return provinciaService.obtenerTodasProvincias();
    }

    /**
     * Se encarga de recibir petición get de una provincia por url amigable.
     * @param id la id de la provincia a entregar
     * @return Provincia con id igual al parámetro, o null si no existe
     */
    @GetMapping("/provincias/{id}")
    public Provincia obtenerProvincia(@PathVariable String id){
        return provinciaService.obtenerProvincia(id);
    }

    /**
     * Recibe un json por método post con una provincia, y la inserta en la base de datos
     * @param provincia es la provincia a insertar.
     */
    @PostMapping("/provincias")
    public void guardarProvincia(@RequestBody Provincia provincia){
        provinciaService.guardarProvincia(provincia);
    }
}
