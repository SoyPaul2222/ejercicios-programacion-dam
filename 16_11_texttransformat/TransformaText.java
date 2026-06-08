/*
Enunciat

Desenvolupa un programa anomenat TransformaText, que demani un text i mostri una versió transformada segons les següents regles:

Les vocals (les catalanes) apareixeran en minúscules

Les lletres no vocals apareixeran en majúscules

Els nombres (atenció, no els dígits!) apareixeran entre parèntesis ()

La resta de caràcters, excepte els blancs, desapareixen a la versió transformada.
*/

public class TransformaText {
    public static void main (String [] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String resposta = transformaText(text);
        
        System.out.println(resposta);
        
            
    }
    
    public static String transformaText (String text) {
        
        String resposta = "";
        String digits = "";
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
             if (Character.isDigit(c)) {
                digits += c;
             } else {
           
               if (!digits.isEmpty()) {
                  resposta += "(" + digits + ")";
                  digits = "";
               }
               
               char minuscula = Character.toLowerCase(c);
            
            if (UtilString.esVocal(minuscula)) {
                resposta += Character.toLowerCase(c);
            }  else if (Character.isLetter(c)) {
              resposta += Character.toUpperCase(c);
            } else if (Character.isWhitespace(c)) {
               resposta += c;     
            }
        }
        
       
    }
    
    if (!digits.isEmpty()) {
    resposta += "(" + digits + ")";
    }
    
     return resposta;
}

}
