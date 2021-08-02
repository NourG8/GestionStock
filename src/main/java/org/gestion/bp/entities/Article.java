package org.gestion.bp.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="type_Article")
@Table(name="Article")
public class Article implements Serializable  {

	@Id
	private int code;
	private String nomArt;
	private int qte;
	private int qteMin;
	
	@ManyToOne
	@JoinColumn(name="cin")
	private Ouvrier ouvrier;
	
	@ManyToOne 
	@JoinColumn(name="nomMagazin")
	private Magazin magazin;
	
	@ManyToOne 
    @JoinColumn(name="nomCateg")
	private Categorie categorie;
	
	public Article() {
		// TODO Auto-generated constructor stub
	}

	public Article(int code, String nomArt, int qte, int qteMin) {
		super();
		this.code = code;
		this.nomArt = nomArt;
		this.qte = qte;
		this.qteMin = qteMin;
	}
	
	public Article(int code, String nomArt, int qte, int qteMin,Magazin magazin,
			Categorie categorie) {
		super();
		this.code = code;
		this.nomArt = nomArt;
		this.qte = qte;
		this.qteMin = qteMin;
		this.magazin = magazin;
		this.categorie = categorie;
	}

	public Article(int code, String nomArt, int qte, int qteMin, Ouvrier ouvrier, Magazin magazin,
			Categorie categorie) {
		super();
		this.code = code;
		this.nomArt = nomArt;
		this.qte = qte;
		this.qteMin = qteMin;
		this.ouvrier = ouvrier;
		this.magazin = magazin;
		this.categorie = categorie;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNomArt() {
		return nomArt;
	}

	public void setNomArt(String nomArt) {
		this.nomArt = nomArt;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public int getQteMin() {
		return qteMin;
	}

	public void setQteMin(int qteMin) {
		this.qteMin = qteMin;
	}

	public Ouvrier getOuvrier() {
		return ouvrier;
	}

	public void setOuvrier(Ouvrier ouvrier) {
		this.ouvrier = ouvrier;
	}

	public Magazin getMagazin() {
		return magazin;
	}

	public void setMagazin(Magazin magazin) {
		this.magazin = magazin;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
}
