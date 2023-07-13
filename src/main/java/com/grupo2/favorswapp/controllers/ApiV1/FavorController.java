package com.grupo2.favorswapp.controllers.ApiV1;

import com.grupo2.favorswapp.models.Favor;
import com.grupo2.favorswapp.service.FavorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Restcontroller para controlar las acciones de favores
 */
@RestController
@RequestMapping("/api/v1")
public class FavorController {
    /**
     * Parámetro de servicio a inyectar
      */
    final FavorService favorService;

    /**
     * Inyeccion de favorService
     * @param favorService es el servicio de favores
     */
    public FavorController(FavorService favorService) {
        this.favorService = favorService;
    }

    /**
     * Se encarga de gestionar las peticiones get a /api/v1/favores
     * @return Lista con todos los favores en la base de datos.
     */
    @GetMapping("/favores")
    public List<Favor> obtenerTodos(){
        return favorService.obtenerTodosFavores();
    }

    /**
     * Se encarga de recibir petición get de un favor por url amigable.
     * @param id es la id del favor a entregar
     * @return favor correspondiente a la id del parámetro, o null si no existe
     */
    @GetMapping("/favores/{id}")
    public Favor obtenerProvincia(@PathVariable int id){
        return favorService.obtenerFavor(id);
    }

    /**
     * Recibe mediante post un favor para insertarlo a la base de datos
     * @param favor favor a insertar
     * @return El favor insertado o null
     */
    @PostMapping("/favores")
    public Favor guardarFavor(@RequestBody Favor favor){
        return favorService.guardarFavor(favor);
    }
}
