/*
A l'hora de codificar les dues classes, tingues present que:

Gat només definirà els accessors de vides i posició.

GatRenat ja no definirà els accessors de vides ni de posició. Tampoc no definirà cap atribut. Per tant, aquells mètodes que requereixin accés a les propietats hauran de utilitzar els accessors heredats de Gat.

Fes servir el main() a UsaGatRenat per comprovar que aquesta redistribució de membres funciona com abans:
*/
public class UsaGatRenat {
    public static void main(String[] args) {
    GatRenat renat = new GatRenat();
    System.out.println("El Renat diu: "+ renat.aixecat());
    System.out.println("El Renat diu: "+ renat.seu());
    System.out.println("El Renat diu: "+ renat.estirat());
    System.out.println("El Renat diu: "+ renat.estirat());
}
}
