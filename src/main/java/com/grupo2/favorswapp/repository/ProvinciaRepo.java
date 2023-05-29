package com.grupo2.favorswapp.repository;

import com.grupo2.favorswapp.models.Provincia;
import com.grupo2.favorswapp.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "provincias")
public interface ProvinciaRepo extends JpaRepository<Provincia, String> {


}
