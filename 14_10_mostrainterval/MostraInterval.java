/*
En aquest exercici desenvoluparàs el programa SumaInterval que demanarà dos valors enters i sumarà tots els nombres que hi hagin entre els dos, incloent-los. El programa mostrarà els càlculs intermitjos.

Pots suposar que els valors d'entrada seran enters.
*/


public class MostraInterval {
    public static void main (String [] args) {
        System.out.println("inici?");
        int primerNumero = Integer.parseInt(Entrada.readLine());
        
        System.out.println("final?");
        int segonNumero = Integer.parseInt(Entrada.readLine());
        
      if (primerNumero < segonNumero) {
        for (int i = primerNumero; i <= segonNumero; i++ ) {
           System.out.println(i);
        } 
        
        } else {
           for (int i = primerNumero; i >= segonNumero; i-- ) {
             System.out.println(i);
            
        }
        
        } 
    }
} 
