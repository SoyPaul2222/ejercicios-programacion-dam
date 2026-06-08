/*
Una mica de culturilla POO
Si bé un mòdul com ara esEstirat() també ens permet accedir al valor d'una propietat privada de la instància, en el món POO, no se'l coneix com a accessor.

En tot cas, ja va sent hora de que et presenti el nom amb el que normalment ens referim als mòduls definits a una classe: en diem mètodes o també serveis.
*/

public class GatRenat {
    private int vides = 1;
    private String posicio = "estirat";

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
}
