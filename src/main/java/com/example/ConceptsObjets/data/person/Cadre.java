package com.example.ConceptsObjets.data.person;

import com.example.ConceptsObjets.data.contact.Adresse;
import com.example.ConceptsObjets.data.contact.Contact;
import com.example.ConceptsObjets.data.contact.ContactPro;

public class Cadre extends Employe {
	
	public static final String MISSION = "Gérer les projets";
	
	private double tauxJournalier;
	
	
	public Cadre(String nom, String prenom, String numSecuriteSociale, Adresse adresse, Contact contactPerso,
			ContactPro contactPro, String matricule, double tauxJournalier) {
		super(nom, prenom, numSecuriteSociale, adresse, contactPerso, contactPro, matricule);
		this.tauxJournalier = tauxJournalier;
	}

	@Override
	protected double getSalaireAnnuelBrut() {
		double result = 212 * tauxJournalier;
		return result;
	}

	

	@Override
	public String toString() {
		return "Cadre [tauxJournalier=" + tauxJournalier + ", matricule=" + matricule + ", nom=" + nom + ", prenom="
				+ prenom + ", numSecuriteSociale=" + numSecuriteSociale + ", adresse=" + adresse + ", contactPerso="
				+ contactPerso + ", contactPro=" + contactPro + "]";
	}

	

	
	
	
}
