public class DEpartement {
    private int identifiant ;
    private String nom ;

    public DEpartement(int identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }
    public DEpartement() {
    }


    public int getIdentifiant() {
        return identifiant;
    }
    public String getNom() {
        return nom;
    }
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString() {
        return "DEpartement [identifiant=" + identifiant + ", nom=" + nom + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof DEpartement))
            return false;
        DEpartement other = (DEpartement) obj;
        return identifiant == other.identifiant && nom == other.nom;
    }
    
}
