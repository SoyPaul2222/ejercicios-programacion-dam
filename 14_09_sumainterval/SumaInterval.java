/*
En aquest exercici desenvoluparàs el programa SumaInterval que demanarà dos valors enters i sumarà tots els nombres que hi hagin entre els dos, incloent-los. El programa mostrarà els càlculs intermitjos.

Pots suposar que els valors d'entrada seran enters.
*/


public class SumaInterval {
    public static void main (String [] args) {
        System.out.println("primer?");
        int primerNumero = Integer.parseInt(Entrada.readLine());
        
        System.out.println("segon?");
        int segonNumero = Integer.parseInt(Entrada.readLine());
        
      if (primerNumero < segonNumero) {
            int resultat = 0;
        for (int i = primerNumero; i <= segonNumero; i++ ) {
          
             System.out.println(resultat + " + " + i + " = " + (resultat + i));
             resultat = resultat + i;
            
        } 
        
        } else {
            int resultat = 0;
          
          for (int i = segonNumero; i <= primerNumero; i++ ) {
          
             System.out.println(resultat + " + " + i + " = " + (resultat + i));
             resultat = resultat + i;
            
        }
        
        } 
    }
} 
