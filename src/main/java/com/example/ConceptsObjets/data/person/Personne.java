package com.example.ConceptsObjets.data.person;

import com.example.ConceptsObjets.data.contact.Adresse;
import com.example.ConceptsObjets.data.contact.Contact;
import com.example.ConceptsObjets.data.contact.ContactPro;

public class Personne {

	protected String nom;
	protected String prenom;
	protected String numSecuriteSociale;
	
	protected Adresse adresse;
	protected Contact contactPerso;
	protected ContactPro contactPro;
	
		
	public Personne(String nom, String prenom, String numSecuriteSociale, Adresse adresse, Contact contactPerso,
			ContactPro contactPro) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numSecuriteSociale = numSecuriteSociale;
		this.adresse = adresse;
		this.contactPerso = contactPerso;
		this.contactPro = contactPro;
	}


	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", numSecuriteSociale=" + numSecuriteSociale
				+ ", adresse=" + adresse + ", contactPerso=" + contactPerso + ", contactPro=" + contactPro + "]";
	}
	
	
}
