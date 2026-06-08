/*
    El nom d'un gat cal que sigui no null, ni buit ni blanc. En cas que el nom que se li assigna al gat no sigui vàlid, el gat passarà a dir-se "anònim".

Els gats podran especificar en el seu naixement, a banda del requerit nom, les vides o/i la posició inicial.

Per altra banda, tenim que el GatRenat continuarà sent un Gat. Enºº
*/

public class GatRenat extends Gat  {
    public GatRenat() {
        super("Renat", 9, "estirat");
    }
    public GatRenat(int vides) {
        super("Renat", vides, "estirat");
    }
    public GatRenat(String posicio) {
        super("Renat", 9, posicio);
    }

    public GatRenat(int vides, String posicio) {
        super("Renat", vides, posicio);
    }
}
