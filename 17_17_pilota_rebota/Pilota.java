/*
Com pots veure, cada cop que toca una cantonada, rebota.

Per poder realitzar aquesta actualització, ens trobem en la necessitat de guardar no només la posició (fila i columna) sinó també l'increment (de fila i columna)

Inicialment l'increment és de 1 fila i 1 columna.

Així, quan estem en la primera posició (0, 0), la següent posició passa a ser (0 + 1, 0 + 1).

En el moment en que la pilota arriba a la darrera fila, l'increment de fila passa a ser negatiu.

És a dir, suposant que la darrera fila és la 8, en arribar tindrem la posició (8, 8). La següent posició hauria de ser la (9, 9) però ja surt del camp. Així que voldrem la (7, 9). Com que ara l'increment de les files serà negatiu, després de (7, 9) tocarà (6, 10)
*/

public class Pilota {
    public static final int N_FILES = 9;
    public static final int N_COLS = 14;

    public static void netejaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void mostraCamp(char[][] camp) {
        for (int i = 0; i < N_FILES; i++) {
            for (int j = 0; j < N_COLS; j++) {
                System.out.print(camp[i][j]);
            }
            System.out.println();
        }
    }
    public static void netejaCamp(char[][] camp) {
         for (int i = 0; i < N_FILES; i++) {
            for (int j = 0; j < N_COLS ; j++) {
                camp[i][j] = '·';
            }
        }
    }
    public static void netejaPosicio(char[][] camp, int[] posicio) {
       camp[posicio[0]][posicio[1]] = '·';
    }
    public static void posicionaPilota(char[][] camp, int[] posicio) {
       camp[posicio[0]][posicio[1]] = 'O';
    }

    public static int obteFila(int[] posicio) {
        return posicio[0];
    }
    public static int obteCol(int[] posicio) {
        return posicio[1];
    }
    public static int obteIncrFila(int[] increment) {
        return increment[0];
    }
    public static int obteIncrCol(int[] increment) {
        return increment[1];
    }

    public static void canviaPosicio(int[] posicio, int novaFila, int novaCol) {
        posicio[0] = novaFila;
        posicio[1] = novaCol;
    }
    public static void canviaIncrement(int[] increment, int nouIncFila, int nouIncCol) {
        increment[0] = nouIncFila;
        increment[1] = nouIncCol;
    }
    public static void seguentPosicio(int[] posicio, int[] increment) {
        int fila = obteFila(posicio);
        int col = obteCol(posicio);
        int incFila = obteIncrFila(increment);
        int incCol = obteIncrCol(increment);

        // actualitza la fila
        fila = fila + incFila;
        if (fila < 0) {                     // es passa per sobre
            fila = 1;                       // torna a la primera fila
            incFila = 1;                    // toca baixar
        } else if (fila > N_FILES -1) {     // es passa per sota
           fila = N_FILES - 2;
           incFila = -1;
        }

        // actualitza la columna
         col = col + incCol; 
        if (col < 0) {
            col = 1;          
            incCol = 1;
        } else if (col >= N_COLS) {
            col = N_COLS - 2; 
            incCol = -1;
        }

        // actualitza la posició i l'increment
        canviaPosicio(posicio, fila, col);
        canviaIncrement(increment, incFila, incCol);
    }
    public static void main(String[] args)  {
        char[][] camp = new char[N_FILES][N_COLS];
        netejaCamp(camp);

        int[] posicio = new int[2];         // fila, col
        canviaPosicio(posicio, 0, 0);       // posició inicial (0, 0)

        int[] increment = new int[2];       // incFila, incCol
        canviaIncrement(increment, 1, 1);   // desplaçament inicial: 1 fila 1 columna

        do {
            posicionaPilota(camp, posicio);
            netejaPantalla();
            mostraCamp(camp);
            netejaPosicio(camp, posicio);
            seguentPosicio(posicio, increment);
            System.out.printf("%nEnter per continuar");
        } while (Entrada.readLine().isEmpty());

    }
}
