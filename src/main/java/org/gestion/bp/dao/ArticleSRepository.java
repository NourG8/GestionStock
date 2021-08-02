package org.gestion.bp.dao;

import org.gestion.bp.entities.ArticleS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface ArticleSRepository extends JpaRepository<ArticleS, String>{

}
