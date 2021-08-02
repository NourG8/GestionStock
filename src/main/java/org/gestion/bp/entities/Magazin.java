package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Magazin")
public class Magazin implements Serializable {
	@Id
	private String nomMagazin;
	
	@OneToMany(mappedBy="magazin")
	private List<Article> articles;

	public Magazin() {
		// TODO Auto-generated constructor stub
	}

	
	public Magazin(String nomMagazin) {
		super();
		this.nomMagazin = nomMagazin;
	}

	public Magazin(String nomMagazin, List<Article> articles) {
		super();
		this.nomMagazin = nomMagazin;
		this.articles = articles;
	}


	public String getNomMagazin() {
		return nomMagazin;
	}


	public void setNomMagazin(String nomMagazin) {
		this.nomMagazin = nomMagazin;
	}


	public List<Article> getArticles() {
		return articles;
	}


	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
