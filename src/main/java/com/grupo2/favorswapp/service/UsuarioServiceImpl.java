package com.grupo2.favorswapp.service;

import com.grupo2.favorswapp.models.Usuario;
import com.grupo2.favorswapp.repository.UsuarioRepo;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    private final UsuarioRepo usuarioRepo;

    public UsuarioServiceImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public Usuario validarUsuario(String email, String clave) {
        return usuarioRepo.findByEmailAndClave(email, clave);
    }
}
