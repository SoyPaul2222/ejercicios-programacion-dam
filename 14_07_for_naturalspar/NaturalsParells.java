/*
Crea una nova versió d'aquest exercici. Aquest cop, el programa es dirà NaturalsParells, i també mostrarà els números de manera creixent. Ara, però, no els mostrarà tots sinó només els parells.
*/

public class NaturalsParells {
    public static void main (String [] args) {
        int numero = Integer.parseInt(args[0]);
           
       if (numero <= 0) {
        System.out.println("Cap valor parell creixent entre 1 i " + numero);
       } else {
       
            for (int i = 2; i <= numero; i += 2) {
                System.out.println(i);
                
                }
                 
       } 
    }
}
