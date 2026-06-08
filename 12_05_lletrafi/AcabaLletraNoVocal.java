/*
Desenvolupa un programa que llegeixi de l'entrada estàndard un text i indiqui si finalitza o no per lletra no vocal.

Com a l'exercici anterior considerarem com a vocals només els valors a, e, i, o i u, tan majúscules com minúscules.

Anomena el programa AcabaLletraNoVocal.
*/

public class AcabaLletraNoVocal {
    public static void main (String [] args) {
        System.out.println("Text?");        
           String text = Entrada.readLine();
       
       if (text.isBlank()) {
        System.out.println("El text no té lletres");
       }  else {
             char ultimCaracter = text.charAt(text.length()-1);
             char ultimCaracterMinuscula = Character.toLowerCase(ultimCaracter);
             if (ultimCaracterMinuscula == 'a' || ultimCaracterMinuscula == 'e' || ultimCaracterMinuscula == 'i' || ultimCaracterMinuscula == 'o' || ultimCaracterMinuscula == 'u') {
                    System.out.println("\"" + text + "\" " + "no finalitza amb lletra no vocal");
            } else if (!Character.isLetter(ultimCaracterMinuscula)) {
                    System.out.println("\"" + text + "\" " + "no finalitza amb lletra no vocal");
            } else {
                 System.out.println("\"" + text + "\" " + "finalitza amb la lletra no vocal " + "'" + ultimCaracter + "'" );
           }
        
        }
    }
}
