package com.example.ConceptsObjets.data.person;

import com.example.ConceptsObjets.data.contact.Adresse;
import com.example.ConceptsObjets.data.contact.Contact;
import com.example.ConceptsObjets.data.contact.ContactPro;

public abstract class Employe extends Personne 
{
	protected String matricule;
	
	protected abstract double getSalaireAnnuelBrut();	
	
	public Employe(String nom, String prenom, String numSecuriteSociale, Adresse adresse, Contact contactPerso,
			ContactPro contactPro, String matricule) {
		super(nom, prenom, numSecuriteSociale, adresse, contactPerso, contactPro);
		this.matricule = matricule;
	}

	protected double getSalaireMensuelNet()
	{
		double result = (getSalaireAnnuelBrut() / 12) * 0.76;
		return result;
	}
	
	

	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", numSecuriteSociale="
				+ numSecuriteSociale + ", adresse=" + adresse + ", contactPerso=" + contactPerso + ", contactPro="
				+ contactPro + "]";
	}

	
	
	
}
