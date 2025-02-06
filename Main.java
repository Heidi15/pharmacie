public class Main {
    public static void main(String[] args) {
        //pharmacie
        Pharmacie pharmacie = new Pharmacie();

        // Création d'un admin et d'un employé
        Admin admin = new Admin("Nasdas");
        Employe employe1 = new Employe("Assia");
        Employe employe2 = new Employe("Cappucino");

        //ajout des employés
        pharmacie.ajouterUtilisateur(employe1);
        pharmacie.ajouterUtilisateur(employe2);

        // la liste des utilisateurs
        pharmacie.afficherUtilisateurs();

        // gérer les utilisateurs
        admin.ajouterUtilisateur(employe1);
        admin.supprimerUtilisateur(employe2);

        // Affichage après suppression
        pharmacie.afficherUtilisateurs();
    }
}
