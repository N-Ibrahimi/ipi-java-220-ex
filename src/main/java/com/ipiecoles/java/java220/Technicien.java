package com.ipiecoles.java.java220;

import java.util.Objects;

import org.joda.time.LocalDate;

public class Technicien extends Employe implements Comparable<Technicien> {
	
	private Integer grade;

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Technicien() {
		super();
	}

	public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Integer grade) {
		super(nom, prenom, matricule, dateEmbauche, salaire);
		this.grade= grade;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(),grade);
	}
	
	
	@Override
	public void setSalaire( Double salaire) {
		super.setSalaire( salaire*(1+(double) grade/10));
	}

	@Override
	public Double getPrimeAnnuelle(){
		return Entreprise.primeAnnuelleBase() +
		Entreprise.primeAnnuelleBase() * (grade/10d)+
		Entreprise.PRIME_ANCIENNETE * getNombreAnneeAnciennete();
	}
		
	@Override
	public Integer getNbConges() {
		return super.getNbConges() + getNombreAnneeAnciennete();
	}

	@Override
	public int compareTo(Technicien o) {
		return Integer.compare(this.grade, o.grade);
	}
	
	
}
