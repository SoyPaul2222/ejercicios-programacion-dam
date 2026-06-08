/* Tornem a considerar l'exercici del tres en ratlla

En aquesta ocasió representarem tot el tauler, no amb variables separades fila0, fila1 i fila2, sinó amb una taula de caràcters.

En programació hi ha un concepte anomenat representació o modelització de les dades que consisteix en seleccionar els elements de la realitat que ens interessen pel nostre programa i convertir-los en quelcom que pugui ser programable.

Fins ara, la representació de les dades ha resultat més o menys fàcil ja que sovint ha consistit en manipular nombres i texts, que ja tenen un tipus associat (enter, string, etc.)
*/
public class TresEnRatlla {
    public static void main(String[] args){
        // declaració del tauler
        char[][] tauler = new char[3][3];

        // inicialització de la fila 0
        tauler[0][0] = '·';
        tauler[0][1] = 'O';
        tauler[0][2] = 'O';
        // inicialització de la resta de files
        tauler[1][0] = '·';
        tauler[1][1] = 'X';
        tauler[1][2] = '·';
        
        tauler[2][0] = '·';
        tauler[2][1] = '·';
        tauler[2][2] = 'X';
     

        // mostra la posició inicial del tauler
        System.out.println("La posició inicial del taulell:");
        mostraFila(tauler[0]);     // mostra la línia 0
        mostraFila(tauler[1]);     // mostra la línia 1
        mostraFila(tauler[2]);     // mostra la línia 2

        // demana coordenades del moviment del jugador X
        System.out.println("Fila del següent moviment?");
        int fila = Integer.parseInt(Entrada.readLine());
        
   
        System.out.println("Columna del següent moviment?");
        int columna = Integer.parseInt(Entrada.readLine());

        // marquem el nou moviment
        /*
           TODO: cal comprovar que les coordenades siguin vàlides i
           que la casella estigui buida.

           Si tot és correcte, caldrà completar:

          
        */
        
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {

            if (tauler[fila][columna] == '·') {
                tauler[fila][columna] = 'X';
                } else {
                  System.out.println("Posició ocupada");
                }
        } else {
          System.out.println("Coordenades incorrectes");
        }
       

        // tornem a mostrar el tauler
        System.out.println("La posició final del taulell:");
        mostraFila(tauler[0]);
        mostraFila(tauler[1]);
        mostraFila(tauler[2]);
    }

    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        for (int col = 0 ; col < fila.length; col++) {
            System.out.print(fila[col]);
        }
        System.out.println();
    }
}
