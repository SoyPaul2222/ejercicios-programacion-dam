/*
Desenvolupa un programa que consideri els arguments de línia de comanda com si fossin camins del sistema de fitxer.

Per cada argument, comprovarà si correspon a un camí existent.

Si no existeix, indicarà "No trobat".

En cas que existeixi, indicarà els seus permisos per l'usuari en el format típic de GNU (rwx)

A continuació, indicarà si correspon a un fitxer o un directori.
*/


import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Inspecciona {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < args.length; i++) {
            String cami = args[i];
            File f = new File(cami);

            String missatge = "Processant argument: " + cami;
            System.out.println(missatge);
            

            for (int j = 0; j < missatge.length(); j++) {
                System.out.print("=");
            }
            System.out.println();

            if (!f.exists()) {
                System.out.println("No trobat");
            } else {
                if (f.canRead()) System.out.print("r"); else System.out.print("-");
                if (f.canWrite()) System.out.print("w"); else System.out.print("-");
                if (f.canExecute()) System.out.print("x"); else System.out.print("-");
                System.out.print(" ");

                if (f.isDirectory()) {
                    String[] llista = f.list();
                    if (llista == null || llista.length == 0) {
                        System.out.println("directori buit");
                    } else {
                        Arrays.sort(llista);
                        System.out.print("directori que conté: ");
                        for (int j = 0; j < llista.length; j++) {
                            System.out.print(llista[j] + (j < llista.length - 1 ? ", " : ""));
                        }
                        System.out.println();
                    }
                } else {
                    long mida = f.length();
                    if (mida == 0) {
                        System.out.println("fitxer buit");
                    } else {
                        System.out.println("fitxer de mida en bytes: " + mida);

                        if (cami.endsWith(".java") || cami.endsWith(".txt")) {
                            if (f.canRead()) {
                                System.out.println("Amb els continguts:");

                                BufferedReader lector = new BufferedReader(new FileReader(f));
                                
                                String linia = lector.readLine();
                                while (linia != null) {
                                    System.out.println("|" + linia + "|");
                                    linia = lector.readLine(); 
                                }
                                lector.close();
                            }
                        }
                    }
                }
            }
            System.out.println(); 
        }
    }
}
