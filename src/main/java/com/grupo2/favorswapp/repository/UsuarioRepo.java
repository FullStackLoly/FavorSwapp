package com.grupo2.favorswapp.repository;

import com.grupo2.favorswapp.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de la tabla usuarios. Utiliza el modelo Usuario para acceder a la tabla usuarios
 * de la base de datos favorswapp
 */
@Repository
@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {

    Usuario findByEmailAndClave(String email, String clave);
}
