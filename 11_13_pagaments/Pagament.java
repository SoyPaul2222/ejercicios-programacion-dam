/*
// Programa que calcula si sobra o falta diners en una transacció
// Compara el preu del producte amb la quantitat pagada i mostra la diferència
*/

public class Pagament {
    public static void main(String[] args) {
         System.out.println("Preu?");
         int preu = Integer.parseInt(Entrada.readLine());
         
         
         System.out.println("Paga?");
         int paga = Integer.parseInt(Entrada.readLine());
         
         if (preu < paga) {         
            System.out.println("Sobren " + (paga - preu) + "€");
         } else if  (preu > paga) {
            System.out.println("Falten " + (preu - paga) + "€");
         } else {
            System.out.println("No sobra ni falta res");
         }
    }    
  
  }
