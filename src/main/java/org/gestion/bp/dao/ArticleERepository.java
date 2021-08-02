package org.gestion.bp.dao;

import org.gestion.bp.entities.ArticleE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface ArticleERepository extends JpaRepository<ArticleE, String> {

}
