/*
Enunciat

Ara ja sabem afegir paràmetres als constructors. Per exemple:

public class GatRenat {
    private int vides;
    public GatRenat(int novesVides) {
        vides = n
*/

public class GatRenat {
    private int vides;
    private String posicio;
    public GatRenat(int novesVides, String novaPosicio) {
        vides = novesVides;
        posicio = novaPosicio;
    }
    public int getVides() { return vides; }
    public String getPosicio() {return posicio; }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s" , vides, posicio);
    }
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "estirat"));
    }
}
