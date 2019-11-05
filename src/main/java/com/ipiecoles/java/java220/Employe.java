package com.ipiecoles.java.java220;

import java.util.Objects;

import org.joda.time.LocalDate;

public class Employe {
	private String nom;
	private String prenom;
	private String matricule;
	private LocalDate dateEmbauche;
	private Double salaire;

	public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.dateEmbauche = dateEmbauche;
		this.salaire = salaire;
	}

	
	public Employe() {
		
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

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(LocalDate dateEmbauche) {
		/*if(dateEmbauche.isBefore(LocalDate.now()) || dateEmbauche.equals(LocalDate.now()) ) {*/
		if(dateEmbauche ==null || !dateEmbauche.isAfter(LocalDate.now())){
		this.dateEmbauche = dateEmbauche;
		}else {
			System.out.println("La date d'embauche ne peut être postérieure à la date courante");	
		}
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	
	
	public final Integer getNombreAnneeAnciennete() {
		if(getDateEmbauche() != null) {
			int experience=getDateEmbauche().getYear();
			int date_now=LocalDate.now().getYear();
			return date_now - experience;
		}else{
			return 0; 
		}
	}
	
	public int getnbrannee() {
		return getNombreAnneeAnciennete();
	}
	
	public Integer getNbConges() {
		return Entreprise.NB_CONGES_BASE;
	}
	
	public String toString(){
		return "Employe{nom='"+nom+"', prenom='"+prenom+"', matricule='"+ matricule+"', dateEmbauche="+ dateEmbauche+", salaire="+salaire +"}";
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Employe)) return false;

		Employe employe = (Employe) o;

		if (Double.compare(employe.salaire, salaire) != 0) return false;
		if (nom != null ? !nom.equals(employe.nom) : employe.nom != null) return false;
		if (prenom != null ? !prenom.equals(employe.prenom) : employe.prenom != null) return false;
		if (matricule != null ? !matricule.equals(employe.matricule) : employe.matricule != null) return false;
		return dateEmbauche != null ? dateEmbauche.equals(employe.dateEmbauche) : employe.dateEmbauche == null;

	}
	
	
	/*public boolean equals(Object obj) {
		//return hashCode()==obj.hashCode();
		if (this == obj) return true;
		if(obj==null) return false;
		if(getClass()!=obj.getClass()) return false;
		Employe other=(Employe) obj;
		return Objects.equals(dateEmbauche, other.dateEmbauche)&& Objects.equals(matricule, other.matricule) && Objects.equals(dateEmbauche, other.dateEmbauche);
	}*/
	
	public int hashCode() {
		return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire);
	}
	
	//public abstract Double getPrimeAnnuelle();

	public void augmenterSalaire(Double pourcentage) {
		this.salaire = this.getSalaire() * (1 + pourcentage);
	}
	
	
}
