/*
Desenvolupa el programa NaturalsEntre que demani tres nombres enters no negatius, i escrigui els valors entre el primer i el segon saltant d'un al següent amb el tercer.

Podem suposar que el programa sempre rebrà números enters per l'entrada estàndard.

El programa comprovarà que els tres valors siguin no negatius, que el primer sigui menor o igual que el segon, i que el tercer sigui més gran que zero. Ah! Farà les comprovacions de manera que si per exemple el primer valor ja era negatiu, no preguntarà més.

Per qualsevol error, indicarà "Valor no vàlid" i finalitzarà.
*/

public class NaturalsEntre {
    public static void main (String [] args) {
         
        System.out.println("Valor inicial?");
        int valorInicial = Integer.parseInt(Entrada.readLine());
            
            if (valorInicial < 0) {
                System.out.println("Valor no vàlid");
            } else {
              System.out.println("Valor final?");
              int valorFinal = Integer.parseInt(Entrada.readLine());
                  if (valorFinal <= 0 || (valorInicial > valorFinal)) {
                    System.out.println("Valor no vàlid");
                  }  else {
                     System.out.println("Salt?");
                     int salt = Integer.parseInt(Entrada.readLine());
                        if (salt <= 0) {
                            System.out.println("Valor no vàlid");
                        } else {
                            while (valorInicial <= valorFinal) {
                                System.out.println(valorInicial);
                                valorInicial = valorInicial + salt;
                            }
                        }
                  }
            }
    }
}
