package com.example.ConceptsObjets;

import com.example.ConceptsObjets.data.contact.Adresse;
import com.example.ConceptsObjets.data.contact.Contact;
import com.example.ConceptsObjets.data.contact.ContactPro;
import com.example.ConceptsObjets.data.person.Cadre;
import com.example.ConceptsObjets.data.person.Commercial;
import com.example.ConceptsObjets.data.person.Technicien;

public class App 
{
    public static void main( String[] args )
    {
        Adresse adresseCadre = new Adresse(14, "Rue des Coquelicots", "34000", "Montpellier");
        
        Contact contactPersoCadre = new Contact("0400000000", "cadre@perso.fr");
        
        ContactPro contactProCadre = new ContactPro("0600000000", "cadre@entreprise.fr", "Etude et développement", adresseCadre);
        
        Cadre cadre = new Cadre("DOE", 
        		"John", 
        		"1701134111222",
        		adresseCadre, 
        		contactPersoCadre, 
        		contactProCadre, 
        		"0001", 
        		300);
        
        System.out.println(cadre.toString());
        
        
        Adresse adresseTechnicien = new Adresse(28, "Allée des Oiseaux", "34500", "Béziers");
        
        Contact contactPersoTechniciel = new Contact("0400000001", "technicien@perso.fr");
        
        ContactPro contactProTechnicien = new ContactPro("0600000001", "technicien@entreprise.fr", "Unité de fabrication", adresseTechnicien);
        
        Technicien technicien = new Technicien("ROE", 
        		"Richard", 
        		"1701134111333", 
        		adresseTechnicien, 
        		contactPersoTechniciel, 
        		contactProTechnicien, 
        		"0002", 
        		15);
        
        System.out.println(technicien.toString());
        
        
        Adresse adresseCommercial = new Adresse(15, "Chemin des Amoureux", "31000", "Toulouse");
        
        Contact contactPersoCommercial = new Contact("0400000002", "commercial@perso.fr");
        
        ContactPro contactProCommercial = new ContactPro("0600000002", "commercial@entreprise.fr", "Etude et développement", adresseCommercial);
        
        Commercial commercial = new Commercial("WADE", 
        		"Richard", 
        		"1701134111444", 
        		adresseCommercial, 
        		contactPersoCommercial, 
        		contactProCommercial, 
        		"0003", 
        		650000);
        
        System.out.println(commercial.toString());
        
    }
}
