package com.example.demo_spring_boot.lecon02.interfaces;

import com.example.demo_spring_boot.lecon01.Produit;

public class CommandeInterface implements ProduitInjectable {
    private Produit produit;

    @Override
    public void injecterProduit(Produit produit){
        this.produit = produit;
    }

    public void afficherNomProduit() {
        System.out.println("Nom du produit : " + produit.getNom());
    }
}
