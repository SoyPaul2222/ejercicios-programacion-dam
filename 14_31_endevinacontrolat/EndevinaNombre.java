/*
Recordes Exercici 13_12. Endevina el nombre ?

En aquesta ocasió farem una nova versió que faci ús dels nous mecanismes de control de bucles.

El programa realitzarà la mateixa funcionalitat que l'exercici original, més:

Permetrà cancel·lar la partida en introduir una entrada buida (tal i com demanava Exercici 13_13. Endevina amb cancel·lació

Comprovarà que l'entrada siguin realment valors enters.

Serà una comprovació més senzilla que la que demanava l'exercici Exercici 14_28. Enters estrictes en el sentit que no cal ignorar espais, ni considerar separadors. Només cal tenir en compte dígits i, opcionalment, que comencin amb un + o un -. Ah! i només cal comprovar els valors de l'entrada estàndard. El de línia de comandes es pot suposar sempre enter.
*/

public class EndevinaNombre {
    public static void main (String [] args) {
            
            int nombre = Integer.parseInt(args[0]);
           
            System.out.println("Nombre?");
            String linia = Entrada.readLine();
            
            if (linia.isEmpty()) {
              System.out.println("Cancel·lat!");
              return;
            }
                
            
            while (true) {
            
            if (linia.isEmpty()) {
              System.out.println("Cancel·lat!");
              return;
            }
                
            
               boolean esEnter = true;
               
               int inici = 0;
                if (linia.charAt(0) == '+' || linia.charAt(0) == '-') {
                    inici = 1;
                     if (linia.length() == 1) {
                     esEnter = false; 
                     }
               }
               
                for (int i = inici; i < linia.length(); i++) {
                    if (!Character.isDigit(linia.charAt(i))) {
                    esEnter = false;
                    }
                }
                
                if (esEnter) {
                   int valor = Integer.parseInt(linia);
                   
               //    if (valor == nombre) {
                 //      valor = -valor;
                   //     }

                     if (valor < 1 || valor > 99) {
                        System.out.println("Fora de rang");
                     } else  {                           
                           if (valor < nombre) {
                            System.out.println("Massa petit");
                           } else if (valor > nombre) {
                              System.out.println("Massa gran");  
                           } else {
                             System.out.println("Encertat!");
                             return;
                           }
                     }
                        
                     }  else {
                      System.out.println("Només nombres");
                      }  
                     
                 
                 System.out.println("Nombre?");
                 linia = Entrada.readLine();
                } 
               
               
            }
             
    }

