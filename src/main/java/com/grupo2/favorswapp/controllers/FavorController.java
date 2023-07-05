package com.grupo2.favorswapp.controllers;

import com.grupo2.favorswapp.models.Favor;
import com.grupo2.favorswapp.models.Provincia;
import com.grupo2.favorswapp.service.FavorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FavorController {
    private final FavorService favorService;

    public FavorController(FavorService favorService) {
        this.favorService = favorService;
    }

    @GetMapping("/favores")
    public List<Favor> obtenerTodos(){
        System.out.println("metodo get");
        return favorService.obtenerTodosFavores();
    }

    @GetMapping("/favores/{id}")
    public Favor obtenerProvincia(@PathVariable int id){
        return favorService.obtenerFavor(id);
    }

    @PostMapping("/favores")
    public void guardarFavor(@RequestBody Favor favor){
        System.out.println(favor);
    }

}
