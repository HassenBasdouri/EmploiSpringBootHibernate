package com.emploi.app.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Seance")
public class Seance implements Serializable{
	private static final long serialVersionUID = 1L;
	public enum Type
    { 
        TD, TP, Cours; 
    } 
	static List<Type> types =Arrays.asList(Type.class.getEnumConstants());
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	Long id_Sea;
	@Column
	String heureDebut;
	@Column
	String heureFin;
	@Column
	Integer jour;
	@Column
	Type type;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Sa")
    private Salle salle;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Ens")
    private Enseignant enseignant;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Ma")
    private Matiere matiere;
	public Long getId_Sea() {
		return id_Sea;
	}
	public void setId_Sea(Long id_Sea) {
		this.id_Sea = id_Sea;
	}
	public String getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}
	public String getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}
	public Integer getJour() {
		return jour;
	}
	public void setJour(Integer jour) {
		this.jour = jour;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public static List<Type> getTypes(){
		return types;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
}