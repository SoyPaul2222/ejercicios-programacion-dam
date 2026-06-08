/*
Recordes l'exercici en el que el lloro anava demanant texts i només repetia els que començaven o acabaven en vocal?

Desenvoluparem un programa anomenat FitxerVocalIniciFi que farà servir una estructura molt similar, per mostrar totes les línies d'un fitxer de text anomenat frases.txt que comencin o acabin en vocal catalana.

Per descomptat, caldrà que facis servir la funció esVocal() que vas utilitzar per la versió de referència.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            
           char primerCaracter = linia.charAt(0);
           char ultimCaracter = linia.charAt(linia.length()-1);

           boolean primerVocal = UtilString.esVocal(primerCaracter);
           boolean ultimVocal = UtilString.esVocal(ultimCaracter);

           if (primerVocal || ultimVocal) {
            System.out.println(linia);
           }
            
        }
        input.close();
    }
}
