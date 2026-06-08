/*
Enunciat

Considerem novament Exercici 14_10. Enters dins d'un interval

En aquella ocasió el programa demanava els valors límit entre dos enters. Amb unes petites modificacions podríem crear un nou programa que ens permetés veure una secció d'un String

Doncs això és el que ens demana aquest exercici. En concret, l'enunciat és el següent: desenvolupa un programa anomenat MostraInterval que demani un text i dos valors enters, i que mostri tots els caràcters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.

En cas que els valors enters quedin fora de les posicions del text introduït, el programa els normalitzarà al límit corresponent, i mostrarà tot el que pugui sense mostrar error.
*/

public class MostraInterval {
    public static void main (String [] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        
        int longitudText = text.length();
        int ultimIndex = longitudText - 1;
        
        if (inici < 0) {
            inici = 0;
        } else if (inici >= longitudText) {
            inici = ultimIndex;
        }
        
        if (fi < 0) {
            fi = 0;
        } else if (fi >= longitudText) {
            fi = ultimIndex;
        }
        
        if (inici < fi) {
              for (int i = inici; i <= fi; i++) {
                    char caracterInici = text.charAt(i);
                    System.out.println(caracterInici);
                }
        } else if (inici > fi) {
            for (int i = inici; i >= fi ; i--) {
                char caracterFi = text.charAt(i);
                System.out.println(caracterFi);
            }    
        } else {
            if (longitudText > 0) {
                System.out.println(text.charAt(inici));
            }
        }
        
    }
}
