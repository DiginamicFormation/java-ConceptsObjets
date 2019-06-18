package com.example.ConceptsObjets.data.contact;

public class ContactPro extends Contact {
	private String service;
	private Adresse adresse;
	
	public ContactPro(String telephone, String mail, String service, Adresse adresse) {
		super(telephone, mail);
		this.service = service;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "ContactPro [service=" + service + ", adresse=" + adresse + ", telephone=" + telephone + ", mail=" + mail
				+ "]";
	}	
	
	
}
