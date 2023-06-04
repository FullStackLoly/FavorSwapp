package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Usuario;

/**
 * Interfaz del servicio UsuarioService
 */
public interface UsuarioService {
    /**
     * Definición del método que valida un usuario si está registrado, o devuelve nulo si no lo está.
     */
    public Usuario validarUsuario(String email, String clave);
}
