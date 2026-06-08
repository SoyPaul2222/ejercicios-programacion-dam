/*
Desenvolupa un programa que vagi demanant les notes obtingudes pels estudiants de programació en el darrer examen (com a mínim dues) i indiqui quina ha estat la nota més alta.

Les notes estaran representades en base 10 i, per tant, els valors vàlids són els números enters del 1 fins el 10.

El programa deixarà de recollir notes quan rebi un valor negatiu.

Finalment, el programa mostrarà quina ha estat la nota més alta.
*/

public class NotaMesAlta {
    public static void main (String [] args) {
        
         int comptador = 0;
         int notaAlta = 0;
        System.out.println("Introdueix les notes (-1 per finalitzar)");
        while (true) {
            
            
            int nota = Integer.parseInt(Entrada.readLine());

            
           if ( nota == -1) { 
             if (comptador < 2) {
                System.out.println("Com a mínim calen dues notes");
             } else {
              System.out.println("La nota més alta és " + notaAlta);
             }
            
            return;
          } 
          
          if (nota >= 1 && nota <= 10) {
            if (nota > notaAlta) {
                notaAlta = nota;
            }
            
           }
          
        
        comptador++;
        
        }
    }
}
