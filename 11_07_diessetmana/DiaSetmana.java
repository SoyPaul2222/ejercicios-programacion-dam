/*  Retorna el nom del dia de la setmana segons un número (1-7)
 * Entrada: número del dia. Sortida: nom del dia o "Error" si és invàlid
* /

public class DiaSetmana {
    public static void main(String[] args) {
        int numeroDia = Integer.parseInt(args[0]);
       
       if (numeroDia == 1) {
          System.out.println("Dilluns");
        } else if (numeroDia == 2) {
          System.out.println("Dimarts");
        } else if (numeroDia == 3) {
        System.out.println("Dimecres");
        } else if (numeroDia == 4) {
        System.out.println("Dijous");
        } else if (numeroDia == 5) {
        System.out.println("Divendres");
        } else if (numeroDia == 6) {
        System.out.println("Dissabte");
        } else if (numeroDia == 7) {
        System.out.println("Diumenge");
        } else {
        System.out.println("Error"); }
    
}
}
