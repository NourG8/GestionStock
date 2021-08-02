package org.gestion.bp.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Ouvrier")
@DiscriminatorValue("ouvrier")
public class Ouvrier extends Utilisateur {

	@OneToMany(mappedBy="ouvrier")
	private List<Article> articles;
	
	public Ouvrier() {
		// TODO Auto-generated constructor stub
	}

	
	public Ouvrier(int id,int cin, String nom, String prenom, int age, String login, String password) {
		super(id, cin, nom, prenom, age, login, password);
		// TODO Auto-generated constructor stub
	}

	public Ouvrier(int id,int cin, String nom, String prenom, int age, String login, String password, List<Article> articles) {
		super(id,cin, nom, prenom, age, login, password);
		//this.articles = articles;
	}
	
	public Ouvrier(int id, @NotEmpty @Size(min = 8, max = 8) int cin, @NotNull @Size(min = 3, max = 15) String nom,
			@NotEmpty @Size(min = 3, max = 15) String prenom, @NotEmpty @Size(min = 1, max = 2) int age,
			@NotEmpty @Size(min = 15, max = 40) String login, @NotEmpty @Size(min = 15, max = 30) String password,
			String photo) {
		super(id, cin, nom, prenom, age, login, password, photo);
		// TODO Auto-generated constructor stub
	}


	public List<Article> getArticles() {
		return articles;
	}


	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	
	
}
