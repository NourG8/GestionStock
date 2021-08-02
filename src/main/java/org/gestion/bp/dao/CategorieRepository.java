package org.gestion.bp.dao;

import org.gestion.bp.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, String> {

}
