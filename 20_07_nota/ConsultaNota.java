/*
Torna a considerar l'exercici del csv de notes. Com en aquell exercici, en aquest també processaràs el fitxer de notes.

En aquesta ocasió, el programa que se't demana es diu ConsultaNota i permet consultar la nota que un alumne va obtenir en una determinada prova.

El programa l'estructuraràs en forma de lloro, i demanarà el nom de l'alumne i el de la prova. Si hi ha una nota per aquest alumne i en aquesta prova, mostrarà el seu valor, altrament, indicarà que no està disponible.

La terminació del programa es produirà quan el lloro rebi un valor buit per alguna de les dades que sol·licita. Per descomptat, si el nom de l'alumne ja és buit, o desconegut, el programa no demanarà el nom de la prova.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConsultaNota {
    public static void main (String [] args) throws IOException {
        String cami = "notes.csv";
        
        File fitxer = new File (cami);
        if (!fitxer.exists()) return;

        BufferedReader br = new BufferedReader(new FileReader(cami));
        String primeraLinia = br.readLine();
        br.close();

    
        if (primeraLinia == null) return;
        String neta = UtilString.normalitzaBlancs(primeraLinia).toLowerCase();
        
        if (!neta.startsWith("alumne") || neta.split(",").length < 2) {
            System.out.println("El fitxer notes.csv no és vàlid");
            return;
        }

        String[] alumnes = carregaAlumnes(cami);
        String[] proves = carregaProves(cami);
        int[][] notes = carregaNotes(cami, alumnes.length, proves.length);

        while (true) {
            System.out.println("Alumne:");
            String alumne = UtilString.normalitzaBlancs(Entrada.readLine());

            if (alumne == null || alumne.length() == 0) {
                System.out.println("Arreveure");
                break;
            }

            int fila = filaAlumne(alumne, alumnes);
            if (fila == -1) {
                System.out.println("Alumne \"" + alumne + "\" no disponible");
                continue;
            }

            System.out.println("Prova:");
            String prova = Entrada.readLine();
            if (prova == null || prova.length() == 0) {
                System.out.println("Arreveure");
                break;
            }

            int columna = columnaProva(prova, proves);
            if (columna == -1) {
                System.out.println("Prova \"" + prova + "\" no disponible");
                continue;
            }

            int nota = notes[fila][columna];
            if (nota >= 0) {
                System.out.println("Nota: " + nota);
            } else if (nota == -1) {
                System.out.println("No Presentat");
            } else if (nota == -2) {
                System.out.println("Nota amb valor no numèric o fora de rang");
            } else if (nota == -3) {
                System.out.println("Nota no disponible");
            }
        }
}
    public static String[] carregaAlumnes(String nomFitxer) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(nomFitxer));
        input.readLine();
        
        int comptador = 0;
        String linia;
        while ((linia = input.readLine()) != null) {
            if (!UtilString.normalitzaBlancs(linia).isEmpty()) comptador++;
        }
        input.close();

        String[] noms = new String[comptador];
        input = new BufferedReader(new FileReader(nomFitxer));
        input.readLine(); 
        for (int i = 0; i < comptador; i++) {
            String l = input.readLine();
            String[] parts = l.split(",");
            noms[i] = UtilString.normalitzaBlancs(parts[0]);
        }
        input.close();
        return noms;
    }

    public static String[] carregaProves(String nomFitxer) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(nomFitxer));
        String linia = input.readLine();
        input.close();

        String[] parts = linia.split(",");
        String[] proves = new String[parts.length - 1];
        for (int i = 1; i < parts.length; i++) {
           proves[i-1] = UtilString.normalitzaBlancs(parts[i]);
        }
        return proves;
    }

    public static int[][] carregaNotes(String nomFitxer, int numAlumnes, int numProves) throws IOException {
        int[][] notes = new int[numAlumnes][numProves];
        BufferedReader input = new BufferedReader(new FileReader(nomFitxer));
        input.readLine(); 

        for (int i = 0; i < numAlumnes; i++) {
            String linia = input.readLine();
           
            String[] parts = linia.split(",", -1);

            for (int j = 0; j < numProves; j++) {
                int col = j + 1;
                if (col >= parts.length || UtilString.normalitzaBlancs(parts[col]).isEmpty()) {
                    notes[i][j] = -3;
                } else {
                    String v = UtilString.normalitzaBlancs(parts[col]);
                    if (v.equalsIgnoreCase("NP")) {
                        notes[i][j] = -1;
                    } else if (UtilString.esEnter(v)) {
                        int n = Integer.parseInt(v);
                        notes[i][j] = (n >= 0 && n <= 100) ? n : -2;
                    } else {
                        notes[i][j] = -2;
                    }
                }
            }
        }
        input.close();
        return notes;
    }

    public static int filaAlumne(String nomAlumne, String[] alumnes) {
        String cercat = UtilString.normalitzaText(nomAlumne);
        for (int i = 0; i < alumnes.length; i++) {
            if (cercat.equalsIgnoreCase(UtilString.normalitzaText(alumnes[i]))) {
                return i;
            }
        }
        return -1;
    }

    public static int columnaProva(String nomProva, String[] proves) {
        String cercada = UtilString.normalitzaText(nomProva);
        for (int i = 0; i < proves.length; i++) {
            if (cercada.equalsIgnoreCase(UtilString.normalitzaText(proves[i]))) {
                return i;
            }
        }
        return -1;
    }
}
