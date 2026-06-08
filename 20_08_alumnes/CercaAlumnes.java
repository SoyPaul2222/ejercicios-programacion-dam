/*
Per provar algunes d'elles, desenvoluparem un programa que llegirà les dades d'un fitxer en format csv, i mostrarà la informació relativa a cada alumne que correspongui al criteri de cerca que s'indiqui per l'argument esperat.

El criteri de cerca és un String que el programa rep com a primer argument de la línia de comandes, i que ha d'aparèixer com a part del nom o de la part de l'usuari al correu electrònic (abans de @) dels alumnes a mostrar. El programa no serà sensible a majúscules/minúscules ni als caràcters especials propis de la llengua catalana (en concret, les vocals accentuades i la ç)
*/

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class CercaAlumnes {

    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }

    public static Alumne construeixAlumne(String nom, String email,
                                          int edat, boolean esOient,
                                          int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
            System.out.println("Alumne: " + alumne.nom);
            System.out.println("- email: " + alumne.email);
            System.out.println("- edat: " + alumne.edat);
            System.out.println("- és oïent: " + (alumne.esOient?"Sí":"No"));
            System.out.println("- notes: " + notesACsv(alumne.notes));

    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", " +
                "edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }

    // converteix un array de notes a CSV
    // Té en comptes els valors NP com a -1
    public static String notesACsv(int[] notes) {
      if (notes == null || notes.length == 0) return "";
  
      String resultat = "";

      for (int i = 0; i < notes.length; i++) {
         if (i > 0) resultat += ",";

        if (notes[i] == -1) {
            resultat += "NP";
        } else {
            resultat += notes[i];
        }
     }

    return resultat;
   }

    public static String alumneACsv(Alumne alumne) {
        return String.format("%s,%s,%d,%b,%s",
                alumne.nom,
                alumne.email,
                alumne.edat,
                alumne.esOient,
                notesACsv(alumne.notes));
    }


     public static Alumne csvAAlumne(String csv) {
        String[] parts = csv.split(",");

        String nom = parts[0];
        String email = parts[1];
        int edat = Integer.parseInt(parts[2]);
        boolean esOient = Boolean.parseBoolean(parts[3]);

        int[] notes = new int[parts.length - 4];
        for (int i = 4; i < parts.length; i++) {
            if (parts[i].equals("NP")) {
                notes[i - 4] = -1;
            } else {
                notes[i - 4] = Integer.parseInt(parts[i]);
            }
        }

        return construeixAlumne(nom, email, edat, esOient, notes);
    }

    public static void main(String[] args) throws IOException {
        // assegura que hi ha el criteri de cerca
        if (args.length < 1) {
            System.out.println("Ús: CercaAlumnes «criteri de cerca»");
            return;
        }

        String criteri = args[0].toLowerCase();

        // declaracions, inicialitzacions, apertura de fitxer, ignora línia de capçaleres, etc.
        BufferedReader input = new BufferedReader(new FileReader("alumnes.csv"));

        input.readLine();
        
        boolean trobat = false;
        
        while (true) {
            // llegeix entrada i finalitza bucle si no en queden més
            String linia = input.readLine();
            if (linia == null) break;

            // converteix l'entrada a Alumne
             Alumne alumne = csvAAlumne(linia);

            // comprova si el criteri de cerca es troba dins del nom o
            // el email. Si és així, mostra'l
            
            String email = alumne.email.split("@")[0].toLowerCase();
            
            if (alumne.nom.toLowerCase().contains(criteri) ||
                email.contains(criteri)) {

                mostraAlumne(alumne);
                trobat = true;
            } 
          
        }
        
        if (!trobat) {
        System.out.println("No s'ha trobat cap alumne");
         }
        
        // consideracions finals com ara el tancament del fitxer
        input.close();
    }
}
