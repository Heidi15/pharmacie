public class Main {
    public static void main(String[] args) {
        GestionStock gestionStock = new GestionStock();

        // Ajout de produits en stock
        gestionStock.ajouterProduit(new Produit("Paracétamol", 3));
        gestionStock.ajouterProduit(new Produit("Ibuprofène", 7));
        gestionStock.ajouterProduit(new Produit("Aspirine", 2));
        gestionStock.ajouterProduit(new Produit("Vitamine C", 10));
        gestionStock.ajouterProduit(new Produit("Antibiotique", 1));

        // Affichage des produits en faible stock
        gestionStock.afficherProduitsFaibles();
    }
}
