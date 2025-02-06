// GestionStock.java
import java.util.ArrayList;
import java.util.List;


 //Classe permettant de gérer le stock de produits.

public class GestionStock {
    private final List<Produit> produits;


     // Constructeur de la classe GestionStock.

    public GestionStock() {
        this.produits = new ArrayList<>();
    }

    /**
     * Ajoute un produit à la liste des stocks.
     * @param produit Produit à ajouter.
     */
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    /**
     * Trie les produits par quantité en utilisant le tri par insertion.
     */
    public void trierProduitsParQuantite() {
        int n = produits.size();
        for (int i = 1; i < n; i++) {
            Produit cle = produits.get(i);
            int j = i - 1;
            while (j >= 0 && produits.get(j).getQuantite() > cle.getQuantite()) {
                produits.set(j + 1, produits.get(j));
                j--;
            }
            produits.set(j + 1, cle);
        }
    }

    /**
     * Affiche les produits dont la quantité est inférieure à 5.
     */
    public void afficherProduitsFaibles() {
        trierProduitsParQuantite();
        System.out.println("Produits proches de la rupture de stock (quantité < 5) :");
        for (Produit produit : produits) {
            if (produit.getQuantite() < 5) {
                System.out.println(produit.getNom() + " - Quantité: " + produit.getQuantite());
            }
        }
    }
}
