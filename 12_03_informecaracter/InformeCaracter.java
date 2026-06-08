/*
Desenvolupa un programa anomenat InformeCaracter que demani un text i un número per entrada estàndard. A partir del caracter de la posició indicada pel segon valor, el programa composarà un petit informe amb el resultat de les funcions anteriors.
*/

public class InformeCaracter {
    public static void main (String [] args) {
        
           System.out.println("Text?");
           String text = Entrada.readLine();
           
           if (text.isEmpty()) {
              System.out.println("Error"); 
           } else {
                  System.out.println("Posició?");
                  int numero = Integer.parseInt(Entrada.readLine());    
                  
                  
             if (numero >= 0 && text.length() >= numero) {
                System.out.println("Character.getName('" + text.charAt(numero) + "'): " + Character.getName(text.charAt(numero)));
                System.out.println("Character.isDigit('" + text.charAt(numero) + "'): " + Character.isDigit(text.charAt(numero)));
                System.out.println("Character.isJavaIdentifierStart('" + text.charAt(numero) + "'): " + Character.isJavaIdentifierStart(text.charAt(numero)));
                System.out.println("Character.isJavaIdentifierPart('" + text.charAt(numero) + "'): " + Character.isJavaIdentifierPart(text.charAt(numero)));
                System.out.println("Character.isLetter('" + text.charAt(numero) + "'): " + Character.isLetter(text.charAt(numero)));
                System.out.println("Character.isLowerCase('" + text.charAt(numero) + "'): " + Character.isLowerCase(text.charAt(numero)));
                System.out.println("Character.isUpperCase('" + text.charAt(numero) + "'): " + Character.isUpperCase(text.charAt(numero)));
                System.out.println("Character.isWhitespace('" + text.charAt(numero) + "'): " + Character.isWhitespace(text.charAt(numero)));
                System.out.println("Character.toLowerCase('" + text.charAt(numero) + "'): " + Character.toLowerCase(text.charAt(numero)));
                System.out.println("Character.toUpperCase('" + text.charAt(numero) + "'): " + Character.toUpperCase(text.charAt(numero)));
           
            } else {
                System.out.println("Fora de rang");
            }
           

    }
}
}
