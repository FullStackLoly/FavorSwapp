package com.grupo2.favorswapp.repository;

import com.grupo2.favorswapp.models.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 *  Repositorio de la tabla provincias. Utiliza el modelo Provincia para acceder a la tabla provincias
 *  de la base de datos favorswapp
 */
@Repository
@RepositoryRestResource(path = "provincias")
public interface ProvinciaRepo extends JpaRepository<Provincia, String> {


}
