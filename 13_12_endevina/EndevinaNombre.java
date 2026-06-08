/*
En aquesta ocasió desenvoluparem un programa anomenat EndevinaNombre, que es pensarà un nombre enter entre el 1 i el 100, i reptarà els usuaris a que l'endevini.

Per facilitar les proves, el nombre pensat serà obtingut del primer element de la línia de comandes (args[0])

El programa demanarà que li diguin un nombre, el compararà amb el pensat i indicarà si ha encertat, s'ha passat o no ha arribat, o si està fora de rang.

El programa finalitzarà quan els usuaris encertin el nombre pensat.
*/

public class EndevinaNombre {
    public static void main (String [] args) {
        int nombrePensat = Integer.parseInt(args[0]);
        
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
            
            
           while (valor != nombrePensat) {
                if (valor > 100) {
                    System.out.println("Com a màxim 100");
                } else if (valor < 1) {
                    System.out.println("Com a mínim 1");
                    } else {
                      if (valor < nombrePensat) {
                        System.out.println("És més gran que " + valor);
                    } else {
                        System.out.println("És més petit que " + valor);
                    }
                }
                
               System.out.println("Introdueix un valor");
               valor = Integer.parseInt(Entrada.readLine()); 
           }
           
           System.out.println("Has encertat!");
    }
}
