/*
En aquesta ocasió desenvoluparem un programa que permeti construir taules de multiplicar personalitzades.

El programa demanarà un total de quatre valors numèrics:

valor inicial primers operands

valor final primers operands

valor inicial segons operands

valors finals segons operands

En cas que un valor inicial sigui més gran que un valor final, simplement començarà pel més petit i acabarà pel més gran.
*/

public class TaulaMultiplicar {
    public static void main(String[] args) {
        int primerArgument = Integer.parseInt(args[0]);
        int segonArgument = Integer.parseInt(args[1]);
        int tercerArgument = Integer.parseInt(args[2]);
        int quartArgument = Integer.parseInt(args[3]);
        
        if (primerArgument > segonArgument) {
            for (int i = segonArgument; i <= primerArgument ; i++ ) {
                if (tercerArgument <= quartArgument) {
                    for (int n = tercerArgument; n <= quartArgument; n++) {
                        System.out.println(i + " x " + n + " = " + (i * n));
                    }
                } else {
                    for (int n = quartArgument; n <= tercerArgument; n++) {
                        System.out.println(i + " x " + n + " = " + (i * n));
                    }
                }
           
            
            }          
          
     
        } else {
            for (int i = primerArgument; i <= segonArgument; i++ ) {
                if (tercerArgument <= quartArgument) {
                    for (int n = tercerArgument; n <= quartArgument; n++) {
                        System.out.println(i + " x " + n + " = " + (i * n));
                    }
                } else {
                    for (int n = quartArgument; n <= tercerArgument; n++) {
                        System.out.println(i + " x " + n + " = " + (i * n));
                    }
                }
            
        }
        
      }
    
    }
}
