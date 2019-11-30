package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Entreprise {
	public final static Double SALAIRE_BASE = 1480.27;
	public final static Integer NB_CONGES_BASE = 25;
	public final static Double INDICE_MANAGER = 1.3;
	public final static Double PRIME_MANAGER_PAR_TECHNICIEN = 250d;
	public final static Double PRIME_ANCIENNETE = 100d;

	public static Double primeAnnuelleBase() {
		LocalDate datecourante = new LocalDate();
		// return LocalDate.now().getYear()/2d;

		// int my_year=datecourante.getYear();
		// return my_year/2d;

		return datecourante.getYear() / 2d;
	}

}
