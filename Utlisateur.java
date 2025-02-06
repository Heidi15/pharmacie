public abstract class Utilisateur implements admin {
    private String nom; // privé = modifié uniquement dans cette classe

    //  initialiser le nom
    public Utilisateur(String nom) {
        this.nom = nom;
    }

    // obtenir le nom de l'utilisateur
    public String getNom() {
        return nom;
    }

    // Méthode abstraite qui  affiche les détails de l'utilisateur (
    public abstract void afficherDetails();
}
