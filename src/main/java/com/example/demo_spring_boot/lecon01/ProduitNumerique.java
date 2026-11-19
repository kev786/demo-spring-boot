package com.example.demo_spring_boot.lecon01;

public class ProduitNumerique implements Produit {
    private final String nom;

    public ProduitNumerique(String nom) {
        this.nom = nom;
    }

    @Override
    public String getNom() {
        return nom;
    }

}
