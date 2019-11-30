package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;


public class Main {
	public static Technicien emp_01 = new Technicien("ibrahimi", "nasim", "45818212588", new LocalDate(2010, 5, 15), 2500d, 5);

	public static void main(String[] args) {
		System.out.println(emp_01.getnbrannee());
		System.out.println(emp_01.getDateEmbauche());
		System.out.println(emp_01.getNombreAnneeAnciennete());
		System.out.println(emp_01.toString());
		System.out.println("après c'est une hach");
		System.out.println(emp_01.hashCode());
	}
	
	
}
