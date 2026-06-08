/*
Una nova versió del programa enters entre comes.

En aquesta ocasió, el programa tindrà les següents modificacions:

Inicialment demanarà als usuaris quants valors vol introduir.

A continuació, llegirà els valors indicats.

Finalment, mostrarà els valors llegits separats per comes.

Podem seguir suposant que els valors d'entrada seran enters. A més, podem suposar que ens donaran tants enters com ens indiquin.

Fes servir els missatges del prgtest per acabar de concretar els detalls.
*/

public class EntersEntreComes {
    public static void main (String [] args) {
      
          System.out.println("Quants?");
          int valor = Integer.parseInt(Entrada.readLine());
          
          if (valor <= 0) {
            System.out.println("Res a fer");
            return;
          }
         
          int numeros [] = new int[valor];
          
        for (int i = 0; i < valor; i++) {
            System.out.println("Valor " + (i +1) + "?");
            numeros[i] = Integer.parseInt(Entrada.readLine());
        }  
          
        System.out.print(numeros[0]);
        for (int i = 1; i < numeros.length; i++) {
            System.out.print(", " + numeros[i]);
        }
        System.out.println();
          
    }
}

