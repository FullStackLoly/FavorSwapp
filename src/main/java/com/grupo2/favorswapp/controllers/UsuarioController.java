package com.grupo2.favorswapp.controllers;

import com.grupo2.favorswapp.models.Usuario;
import com.grupo2.favorswapp.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @PostMapping("/validar")
    public String validarUser(
            String email,
            String password
    ){
        Usuario usuario = usuarioService.validarUsuario(email, password);
        if (usuario == null){
            return "login";
        } else {
            return "index";
        }
    }
}
