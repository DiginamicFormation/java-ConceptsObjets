package com.example.ConceptsObjets.data.person;

import com.example.ConceptsObjets.data.contact.Adresse;
import com.example.ConceptsObjets.data.contact.Contact;
import com.example.ConceptsObjets.data.contact.ContactPro;

public class Commercial extends Employe
{
	public static final String MISSION = "Faire de nouveaux contacts";

	private int chiffreAffaire;
	

	public Commercial(String nom, String prenom, String numSecuriteSociale, Adresse adresse, Contact contactPerso,
			ContactPro contactPro, String matricule, int chiffreAffaire) {
		super(nom, prenom, numSecuriteSociale, adresse, contactPerso, contactPro, matricule);
		this.chiffreAffaire = chiffreAffaire;
	}

	@Override
	protected double getSalaireAnnuelBrut() {
		double result = chiffreAffaire * 0.05;
		return result;
	}

	

	@Override
	public String toString() {
		return "Commercial [chiffreAffaire=" + chiffreAffaire + ", matricule=" + matricule + ", nom=" + nom
				+ ", prenom=" + prenom + ", numSecuriteSociale=" + numSecuriteSociale + ", adresse=" + adresse
				+ ", contactPerso=" + contactPerso + ", contactPro=" + contactPro + "]";
	}
	
	
	
}
