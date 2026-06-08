/*
Enunciat

Desenvolupa un programa que llegeixi de l'entrada estàndard un text i indiqui si comença o no per vocal, sigui majúscules o minúscules.

Considerarem com a vocals només els valors a, e, i, o i u.

Anomena el programa IniciaVocal.
*/

public class IniciaVocal {
    public static void main(String [] args) {
        System.out.println("Text?");
        
        String text = Entrada.readLine();
       
       if (text.isEmpty() || text.isBlank()) {
        System.out.println("El text no té lletres");
       }  else {
             char primerCaracter = text.charAt(0);
             char primerCaracterMinuscula = Character.toLowerCase(primerCaracter);
                if (primerCaracterMinuscula == 'a' || primerCaracterMinuscula == 'e' || primerCaracterMinuscula == 'i' || primerCaracterMinuscula == 'o' || primerCaracterMinuscula == 'u') {
                System.out.println("\"" + text + "\" " + "inicia amb la vocal " + "'" + primerCaracter + "'" );
                } else {
            System.out.println("\"" + text + "\" " + "no inicia amb vocal");
            }
        
        }
    }
}
