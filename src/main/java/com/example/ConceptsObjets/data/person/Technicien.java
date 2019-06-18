package com.example.ConceptsObjets.data.person;

import com.example.ConceptsObjets.data.contact.Adresse;
import com.example.ConceptsObjets.data.contact.Contact;
import com.example.ConceptsObjets.data.contact.ContactPro;

public class Technicien extends Employe {
	
	public static final String MISSION = "Fabriquer et contrôler les produits";

	private int tauxHoraire;
	
	
	public Technicien(String nom, String prenom, String numSecuriteSociale, Adresse adresse, Contact contactPerso,
			ContactPro contactPro, String matricule, int tauxHoraire) {
		super(nom, prenom, numSecuriteSociale, adresse, contactPerso, contactPro, matricule);
		this.tauxHoraire = tauxHoraire;
	}

	@Override
	protected double getSalaireAnnuelBrut() {
		double result = 1607 * tauxHoraire;
		return result;
	}

	

	@Override
	public String toString() {
		return "Technicien [tauxHoraire=" + tauxHoraire + ", matricule=" + matricule + ", nom=" + nom + ", prenom="
				+ prenom + ", numSecuriteSociale=" + numSecuriteSociale + ", adresse=" + adresse + ", contactPerso="
				+ contactPerso + ", contactPro=" + contactPro + "]";
	}

	
}
