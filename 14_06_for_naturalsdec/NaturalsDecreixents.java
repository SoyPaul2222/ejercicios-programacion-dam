/*
Crea una nova versió de l'exercici anterior. Aquest cop, el programa es dirà NaturalsDecreixents i, en comptes de mostrar els nombres de manera creixent, o farà decreixentment.
*/

public class NaturalsDecreixents {
    public static void main (String [] args) {
        
         int numero = Integer.parseInt(args[0]);
           
       if (numero <= 0) {
        System.out.println("Cap valor decreixent entre " + numero + " i 1");
       } else {
                int valorFinal = 1;
            
            for (int valorInici = numero; valorInici >= valorFinal; valorInici--) {
                System.out.println(valorInici);
            }
           
          
       } 
    }
}


