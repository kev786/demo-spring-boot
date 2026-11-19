package com.example.demo_spring_boot.lecon01;

public class ProduitPhysique implements Produit {
    private final String nom;

    public ProduitPhysique(String nom) {
        this.nom = nom;
    }

    @Override
    public String getNom() {
        return nom;
    }

}
