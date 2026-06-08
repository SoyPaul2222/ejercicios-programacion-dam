/*
Aquest repte consisteix en desenvolupar un programa anomenat TrobaMesProxim, que començarà demanant un valor (l'àncora) i després un seguit de nombres. Finalment el programa indicarà quin dels nombres introduïts és més pròxim a l'àncora.

Tant l'ancora com la resta de valors vàlids seran enters positius. En cas que s'especifiqui una àncora no positiva, es finalitzarà l'execució.

Per la resta de valors, després de l'àncora, el programa implementarà el patró del lloro, que s'aturarà amb el primer enter negatiu.

Finalment, mostrarà el valor enter positiu introduït, més proper a l'àncora.

En cas que hi hagi dos o més valors introduïts que estiguin a la mateixa distància, el programa es quedarà amb el més petit.

En cas que no s'hagi introduït cap valor positiu, s'indicarà.
*/

public class TrobaMesProxim {
    public static void main (String [] args) {
        
        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        
        if (ancora < 0) {
            System.out.println("Àncora no vàlida");
        } else {
            System.out.println("Introdueix un valor");
            int valor = Integer.parseInt(Entrada.readLine());
                if (valor < 0 ) {
                    System.out.println("No s'ha introduït cap valor positiu");
                } else {
                    int mesProxim = valor;
                    int distanciaMinima;
                       if (ancora < valor) {
                            distanciaMinima = valor - ancora;
                         } else {
                            distanciaMinima = ancora - valor;
                        }                    
                    
                          while (valor >= 0) {
                          
                          int distanciaActual;
                          
                          if (ancora < valor) {
                            distanciaActual = valor - ancora;
                          } else {
                            distanciaActual = ancora - valor;
                          } 
                          
                          if (distanciaActual < distanciaMinima || (distanciaActual == distanciaMinima && valor < mesProxim) ) {
                               distanciaMinima = distanciaActual;
                               mesProxim = valor;
                         }
                       
                          System.out.println("Introdueix un valor");
                          valor = Integer.parseInt(Entrada.readLine());
                        }
                        
                  System.out.println("El valor introduït més pròxim a " + ancora + " és " + mesProxim);      
                }
                
                
        }
        
    }
}
