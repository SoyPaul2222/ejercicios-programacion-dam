/*
Recuperem l'exercici que mostrava si una cadena contenia o no un valor enter i fem-ne la versió modular.

El programa EsEnter farà pràcticament el mateix que l'antic Enters, amb les següents diferències:

La comprovació de si una cadena correspon o no a un enter, la realitzarà una funció anomenada UtilString.esEnter(), que rebrà el text corresponent i retornarà un booleà amb el resultat corresponent.

El programa EsEnter indicarà que són enters vàlids aquelles cadenes que la funció esEnter() també indicaria que ho són, i també, aquelles altres cadenes que esEnter() hagués considerat com a vàlides si ignorés espais en blanc a inici i final de la cadena.
*/

public class EsEnter {
    public static void main (String [] args) {
    
    System.out.println("Introdueix els texts a analitzar:");
    
        while (true) {
        
        
        String text = Entrada.readLine();
        String textDefinitiu = UtilString.normalitzaBlancs(text);
        
        if (textDefinitiu.isEmpty()) {
            System.out.println("Adéu");
            return;
        }
        
        if (UtilString.esEnter(textDefinitiu)) {
            System.out.println("\"" + text + "\"" + " és enter");
        } else {
            System.out.println("\"" + text + "\"" + " no és enter");
        }
        
       }
    }
}
