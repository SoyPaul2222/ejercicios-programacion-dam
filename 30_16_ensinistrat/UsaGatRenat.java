/*
Afegeix tres nous mètodes: String aixecat(), String seu(), i String estirat() de manera que quan vulguem, per exemple, que en Renat s'aixequi simplement li diguem renat.aixecat();.

En cas que el Renat ja estigués en l'estat que se li demana, no fa cap canvi d'estat.

Aquestes funcions retornaran un missatge indicant el que ha fet el Renat. Així, els missatges que ens retornarà seran: "ja m'estiro", "ja m'assec", "ja m'aixeco", i "passo de fer res".
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
