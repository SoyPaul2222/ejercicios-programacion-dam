/*
* Aquest programma serveix per calcular l'àrea d'un rectangle en cm o ex.
*/
/*
* Aquest programma serveix per calcular l'àrea d'un rectangle en cm o ex.
*/
public class CalculaArea {
    public static void main(String[] args) {

        System.out.println("Càlcul de l'àrea d'un rectangle");
        System.out.println("Introduïu la base:");      
        String linia = Entrada.readLine();
        int base = Integer.parseInt(linia);


        System.out.println("Introduïu l'altura:");
        linia = Entrada.readLine();
        int altura = Integer.parseInt(linia);


        System.out.println("Introduïu les unitats (ex. cm):");
        String unitats = Entrada.readLine();

        int area =  base * altura;
        System.out.println("L'àrea d'un rectangle de base " + base + unitats + " i altura " + altura + unitats + " és " + area + unitats + "^2");

    }
}
