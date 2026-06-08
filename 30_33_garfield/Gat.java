/*
El nom d'un gat cal que sigui no null, ni buit ni blanc. En cas que el nom que se li assigna al gat no sigui vàlid, el gat passarà a dir-se "anònim".

Els gats podran especificar en el seu naixement, a banda del requerit nom, les vides o/i la posició inicial.

Per altra banda, tenim que el GatRenat continuarà sent un Gat. En aquest cas, però, ja sabem el nom de tots els gats Renat, oi? Per tant, els seus constructors no demanaran nom
*/

public class Gat {
    private String nom;
    private int vides;
    private String posicio;

    public Gat() {
        this("Gat", 9, "estirat");
    }

    public Gat(String nom) {
        this(nom, 9, "estirat");
    }

    public Gat(String nom, int vides) {
        this (nom, vides, "estirat");
    }

    public Gat(String nom, String posicio) {
        this(nom, 9, posicio);
    }

    public Gat(String nom, int vides, String posicio) {
            setNom(nom);
            setVides(vides);
            setPosicio(posicio);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom.isBlank() || nom.isEmpty()) {
            nom = "anònim";
        }
        this.nom = nom;
    }

    public int getVides() { return vides; }

    public void setVides(int vides) {
        if (vides >= 0 && vides < 9)  {
            this.vides = vides;
        }
    }

    public String getPosicio() {return posicio;}

    public void setPosicio(String posicio) {
        if (!posicio.isEmpty() && (posicio.equals("dret") || posicio.equals("assegut") || posicio.equals("estirat") )) {
            this.posicio = posicio;
        }
    }


    public boolean esViu() {
        return vides > 0;
    }

    public boolean esDret() {
        return posicio.equals("dret");
    }
    public boolean esAssegut() {
        return posicio.equals("assegut");
    }
    public boolean esEstirat() {
        return posicio.equals("estirat");
    }

    public String aixecat() {
        if (esDret()) {
            return "passo de fer res";
        } else {
            posicio = "dret";
            return "ja m'aixeco";
        }
    }

    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";
        } else {
            posicio = "assegut";
            return "ja m'assec";
        }
    }

    public String estirat() {
        if (esEstirat()) {
            return "passo de fer res";
        } else {
            posicio = "estirat";
            return "ja m'estiro";
        }
    }

}
