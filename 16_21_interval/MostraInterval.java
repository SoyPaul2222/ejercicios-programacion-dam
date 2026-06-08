/*
L'operació de trobar els caràcters dins l'interval la realitzarà una funció anomenada intervalString() amb els paràmetres: la cadena de text corresponent, el valor inicial i el valor final. La funció retornarà la secció corresponent del text.

intervalString() estarà definida dins de UtilString.java i serà una funció pura.

La nova funció oferirà una utilitat similar però no igual, a la que ens ofereix String.substring(). Mira la documentació oficial per més detalls.
*/

public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        
        if (text.isEmpty()) {
            System.out.println("ERROR: cadena buida");
            return;
        }
        
        System.out.println("inici?");
        String iniciCadena = Entrada.readLine();
        int inici = 0;
        
        if (UtilString.esEnter(iniciCadena)) {
            inici = Integer.parseInt(iniciCadena);
        } else {
            System.out.println("ERROR: "+ "\"" +iniciCadena + "\""  +" no és un enter vàlid");
            return;
        }
        
        System.out.println("final?");
        
        String fiCadena = Entrada.readLine();
        int fi = 0;
        
        if (UtilString.esEnter(fiCadena)) {
             fi = Integer.parseInt(fiCadena);
        } else {
            System.out.println("ERROR: "+ "\"" +fiCadena + "\""  +" no és un enter vàlid");
            return;
        }
        
       
       
        String resultat = UtilString.intervalString(text, inici, fi);
        
        System.out.println(resultat);
    }
}
