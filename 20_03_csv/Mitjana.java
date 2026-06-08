/*
Pots suposar que el fitxer sempre existeix.

El primer element de la línia, si hi és, es considerarà el nom de l'alumne.

Si el nom de l'alumne està buit o només format per espais en blanc, el programa ignorarà tota la línia.

Si un estudiant no té prou notes per a tots els exàmens, les que falten es consideraran NP. Si en té de més, només es consideraran les primeres.

El prgtest t'informarà d'alguns detalls extra com ara, la sortida quan el fitxer no disposi de notes o el nombre d'exàmens no sigui suficient per calcular la mitjana.

Per passar totes les proves, l'opertura i tancament del fitxer s'ha de realitzar dins del fitxer que conté el main().

Per aconseguir els dos decimals, recorda:
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mitjana {
    public static void main(String[] args) throws IOException {
        int numero = 6;

        if (args.length > 0 && UtilString.esEnter(args[0])) {
            numero = Integer.parseInt(args[0]);
        }

        if (numero < 2) {
            System.out.println("Com a mínim 2 exàmens.");
            return;
        }

        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);

        input.readLine();
        System.out.println("Càlcul de la mitjana de notes per " + numero +  " exàmens");
        
        boolean hiHaNotes = false;

        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            if (UtilString.normalitzaBlancs(linia).isEmpty()) {
              continue;
            }
            hiHaNotes = true;

            String[] parts = linia.split(",");
            String nom = UtilString.normalitzaBlancs(parts[0]); 
            
            if (nom.isEmpty()) {
                continue;
            }
            int suma = 0;
            
            for (int i = 1; i < parts.length; i++) {

                if (i > numero) {
                  break;
                 }

                 parts[i] = UtilString.normalitzaBlancs(parts[i]);
                if (UtilString.esEnter(parts[i])) {
                    suma += Integer.parseInt(parts[i]);
                } else {
                    suma += 0;
                }
            }

            double mitjana = (double) suma / numero;    
            
            System.out.printf("%s (%.2f)\n", nom, mitjana);
        }

        if (!hiHaNotes) {
        System.out.println("El fitxer notes.csv no conté cap nota.");
        }
        input.close();
    }
}
