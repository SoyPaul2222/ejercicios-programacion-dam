/*
Desenvolupa un programa anomenat Estadistiques, que vagi demanant enters positius i que, en el moment que rebi un de negatiu. Un cop finalitzada la càrrega de dades, el programa mostrarà els següents estadístics respecte el que ha rebut:

El valor màxim introduït

Calcula aquest valor com a l'exercici Exercici 13_08. Troba el màxim

El valor mínim introduït

Serà força similar al càlcul de l'estadístic anterior.

La mitjana dels valors introduïts

Calcula aquest valor com a l'exercici Exercici 13_09. La nota mitjana
*/

public class Estadistiques {
    public static void main (String [] args) {
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        double suma = 0;
        int quantitatNumeroPosats = 0;
        
            if (valor < 0) {
           System.out.println("Cap valor vàlid introduït");      
           } else {
            int valorMaxim = valor;
            int valorMinim = valor;
            
            while (valor >= 0) {
                suma = suma + valor;
                quantitatNumeroPosats++;
                if (valor >= valorMaxim) { 
                    valorMaxim = valor;
                } 
                
                if (valor <= valorMinim) {
                    valorMinim = valor;
                }
                
             System.out.println("Introdueix un valor");
             valor = Integer.parseInt(Entrada.readLine());
            }
            
            double resultat = suma / quantitatNumeroPosats;
            
            System.out.println("El mínim és: " + valorMinim);
            System.out.println("La mitjana és: " + resultat);    
            System.out.println("El màxim és: " + valorMaxim);        
            
        }
    }
}
