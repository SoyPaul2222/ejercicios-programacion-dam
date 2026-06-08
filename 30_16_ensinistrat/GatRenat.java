/*
 ja ho podem fer. Per exemple, podem demanar-li que es posi dret tot cridant renat.setPosicio("dret"). Amb tot, encara ho podem fer més natural. Tornem a ampliar el nostre pacient amic Renat.

 @startuml
 hide circle
 skinparam monochrome true
 skinparam classAttributeIconSize 0

 class GatRenat {
     + aixecat()
     + seu()
     + estirat()
 }
Si Renat està dret que s'assegui.
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
