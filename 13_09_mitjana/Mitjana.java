/*
Recordes l'exercici de sumar notes? Doncs en aquesta ocasió en faràs un que, en comptes de dir-te la suma de notes, t'informarà de la nota mitjana corresponent a les notes introduïdes.
*/

public class Mitjana {
    public static void main (String [] args) {
        
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        float suma = 0;
        int quantitatNumeroPosats = 0;
       
       if (valor < 0 || valor > 100) {
          System.out.println("Cap nota vàlida introduïda");      
        } else {
              while (valor >= 0 && valor <= 100) {
            suma = suma + valor;
            quantitatNumeroPosats++;
            
          
            
            System.out.println("Introdueix un valor");
             valor = Integer.parseInt(Entrada.readLine());
             
        }
        
         float resultat = suma / quantitatNumeroPosats;
        
        System.out.println("La mitjana de les notes vàlides és " + resultat);
        
     }
       
    }
}
