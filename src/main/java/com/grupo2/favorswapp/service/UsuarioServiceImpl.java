package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Usuario;
import com.grupo2.favorswapp.repository.UsuarioRepo;
import org.springframework.stereotype.Service;

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
}
