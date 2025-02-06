
public class Employe extends Utilisateur {
    public Employe(String nom) {
        super(nom);
    }

    // Implémentation afficherDetails() pour l'Employé
    @Override
    public void afficherDetails() {
        System.out.println("Nom : " + nom + ", Rôle : Employé");
    }

    // Implémentation de la méthode getRole()
    @Override
    public String getRole() {
        return "Employé";
    }
}
