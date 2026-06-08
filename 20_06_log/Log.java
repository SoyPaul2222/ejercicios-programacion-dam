/*
Aquests registres es solen guardar en un fitxer de text amb una o més línies que descriuen què ha passat i sovint quan va passar. A aquest fitxer se'l sol conèixer com a fitxer de log.

Els fitxers de log es poden veure com una mena de diari que descriu aspectes de l'execució d'un o més programes.

Per implementar el registre, es sol fer mitjançant crides a mòduls que escriuen al fitxer, sense que el programa que els fa servir se n'hagi de preocupar de res més. Com si fes un System.out.println().

En aquesta ocasió desenvoluparem una biblioteca d'utilitats per guardar un registre de les accions que van succeint al nostre programa.
*/

import java.io.FileWriter;
import java.io.IOException;

public class Log {

    private static int comptador = 0;

    public static String printError(String missatge) throws IOException {
        comptador++;
        String linia = String.format("[%d] ERROR: %s\n", comptador, missatge);

        FileWriter fw = new FileWriter("log.txt", true);
        fw.write(linia);
        fw.close();

        return linia.strip();
    }

    public static String printWarning(String missatge) throws IOException {
        comptador++;
        String linia = String.format("[%d] WARNING: %s\n", comptador, missatge);

        FileWriter fw = new FileWriter("log.txt", true);
        fw.write(linia);
        fw.close();

        return linia.strip();
    }

    public static String printInfo(String missatge) throws IOException {
        comptador++;
        String linia = String.format("[%d] INFO: %s\n", comptador, missatge);

        FileWriter fw = new FileWriter("log.txt", true);
        fw.write(linia);
        fw.close();

        return linia.strip();
    }

    public static String printDebug(String missatge) throws IOException {
        comptador++;
        String linia = String.format("[%d] DEBUG: %s\n", comptador, missatge);

        FileWriter fw = new FileWriter("log.txt", true);
        fw.write(linia);
        fw.close();

        return linia.strip();
    }

    public static void reset() {
        comptador = 0;
    }
}  
