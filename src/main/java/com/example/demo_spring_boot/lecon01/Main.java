package com.example.demo_spring_boot.lecon01;

import com.example.demo_spring_boot.lecon01.apres.CommandeApres;
import com.example.demo_spring_boot.lecon01.avant.CommandeAvant;

public class Main {
    public static void main() {

        // Avant : Coulage fort entre Commande et ProduitPhysique
        // Commande choisit elle meme son produit(ProduitPhysique) et ne peut pas changer de produit
        CommandeAvant c1 = new CommandeAvant();
        c1.afficherNomProduit();

        // apres : Injection par constructeur, Commande ne choisit pas son produit, il est injecté par le constructeur
        // Couplage faible entre Commande et Produit
        Produit livre = new ProduitPhysique("Livre Java");
        Produit ebook = new ProduitNumerique("Ebook Spring");


        CommandeApres c2 = new CommandeApres(livre);
        CommandeApres c3 = new CommandeApres(ebook);

        c2.afficherNomProduit();
        c3.afficherNomProduit();


    }
}