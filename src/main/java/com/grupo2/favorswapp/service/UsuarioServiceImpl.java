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

    @Override
    public List<Usuario> obtenerTodosUsuarios() {
        return usuarioRepo.findAll();
    }

    @Override
    public Usuario obtenerUsuarioPorId(int id) {
        return usuarioRepo.findById(id).orElse(null);
    }

    @Override
    public Usuario obtenerUsuarioPorEmailClave(String email, String clave) {
        return usuarioRepo.findByEmailAndClave(email, clave);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
}
