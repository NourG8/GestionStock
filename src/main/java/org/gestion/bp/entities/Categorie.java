package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Categorie")
@DiscriminatorValue("categorie")
public class Categorie implements Serializable {
	@Id
	private String nomCateg;
	private String description;
	
	@OneToMany(mappedBy="categorie")
	private Collection<Article> articles;
	
	public String getNomCateg() {
		return nomCateg;
	}

	public void setNomCateg(String nomCateg) {
		this.nomCateg = nomCateg;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Article> getArticles() {
		return articles;
	}

	public void setArticles(Collection<Article> articles) {
		this.articles = articles;
	}

	public Categorie() {
		// TODO Auto-generated constructor stub
	}
	
	public Categorie(String nomCateg, String description) {
		super();
		this.nomCateg = nomCateg;
		this.description = description;
	}
	

	public Categorie(String nomCateg, String description, Collection<Article> articles) {
		super();
		this.nomCateg = nomCateg;
		this.description = description;
		this.articles = articles;
	}
	
	
	
}
