package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Usuario;

import java.util.List;

/**
 * Interfaz del servicio UsuarioService
 */
public interface UsuarioService {
    /**
     * Definición del método que valida un usuario si está registrado, o devuelve nulo si no lo está.
     */
    Usuario validarUsuario(String email, String clave);
    List<Usuario> obtenerTodosUsuarios();
    Usuario obtenerUsuarioPorId(int id);
    Usuario obtenerUsuarioPorEmailClave(String email, String clave);
    Usuario guardarUsuario(Usuario usuario);
}
