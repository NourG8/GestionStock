package org.gestion.bp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Utilisateur")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_user")
public class Utilisateur implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="Cin",length=8)
	@NotEmpty
	@Size(min=8,max=8)
	private int cin ;
	@Column(name="nom",length=15)
	@NotNull
	@Size(min=3,max=15)
	private String nom;
	@Column(name="Prenom",length=15)
	@NotEmpty
	@Size(min=3,max=15)
	private String prenom;
	@Column(name="Age",length=2)
	@NotEmpty
	@Size(min=1,max=2)
	private int age;
	@Column(name="Login",length=40)
	@NotEmpty
	@Size(min=15,max=40)
	private String login;
	@Column(name="Password",length=30)
	@NotEmpty
	@Size(min=15,max=30)
	private String password;
	private String photo;
	
	public Utilisateur(int id, int cin, String nom, String prenom, int age, String login, String password) {
		super();
		this.id = id;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.login = login;
		this.password = password;
	}
	
	public Utilisateur(int id, @NotEmpty @Size(min = 8, max = 8) int cin, @NotNull @Size(min = 3, max = 15) String nom,
			@NotEmpty @Size(min = 3, max = 15) String prenom, @NotEmpty @Size(min = 1, max = 2) int age,
			@NotEmpty @Size(min = 15, max = 40) String login, @NotEmpty @Size(min = 15, max = 30) String password,
			String photo) {
		super();
		this.id = id;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.login = login;
		this.password = password;
		this.photo = photo;
	}

	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	 @Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	 @Column(name = "cin", nullable = false)
	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	 @Column(name = "nom", nullable = false)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	 @Column(name = "prenom", nullable = false)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	 @Column(name = "age", nullable = false)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	 @Column(name = "login", nullable = false)
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	 @Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
