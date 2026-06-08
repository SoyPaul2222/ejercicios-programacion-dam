/*
Escriu un programa anomenat QuadratNombres, que demani un enter entre 1 i 9, i "dibuixi" un quadrat amb els nombres del 1 fins el valor de l'entrada.

En cas que l'entrada sigui un valor no vàlid, el programa mostrarà el missatge Valor inadequat.

Tot i que només se't demana que facis aquest quadrat, i tenint en compte que el codi del programa pràcticament el tens als apunts, et proposo que experimentis una mica amb les possibilitats dels dos bucles.

*/

public class QuadratNombres {
    public static void main (String [] args) {
    
        System.out.println("Valor final?");
        int valorFinal = Integer.parseInt(Entrada.readLine());
        
        if (valorFinal >= 1 && valorFinal < 10) {
        
        for (int linia=1; linia <= valorFinal; linia++) {
           for (int columna=1; columna <= valorFinal; columna++) {
               System.out.print(" " + columna);
                 }
               System.out.println();
                }
        } else {
            System.out.println("Valor inadequat");
        }        
    }
}
