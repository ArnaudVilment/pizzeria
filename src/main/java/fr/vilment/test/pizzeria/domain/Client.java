package fr.vilment.test.pizzeria.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "NUM_CLIENT")
	private int num_client;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "ADRESSE")
	private String adresse;
	@Column(name = "TEL_FIXE")
	private String tel_fixe;
	@Column(name = "TEL_PORTABLE")
	private String tel_portable;
	@Column(name = "DATE_NAISSANCE")
	private Date date_naissance;
	@Column(name = "EMAIL")
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum_client() {
		return num_client;
	}
	public void setNum_client(int num_client) {
		this.num_client = num_client;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel_fixe() {
		return tel_fixe;
	}
	public void setTel_fixe(String tel_fixe) {
		this.tel_fixe = tel_fixe;
	}
	public String getTel_portable() {
		return tel_portable;
	}
	public void setTel_portable(String tel_portable) {
		this.tel_portable = tel_portable;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
