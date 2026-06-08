package jugador;

public class jugador {

    static int nJugadors = 0; //estatic == de la clase

    private String nom = "Jordan";
    private int dorsal = 0;
    private int punts = 0;

    //Constructors

    public jugador () { //per defete

    }

    public jugador (String nomJ, int dorsalJ) {
        nom = nomJ;
        this.dorsal = dorsalJ;
        nJugadors++;
    }

    public jugador (String nomJ, int dorsalJ, int punts) {
        this.nom = nomJ;
        this.dorsal = dorsalJ;
        if (punts>=0) {
            
        }
        this.punts = punts;
        nJugadors++;
    }

    //setters

    public void setPunts(int punts) {
        if (punts >= 0) {
        this.punts = punts;


        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDorsal (int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNom() {
        return nom;
    }

    public int getDorsal() {
        return dorsal;
    }

    


    // Si lo tiene cada jugador NO es static, pero si queremos definir una clase sí
    //Si static es de la clase, y si no es cada jugador

    /*
        Aquest metode incremta els punts del jugador
    */

    public void anotar(int puntsMarcats) {
        punts += puntsMarcats;

    }

    public String toString() {
        return nom + " " + dorsal + " " + punts;
    }
    
}
