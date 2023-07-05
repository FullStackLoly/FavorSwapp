package com.grupo2.favorswapp.repository;

import com.grupo2.favorswapp.models.Favor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de la tabla direcciones. Utiliza el modelo Direccion para acceder a la tabla direcciones
 * de la base de datos favorswapp
 */
@Repository
@RepositoryRestResource(path = "favores")
public interface FavorRepo extends JpaRepository<Favor, Integer> {


}
