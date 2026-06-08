/*
A l'experiment anterior podem veure el següent comportament:

si el fitxer no existeix, el crea

si el fitxer existeix sobreescriu o, si vols, reemplaça el seu contingut

si l'executem més d'un cop seguit, no es distingeix cap canvi
*/

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

public class Recorda {
    public static void main(String[] args) throws IOException {
        String cami = "records.txt";
        processaEntrada(cami);
        System.out.println("D'acord");
        mostraRecords(cami);
    }

    public static void processaEntrada(String cami) throws IOException {
    BufferedWriter sortida = new BufferedWriter(new FileWriter(cami));

        while (true) {
            System.out.println("El lloro pregunta paraula:");
            String text = Entrada.readLine();
            
            if (text.isEmpty()) break;

            text = UtilString.normalitzaBlancs(text);
            System.out.println("El lloro registra: " + text);
            
            sortida.write(text);
            sortida.newLine();    
        }

        sortida.close();
    }

    public static void mostraRecords(String cami) throws IOException {
        File fitxer = new File(cami);
        FileReader fr = new FileReader(fitxer);
        BufferedReader input = new BufferedReader(fr); 

        if (fitxer.length() == 0) {
            System.out.println("El lloro no recorda res");
        } else{
             while (true) {
            String linia = input.readLine();                       
            if (null == linia) break;
            System.out.println("El lloro recorda: " + linia);
        }
        }

        System.out.println("Adéu");
        input.close(); 
    }


    
}
