package org.gestion.bp.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@DiscriminatorValue("ArticleS")
@Table(name="ArticleS")
public class ArticleS implements Serializable {
	@Id
	@GeneratedValue
	private int codeArtS;
	private String nomArtS;
	private String nomCat;
	private int qteS;
	
	public ArticleS() {
		// TODO Auto-generated constructor stub
	}
	
	public ArticleS(int codeArtS, String nomArtS, String nomCat, int qteS) {
		super();
		this.codeArtS = codeArtS;
		this.nomArtS = nomArtS;
		this.nomCat = nomCat;
		this.qteS = qteS;
	}

	public int getCodeArtS() {
		return codeArtS;
	}

	public void setCodeArtS(int codeArtS) {
		this.codeArtS = codeArtS;
	}

	public String getNomArtS() {
		return nomArtS;
	}

	public void setNomArtS(String nomArtS) {
		this.nomArtS = nomArtS;
	}

	public String getNomCat() {
		return nomCat;
	}

	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}

	public int getQteS() {
		return qteS;
	}

	public void setQteS(int qteS) {
		this.qteS = qteS;
	}

}
