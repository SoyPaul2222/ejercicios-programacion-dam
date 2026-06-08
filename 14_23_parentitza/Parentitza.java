/*
Desenvolupa un programa anomenat Parentitza que demani un text i mostri cada lletra entre parèntesis. La resta de caràcters es mantindran sense canvis.
*/

public class Parentitza {
    public static void main (String [] args) {
        System.out.println("Text?");
        String frase = Entrada.readLine();
        
        for (int posicio = 0; posicio <= frase.length() - 1;  posicio += 1) {
            
            char caracter = frase.charAt(posicio);
            
            if (Character.isLetter(caracter)) {
            System.out.print( "(" + frase.charAt(posicio) + ")");
            } else {
                System.out.print(caracter);
            }
        }
        
        System.out.println();
    }
}
