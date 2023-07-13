package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Usuario;
import com.grupo2.favorswapp.repository.UsuarioRepo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementación del servicio UsuarioService
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{
    /**
     * Inyección del repositorio UsuarioRepo
     */
    private final UsuarioRepo usuarioRepo;

    /**
     * Constructor para inyectar UsuarioRepo
     * @param usuarioRepo, es el repositorio la tabla usuarios
     */
    public UsuarioServiceImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    /**
     * Implementación del método para validar un usuario
     * @param email, es el email del usuario
     * @param clave, es la clave del usuario
     * @return El usuario validado, o null si no se valida
     */
    @Override
    public Usuario validarUsuario(String email, String clave) {
        return usuarioRepo.findByEmailAndClave(email, clave);
    }

    /**
     * Implementación del método para obtener todos los usuarios
     * @return lista con todos los usuarios.
     */
    @Override
    public List<Usuario> obtenerTodosUsuarios() {
        return usuarioRepo.findAll();
    }

    /**
     * Implementación para obtener un usuario según su id pasada por parámetro
     * @param id id del usuario a obtener
     * @return usuario con la id del parámetro, si existe, o null en caso contrario
     */
    @Override
    public Usuario obtenerUsuarioPorId(int id) {
        return usuarioRepo.findById(id).orElse(null);
    }

    /**
     * Implementación del método para obtener un usuario que tenga la clave y el email
     * pasado por parámetros
     * @param email email del usuario a buscar.
     * @param clave clave del usuario a buscar.
     * @return usuario que tenga el email y clave pasados por parámetro, o null si no existe
     */
    @Override
    public Usuario obtenerUsuarioPorEmailClave(String email, String clave) {
        return usuarioRepo.findByEmailAndClave(email, clave);
    }

    /**
     * Implementación del método que guarda un usuario que se pasa por parámetro en la BBDD
     * @param usuario usuario a guardar
     * @return el usuario guardado, o null si no se ha podido insertar.
     */
    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
}
