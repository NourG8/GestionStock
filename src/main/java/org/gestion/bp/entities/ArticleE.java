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
//@DiscriminatorValue("ArticleE")
@Table(name="ArticleE")
public class ArticleE implements Serializable{
	@Id
	@GeneratedValue
	private int codeArtE;
	private String nomArtE;
	private String nomCat;
	private int qteE;
	
	
	public ArticleE() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ArticleE(int codeArtE, String nomArtE, String nomCat, int qteE) {
		super();
		this.codeArtE = codeArtE;
		this.nomArtE = nomArtE;
		this.nomCat = nomCat;
		this.qteE = qteE;
	}


	public int getCodeArtE() {
		return codeArtE;
	}


	public void setCodeArtE(int codeArtE) {
		this.codeArtE = codeArtE;
	}


	public String getNomArtE() {
		return nomArtE;
	}


	public void setNomArtE(String nomArtE) {
		this.nomArtE = nomArtE;
	}


	public String getNomCat() {
		return nomCat;
	}


	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}


	public int getQteE() {
		return qteE;
	}


	public void setQteE(int qteE) {
		this.qteE = qteE;
	}

	
	
}
