import java.util.ArrayList;
import java.util.List;

//Classe représentant un produit en stock
public class Produit {
    private final String nom;
    private final int quantite;

    /**
     * Constructeur de la classe Produit.
     * @param nom Nom du produit.
     * @param quantite Quantité en stock.
     */
    public Produit(String nom, int quantite) {
        this.nom = nom;
        this.quantite = quantite;
    }

    /**
     * Retourne le nom du produit.
     * @return Nom du produit.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne la quantité du produit en stock.
     * @return Quantité en stock.
     */
    public int getQuantite() {
        return quantite;
    }
}
