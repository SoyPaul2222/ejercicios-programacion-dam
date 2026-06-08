/*
Desenvolupa un programa anomenat TriangleInvertit, que demani un nombre positiu més gran que 0. El programa escriurà una línia per nombre entre el nombre introduït i el 1 (és a dir, decreixentment). A cada línia escriurà tots els nombres des de l’1 fins el nombre corresponent a la línia.

En cas que l'entrada sigui un valor no vàlid, el programa mostrarà el missatge Valor inadequat.
*/

public class TriangleInvertit {
    public static void main (String [] args) {
        System.out.println("Nombre?");
        int nombre = Integer.parseInt(Entrada.readLine());
       
       if (nombre > 0 && nombre < 10) { 
        for (int i = nombre; i >= 1; i--) {
            for (int col = 1; col <= i; col++) {
            
                if (col == i) {
                    System.out.print(col);
                } else {
                    System.out.print(col + ", ");
                }
            }
            System.out.println();
        }
      } else {
        System.out.println("Valor inadequat");
      }
    }
}
