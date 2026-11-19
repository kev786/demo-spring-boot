package com.example.demo_spring_boot.lecon02.setter;

import com.example.demo_spring_boot.lecon01.Produit;

public class CommandeSetter {
    private Produit produit;

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public void afficherNomProduit() {
        System.out.println("Nom du produit : " + produit.getNom());
    }
}
