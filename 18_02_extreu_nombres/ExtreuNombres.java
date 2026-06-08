/* 
Context

Carpeta de lliurament: 18_02_extreu_nombres/

Continguts relacionats: Recursivitat

Com lliurar-lo: instruccions

[✓] Exercici amb autoavaluació

Enunciat

Desenvolupa un programa que demani un text i mostri només els valors numèrics que conté.

Per fer aquest programa, completa la següent plantilla on no pots afegir cap iterador for/while
*/
public class ExtreuNombres {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nombres = extreuNombres(text);
        System.out.println(nombres);
    }

    // extreu els nombres i els retorna concatenats
    public static String extreuNombres(String text) {
        // cas base
        if (text.isEmpty()) {
          return "";
        }
        // tracta pas actual
      char c = text.charAt(0);
       String actual = (c >= '0' && c <= '9') ? "" + c : "";
        // tracta pas recursiu
        String resta = extreuNombres(text.substring(1));

        // composa resultat
        return actual + resta;
    }
}
