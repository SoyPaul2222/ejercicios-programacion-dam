/* 
Context

Carpeta de lliurament: 18_03_suma_digits/

Continguts relacionats: Recursivitat

Com lliurar-lo: instruccions

[✓] Exercici amb autoavaluació

Enunciat

Desenvolupa un programa que demani un text i mostri la suma dels dígits que conté.

Per fer aquest programa, completa la següent plantilla on no pots afegir cap iterador for/while

 */
public class SumaDigits {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        int nombres = sumaDigits(text);
        System.out.println(nombres);
    }

    // Xsuma els valors dels dígits i retorna el total
    public static int sumaDigits(String text) {
        // cas base
        if (text.isEmpty()) {
            return 0;
        }

        // tracta pas actual
        char c = text.charAt(0);
        int actual = (c >= '0' && c <= '9') ? (c - '0') : 0;

        // tracta pas recursiu
        int sumaResta = sumaDigits(text.substring(1));

        // composa resultat
        return actual + sumaResta;
    }
}
