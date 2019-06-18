package com.example.ConceptsObjets.data.contact;

public class Contact {
	protected String telephone;
	protected String mail;
	
	
	public Contact(String telephone, String mail) {
		super();
		this.telephone = telephone;
		this.mail = mail;
	}
	
	
	@Override
	public String toString() {
		return "Contact [telephone=" + telephone + ", mail=" + mail + "]";
	}
	
	
}
