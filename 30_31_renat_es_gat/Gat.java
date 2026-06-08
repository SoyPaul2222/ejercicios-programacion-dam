/*
A l'hora de codificar les dues classes, tingues present que:

Gat només definirà els accessors de vides i posició.

GatRenat ja no definirà els accessors de vides ni de posició. Tampoc no definirà cap atribut. Per tant, aquells mètodes que requereixin accés a les propietats hauran de utilitzar els accessors heredats de Gat.

Fes servir el main() a 
*/
public class Gat {
    private int vides = 1;
    private String posicio = "estirat";

    public Gat(int vides, String posicio) {
        this.vides = vides;
        this.posicio = posicio;
    } 

    public int getVides() {
        return vides;
    }

    public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
    }

    public String getPosicio() {
        return posicio;
    } 

    public void setPosicio(String posicioFinal) {
         if (!posicioFinal.isEmpty() && (posicioFinal.equals("dret") || posicioFinal.equals("assegut") || posicioFinal.equals("estirat") )) {
              posicio = posicioFinal;
          }
    }
}
