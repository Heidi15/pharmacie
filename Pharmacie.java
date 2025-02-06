import java.util.ArrayList;
public class Pharmacie {
    private ArrayList<Utilisateur> utilisateurs; // Liste des utilisateurs

    // initialisation de la liste des utilisateurs
    public Pharmacie() {
        utilisateurs = new ArrayList<>(); // Crée une liste vide
    }

    //ajouter un utilisateur
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur); // Ajoute l'utilisateur à la liste
        System.out.println("Utilisateur ajouté : " + utilisateur.getNom());
    }

    // supprimer un utilisateur
    public void supprimerUtilisateur(Utilisateur utilisateur) {
        if (utilisateurs.contains(utilisateur)) {
            utilisateurs.remove(utilisateur); // Supprime l'utilisateur de la liste
            System.out.println("Utilisateur supprimé : " + utilisateur.getNom());
        } else {
            System.out.println("Utilisateur non trouvé.");
        }
    }

    //  afficher tous les utilisateurs
    public void afficherTousLesUtilisateurs() {
        System.out.println("Liste de tous les utilisateurs :");
        for (Utilisateur utilisateur : utilisateurs) {
            utilisateur.afficherDetails(); // Affiche les détails de chaque utilisateur
        }
    }
}
