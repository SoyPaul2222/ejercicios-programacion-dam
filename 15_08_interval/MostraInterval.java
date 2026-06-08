/*
Desenvolupa una nova versió de l'exercici que mostrava un interval d'un String.

La nova versió tindrà el mateix nom i la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul anomenat mostraInterval() que serà qui realitzi realment la feina de mostrar l'interval.
*/

public class MostraInterval {
    public static void main (String [] args) {
    
        System.out.println("text?");
        String text = Entrada.readLine();
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        
        mostraInterval(text, inici, fi);
        
    }
    
    public static void mostraInterval(String text, int inici, int fi) {
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
