package com.example.demo_spring_boot.lecon02;

import com.example.demo_spring_boot.lecon01.Produit;
import com.example.demo_spring_boot.lecon01.ProduitNumerique;
import com.example.demo_spring_boot.lecon01.ProduitPhysique;
import com.example.demo_spring_boot.lecon02.interfaces.CommandeInterface;
import com.example.demo_spring_boot.lecon02.setter.CommandeSetter;

public class Main {
    public static void main(){
        // Injection via Setter
        CommandeSetter c = new CommandeSetter();
        c.setProduit(new ProduitPhysique("Livrejava"));
        c.afficherNomProduit();
        
        // injection par interface
        Produit livre = new ProduitNumerique("livreC#");
        CommandeInterface c4 = new CommandeInterface();
        c4.injecterProduit(livre);
        c4.afficherNomProduit();
        
    }
}
