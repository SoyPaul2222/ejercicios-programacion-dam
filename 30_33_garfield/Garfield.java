/*
El nom d'un gat cal que sigui no null, ni buit ni blanc. En cas que el nom que se li assigna al gat no sigui vàlid, el gat passarà a dir-se "anònim".

Els gats podran especificar en el seu naixement, a banda del requerit nom, les vides o/i la posició inicial.

Per altra banda, tenim que el GatRenat continuarà sent un Gat. En aquest cas, però, ja sabem el nom de tots els gats Renat, oi? Per tant, els seus constructors no demanaran nom
*/

public class Garfield extends Gat {

    public Garfield() {
        super("Garfield", 9, "estirat");
    }

    @Override
    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";
        } else {
            setPosicio("assegut");
            return "ja m'assec";
        }
    }

    @Override
    public String aixecat() {
        if (!esAssegut()) {
            return "passo de fer res";
        } else {
            setPosicio("dret");
            return "ja m'aixeco";
        }
    }

    @Override
    public String estirat() {
       if (esEstirat()) {
          return "passo de fer res";
        } else if (esAssegut()) {
           setPosicio("estirat");
            return "ja m'estiro";
        } else {
  
          return "Bai Maitea, bai";
       }
   }
}

