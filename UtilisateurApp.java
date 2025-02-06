abstract class Utilisateur {
    protected String identifiant;//id utilisé
    protected String motDePasse;// mdp utilisé

    public Utilisateur(String identifiant, String motDePasse) {
        this.identifiant = identifiant;//initialisation id
        this.motDePasse = motDePasse;// " mdp
    }

    public String getIdentifiant() {
        return identifiant;
    }//obtenir l'id de l'utilisateur

    public boolean verifierMotDePasse(String motDePasse) {
        return this.motDePasse.equals(motDePasse);
    }
}