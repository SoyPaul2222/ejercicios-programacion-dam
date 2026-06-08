/*
A l'hora de codificar les dues classes, tingues present que:

Gat només definirà els accessors de vides i posició.

GatRenat ja no definirà els accessors de vides ni de posició. Tampoc no definirà cap atribut. Per tant, aquells mètodes que requereixin accés a les propietats hauran de utilitzar els accessors heredats de Gat.

Fes servir el main() a UsaGatRenat per comprovar que aquesta redistribució de membres funciona com abans: */
public class GatRenat extends Gat{

    public GatRenat() {
        super(1, "estirat");
    }
    public boolean esViu() {
        return getVides() > 0;
    }

    public boolean esDret() {
        return getPosicio().equals("dret");
    }
    public boolean esAssegut() {
        return getPosicio().equals("assegut");
    }
    public boolean esEstirat() {
        return getPosicio().equals("estirat");
    }

    public String aixecat() {
        if (esDret()) {
            return "passo de fer res";
        } else {
            setPosicio("dret");
            return "ja m'aixeco";
        }
    }

    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";
        } else {
            setPosicio("assegut");
            return "ja m'assec";
        }
    }

    public String estirat() {
        if (esEstirat()) {
            return "passo de fer res";
        } else {
            setPosicio("estirat");
            return "ja m'estiro";
        }
    }
}
