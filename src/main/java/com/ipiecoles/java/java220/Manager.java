package com.ipiecoles.java.java220;

import java.util.HashSet;
import java.util.Objects;

import org.joda.time.LocalDate;

public class Manager extends Employe{
	private HashSet<Technicien> equipe=new HashSet<Technicien>();

	public HashSet<Technicien> getEquipe() {
		return equipe;
	}

	public void setEquipe(HashSet<Technicien> equipe) {
		this.equipe = equipe;
	}
	
	public Manager() {
		super();
	}; 
	

	
	public Manager(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, HashSet<Technicien> equipe) {
		super(nom, prenom, matricule, dateEmbauche, salaire);
		this.equipe= equipe;
	}
	

	@Override
	public int hashCode(){
		return Objects.hash(super.hashCode(), equipe);
	}
	
	@Override
	public Double getPrimeAnnuelle() {
		//Entreprise.PRIME_MANAGER_PAR_TECHNICIEN
		return Entreprise.primeAnnuelleBase()+
				equipe.size()* Entreprise.PRIME_MANAGER_PAR_TECHNICIEN;
	}
	
	public void ajoutTechnicienEquipe(Technicien t) {
		if(this.equipe==null) {
			equipe=new HashSet<Technicien>();
			}
			this.equipe.add(t);
		}
	
	@Override
	public void setSalaire(Double salaire) {
		super.setSalaire(salaire * Entreprise.INDICE_MANAGER +(salaire * (double)equipe.size()/10));
	}
	
	
}
