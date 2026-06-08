/*
Desenvolupa una nova versió del programa TextReves d'un exercici anterior. En aquesta ocasió, la sortida saltarà els espais de l'entrada per fer més elegant el resultat.
Desenvolupa una nova versió del programa TextReves d'un exercici anterior. En aquesta ocasió, la sortida saltarà els espais de l'entrada per fer més elegant el resultat.

Desenvolupa una nova versió del programa TextReves d'un exercici anterior. En aquesta ocasió, la sortida saltarà els espais de l'entrada per fer més elegant el resultat.


*/

public class TextReves {
    public static void main (String [] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String resposta = "";
        String cometejat = "";
        
        resposta = UtilString.inverteix(text);
        
        
        cometejat = UtilString.cometeja(resposta);
        
        System.out.println(cometejat);
        
        
    }
}
