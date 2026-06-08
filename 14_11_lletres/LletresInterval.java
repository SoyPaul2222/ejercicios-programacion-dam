/*
Desenvolupa el programa LletresInterval que mostrarà un intèrval de lletres.

El programa demanarà la lletra inicial i quantes lletres ha de mostrar.

El programa generarà un error en els següents casos:

El valor rebut com a lletra no tingui exàctament un caràcter.

El valor rebut com a lletra no correspon a una lletra entre la 'a' i la 'z' (majúscules o minúscules)

El nombre de lletres demanat és inferior a 1. Pots suposar, però, que sempre serà un valor enter.

Els missatges d'error concrets te'ls especificarà prgtest.

Fes servir el bucle for i no while per resoldre aquest problema.
*/

public class LletresInterval {
    public static void main (String [] args) {
        System.out.println("lletra?");
        
        String lletraEncadenat = Entrada.readLine();
        
        if (lletraEncadenat.isEmpty() || lletraEncadenat.length() != 1) {
            System.out.println("ERROR: cal especificar una única lletra.");
        } else {
        
            char lletra = lletraEncadenat.charAt(0);
            
            if(!Character.isLetter(lletra) || !((lletra >= 'a' && lletra <= 'z') || (lletra >= 'A' && lletra <= 'Z'))) {
                System.out.println("ERROR: " + "'" + lletra + "'" + " no és una lletra vàlida.");
            } else {
                System.out.println("quantes?");
                int quantitat = Integer.parseInt(Entrada.readLine());
                    if (quantitat < 1) {
                        System.out.println("ERROR: una com a mínim");
                    } else {
                         for (int i = 0; i < quantitat ; i++ ) {
                            System.out.print(lletra);
                            lletra++;
                            
                            if (lletra > 'z') {
                                lletra = 'a';
                            }
                         }
                    }
            }
          }  
    }
}
