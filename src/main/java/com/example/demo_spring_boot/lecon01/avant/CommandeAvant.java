package com.example.demo_spring_boot.lecon01.avant;

import com.example.demo_spring_boot.lecon01.Produit;
import com.example.demo_spring_boot.lecon01.ProduitPhysique;

public class CommandeAvant {
    private final Produit produit;

    public CommandeAvant(){
        this.produit = new ProduitPhysique("Livre python");
    }

    public void afficherNomProduit() {
        System.out.println("Nom du produit : " + produit.getNom());
    }
}
