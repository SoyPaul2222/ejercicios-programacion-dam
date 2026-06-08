/*
En aquest exercici implementarem el joc del tres en ratlla de manera que es pugui jugar.

El joc començarà amb el tauler en blanc i anirà demanant moviments alternativament a cada jugador.

Els jugadors són ㄨ i 〇. Sempre començarà el jugador ㄨ.
*/


public class TresEnRatlla {

    // mòduls de suport
    public static void mostraTaulell(char[][] taula) {
        for (int fila = 0; fila < taula.length; fila++) {
            for (int columna = 0; columna < taula[fila].length; columna++) {
                System.out.print(taula[fila][columna]);
            }
            System.out.println();
        }
    }
    
    public static boolean casellaOcupada(char[][] taula, int fila, int columna) {
        if (fila >=0 && fila < 3 && columna >= 0 && columna < 3) {
              if (taula[fila][columna] != '·') {
                return true;
              }  
        }
        
        return false;
    }
    
    public static boolean jugadorGuanya(char[][] taula, char jugador) {
      
            for (int i = 0; i < 3; i++) {
                if (taula[i][0] == jugador &&
                    taula[i][1] == jugador &&
                    taula[i][2] == jugador) {
              return true;
               } 
            }
            
             for (int i = 0; i < 3; i++) {
                if (taula[0][i] == jugador &&
                    taula[1][i] == jugador &&
                    taula[2][i] == jugador) {
                  return true;
               }
             }

    
           if (taula[0][0] == jugador &&
               taula[1][1] == jugador &&
               taula[2][2] == jugador) {
                return true;
          }

   
            if (taula[0][2] == jugador &&
                taula[1][1] == jugador &&
                taula[2][0] == jugador) {
                return true;
            }
        return false;
           }
    
    public static boolean hiHaEmpat(char[][] taula) {
       for (int fila = 0; fila < taula.length; fila++) {
            for (int columna = 0; columna < taula[fila].length; columna++) {
                if (taula[fila][columna] == '·' ) {
                    return false;
                } 
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        // declara i inicialitza el tauler
        char [][] tauler = new char[3][3];
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tauler[i][j] = '·';
                 }
            }
        
        System.out.println("Comença el joc");
        

        // indica quin és el jugador que té el torn
        char jugadorActual = 'X';

        while (true) {
            mostraTaulell(tauler);

            // obté el moviment del jugador actual
            System.out.println(jugadorActual + "?");
            String posicio = Entrada.readLine();

            // comprova abandonament
            if (posicio.equals("a") || posicio.equals("A")) {
                System.out.println(jugadorActual + " abandona");
                return; 
            }

            // obté coordenades del moviment
            
            if (posicio.length() != 2) {
                System.out.println("Coordenades no vàlides");
                continue;
            } 
            
                int fila = posicio.charAt(0) - '0';
                int columna = posicio.charAt(1) - '0';
         

            
            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Coordenades no vàlides");
                continue;
            }


            // comprova si la casella està ocupada
            if (casellaOcupada(tauler, fila, columna)) {
                System.out.println("Casella ocupada");
                continue;
            
            } else {
                tauler[fila][columna] = jugadorActual;
            }
                
            
            // realitza el moviment
            /* XXX */

            // comprova jugador guanya
            if (jugadorGuanya(tauler, jugadorActual)) {
                mostraTaulell(tauler);
                System.out.println(jugadorActual + " guanya");
                return;
            }

            // comprova empat
            if (hiHaEmpat(tauler)) {
                System.out.println("Empat");
                return;
            }

            // passa torn a l'altre jugador
            if (jugadorActual == 'X') {
                jugadorActual = 'O';
            } else {
                jugadorActual = 'X';
            }
        }
    }
}
