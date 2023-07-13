package com.grupo2.favorswapp.controllers;

import com.grupo2.favorswapp.models.Usuario;
import com.grupo2.favorswapp.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controlador para validar un usuario directamente al backend.
 */
@Controller
public class UsuarioValidarController {
    /**
     * Parámetro del servicio UsuarioService
     */
    private final UsuarioService usuarioService;

    /**
     * Inyeccion de UsuarioService por constructor
     * @param usuarioService es el servicio de usuarios.
     */
    public UsuarioValidarController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    /**
     * Recibe email y password de un formulario por el método post, para validarlo
     * @param email email del usuario a validar
     * @param password contraseña del usuario a validar
     * @return Si el usuario se valida, manda a index.html, de lo contrario a login.html.
     */
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
