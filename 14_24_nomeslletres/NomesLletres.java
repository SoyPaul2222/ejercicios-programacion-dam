/*
Desenvolupa un programa anomenat Parentitza que demani un text i mostri cada lletra entre parèntesis. La resta de caràcters es mantindran sense canvis.
*/

public class NomesLletres {
    public static void main (String [] args) {
        System.out.println("Text?");
        String frase = Entrada.readLine();
        
        boolean primeraLletra = true;
        
        for (int posicio = 0; posicio <= frase.length() - 1;  posicio += 1) {
            
            char caracter = frase.charAt(posicio);
            
            if (Character.isLetter(caracter)) {
                if (!primeraLletra) {
                    System.out.print(", ");
                }
                System.out.print(caracter);
                primeraLletra = false;
            }
        }
        
        System.out.println();
    }
}
