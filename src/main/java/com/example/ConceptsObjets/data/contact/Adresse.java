package com.example.ConceptsObjets.data.contact;

public class Adresse {

	protected int numRue;
	protected String rue;
	protected String codePostal;
	protected String ville;
	
	
	
	public Adresse(int numRue, String rue, String codePostal, String ville) {
		super();
		this.numRue = numRue;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	
	@Override
	public String toString() {
		return "Adresse [numRue=" + numRue + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}
	
	
	
}
