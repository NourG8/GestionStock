package org.gestion.bp.dao;

import org.gestion.bp.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Integer>{

}
