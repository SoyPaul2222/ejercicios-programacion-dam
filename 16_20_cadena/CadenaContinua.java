/*
Nova versió de l'exercici de la cadena continua. En aquesta ocasió aplicarem els nous coneixements de funcions.

El programa CadenaContinua farà el pràcticament el mateix que la versió original però els càlculs els realitzarà una funció dins la llibreria UtilString amb la signatura: String cadenaContinua(String, int)

Addicionalment, la nova versió serà capaç de controlar el cas en que no introdueixin un número enter per la longitud de la cadena resultant.
*/

public class CadenaContinua {
    public static void main (String [] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (comprovaText(text)) {
            System.out.println("error");
            return;
        }
        
        System.out.println("Nombre?");
        String nombreCadena = Entrada.readLine(); 
        
        String cadena = "";
        
        if (UtilString.esEnter(nombreCadena)) {
            int nombre = Integer.parseInt(nombreCadena);
            cadena = UtilString.cadenaContinua(text, nombre);
        } else {
            System.out.println("error");
            return;
        }
        
        System.out.println(cadena);
    }
    
    public static boolean comprovaText(String text) {
        boolean hiHaEspais = false;
        
       
        if (text.isEmpty()) {
         return true;
         }

        for (int i = 0 ; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isWhitespace(c)) {
                hiHaEspais = true;
            }
        }
        return hiHaEspais;
    }
}
