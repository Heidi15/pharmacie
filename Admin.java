public class Admin extends Utilisateur {
    public Admin(String nom) {
        super(nom);
        }
        @Override
    public void afficherDetails() {
        System.out.println("Nom : " + getNom() + ", Rôle : Admin");
        }

        @Override
    public String getRole() {
        return "Admin";
        }
    }

