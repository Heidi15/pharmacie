import java.util.Map;
import java.util.HashMap;

public class Authentification {
    //herite de la classe utilisateur
    public class Admin extends Utilisateur  {
    //stocker les utilisateurs
    public static  Map<String, Utilisateur> utilisateurs = new HashMap<>();
    }
}
    //ajout d'utilisateurs
    static {
        utilisateurs.put("admin", new Admin("admin", "Nasdas"));
        utilisateurs.put("employe1", new Employe("employe1", "Assia"));
        utilisateurs.put("client1", new Client("client1", "Mme Inaf"));
    }
    //verification info
    public static Utilisateur connexion(String identifiant, String motDePasse) {
        Utilisateur utilisateur = utilisateurs.get(identifiant);
        if (utilisateur != null && utilisateur.verifierMotDePasse(motDePasse)) {
            return utilisateur;
        }
        return null;
    }

    public static void main(String[] args) {
    //demande l'identifiant
    Scanner scanner = new Scanner(System.in);
        System.out.print("Identifiant : ");
        //demande le mot de passe
        String identifiant = scanner.nextLine();
        System.out.print("Mot de passe : ");
        String motDePasse = scanner.nextLine();

        Utilisateur utilisateur = connexion(identifiant, motDePasse);

        if (utilisateur != null) {
            System.out.println("Connexion réussie ! " + identifiant);
        } else {
            System.out.println("É Identifiant ou mot de passe incorrect.");
        }
        scanner.close();
    }
}
