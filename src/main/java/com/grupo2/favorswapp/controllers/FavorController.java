package com.grupo2.favorswapp.controllers;

import com.grupo2.favorswapp.models.Favor;
import com.grupo2.favorswapp.models.Provincia;
import com.grupo2.favorswapp.service.FavorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return favorService.obtenerTodosFavores();
    }

    @GetMapping("/favores/{id}")
    public Favor obtenerProvincia(@PathVariable int id){
        return favorService.obtenerFavor(id);
    }

}
