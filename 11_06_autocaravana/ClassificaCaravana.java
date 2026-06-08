/*
 * Classifica caravanes segons el preu: Econòmica, General o Luxe
 * Entrada: preu caravana com a argument. Sortida: categoria assignada
 */

public class ClassificaCaravana {
    public static void main(String[] args) {
        int preuCaravana = Integer.parseInt(args[0]);
       
       if (preuCaravana < 50000) {
          System.out.println("Econòmica");
        } else if (preuCaravana <= 175000) {
            System.out.println("General");
        } else {
            System.out.println("Luxe");
        }
    }
}

