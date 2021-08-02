package org.gestion.bp.dao;

import org.gestion.bp.entities.Admin;
import org.gestion.bp.entities.Ouvrier;
import org.gestion.bp.entities.Utilisateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
@Repository
public interface UtilisateurRepository  extends JpaRepository<Utilisateur, Integer>{
//	@Query("select o from Admin o order by o.id desc ")
//	public Page<Admin> chercherUtilisateurs( Pageable pageable);
//	@Query("select o from Ouvrier o order by o.id desc ")
//	public Page<Ouvrier> chercherUtilisateursO(Pageable pageable);
//	
//	@Query("select o from Admin o where o.nom like :x order by o.id desc")
//	public Page<Admin> RechercheAdmin(@Param("x")String mc,  Pageable pageable);
//	
//	@Query("select o from Ouvrier o where o.nom like :y order by o.id desc")
//	public Page<Ouvrier> RechercheOuvrier(@Param("y")String mc,  Pageable pageable);
//	
//	@Query("select o from Admin o ")
//	public Page<Admin> getAllAdmin();

}
