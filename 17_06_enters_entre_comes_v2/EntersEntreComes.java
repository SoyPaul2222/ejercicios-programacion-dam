/*
Una nova versió del programa enters entre comes>

En aquesta ocasió, el programa tindrà les següents modificacions:

Els valors de l'array en comptes de ser assignats des del programa, els especificaran els usuaris del programa.

De moment suposarem que els valors d'entrada són sempre enters vàlids.

En comptes de 3 valors a l'array, n'hi haurà 5
*/

public class EntersEntreComes {
    public static void main (String [] args) {
         int [] valors;
         valors = new int [5];
         
         System.out.println("Valor 1?");
         valors[0] = Integer.parseInt(Entrada.readLine());
         
         System.out.println("Valor 2?");
         valors[1] = Integer.parseInt(Entrada.readLine());
         
         System.out.println("Valor 3?");
         valors[2] = Integer.parseInt(Entrada.readLine());
         
         System.out.println("Valor 4?");
         valors[3] = Integer.parseInt(Entrada.readLine());
         
         System.out.println("Valor 5?");
         valors[4] = Integer.parseInt(Entrada.readLine());
         
         System.out.print(valors[0]);
        for (int i = 1; i < valors.length; i++) {
            System.out.print(", " + valors[i]);
        }
        
        System.out.println();
        
    }
}
