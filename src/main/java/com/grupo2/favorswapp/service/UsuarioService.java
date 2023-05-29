package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Usuario;

public interface UsuarioService {
    /**
     * Método para validar un usuario si está registrado
     * @param email
     * @param clave
     * @return Usuario si está en la base de datos, o null si no está registrado
     */
    public Usuario validarUsuario(String email, String clave);
}
