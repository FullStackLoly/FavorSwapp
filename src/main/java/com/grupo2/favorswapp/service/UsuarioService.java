package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Usuario;

import java.util.List;

/**
 * Interface del servicio UsuarioService
 */
public interface UsuarioService {
    /**
     * Definición del método que valida un usuario si está registrado, o devuelve nulo si no lo está.
     */
    Usuario validarUsuario(String email, String clave);

    /**
     * Definición del método que obtiene todos los usuarios de la BBDD
     * @return List con todos los usuarios.
     */
    List<Usuario> obtenerTodosUsuarios();

    /**
     * Definicion del método que obtiene un usuario de la BBDD por su id
     * @param id id del usuario a buscar
     * @return usuario si existe con la id pasada, null en caso contrario.
     */
    Usuario obtenerUsuarioPorId(int id);

    /**
     * Definición del método para obtener un usuario de la BBDD por su email y clave
     * @param email email del usuario a buscar.
     * @param clave clave del usuario a buscar
     * @return El usuario con email y clave de parámetros, o null si no existe.
     */
    Usuario obtenerUsuarioPorEmailClave(String email, String clave);

    /**
     * Definición del método para guardar un usuario en la BBDD
     * @param usuario usuario a guardar.
     * @return El usuario guardado o null si no se ha podido guardar.
     */
    Usuario guardarUsuario(Usuario usuario);
}
