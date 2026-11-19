package com.example.demo_spring_boot.lecon01.apres;

import com.example.demo_spring_boot.lecon01.Produit;

public class CommandeApres {
    private final Produit produit;

    public CommandeApres(Produit produit) {
        this.produit = produit;
    }

    public void afficherNomProduit() {
        System.out.println("Nom du produit : " + produit.getNom());
    }

}
