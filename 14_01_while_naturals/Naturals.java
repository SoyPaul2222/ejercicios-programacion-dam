/*
Desenvolupa un programa anomenat Naturals que rebi per línia de comandes un número i mostri tots els valors enters positius entre el 1 iaquest número.

En cas que li passem un número per sota de 1, el programa mostrarà el missatge: "Cap valor creixent entre 1 i «número introduït»"
*/

public class Naturals {
    public static void main (String [] args) {
        int numero = Integer.parseInt(args[0]);
     
        
       if (numero <= 0) {
        System.out.println("Cap valor creixent entre 1 i " + numero);
       } else {
            int i = 1;
            while (i <= numero) {
                System.out.println(i);
                   i = i + 1;    
            }
       } 
       
    }
}
