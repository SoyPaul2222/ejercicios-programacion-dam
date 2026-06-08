/*
Desenvolupa un programa anomenat Distribuidor, que implementi un lloro amb finalització una cadena buida.

El lloro anirà distribuint els diferents caracters que vagi rebent en quatre cadenes: una de consonants, una altra per les vocals, una de números i una d'altres símbols. Els guardarà en l'ordre en que els rep però sense repetits.

Finalment, mostrarà els resultats.

Tingues en compte:

Com a vocals, considerarem les vocals catalanes: à, a, è, e, é, i, ï, ò, o, ó, u, ú i ü.

Dels símbols no considerarem l'espai.

Les lletres es mostraran en majúscules.

En cas que no s'hagi trobat cap caracter per alguna de les categories, no es mostarà res sobre aquesta.
*/

public class Distribuidor {
    public static void main (String [] args) {
        System.out.println("Introduïu texts (INTRO per finalitzar)");
        String text = Entrada.readLine();

        String vocals = "";
        String consonants = "";
        String nombres = "";
        String simbols = "";
        String vocalsCatalanes = "àaèeéíiïòoóuúü";

        while (!text.isEmpty()) {

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                boolean trobat = false;

                if (Character.isLetter(c)) {
                    c = Character.toUpperCase(c);
                    boolean esVocal = false;

                    for (int j = 0; j < vocalsCatalanes.length(); j++) {
                        if (Character.toLowerCase(c) == vocalsCatalanes.charAt(j)) {
                            esVocal = true;
                        }
                    }

                    if (esVocal) {
                        for (int k = 0; k < vocals.length(); k++) {
                            if (vocals.charAt(k) == c) {
                                trobat = true;
                            }
                        }
                        if (!trobat) {
                            vocals += c;
                        }
                    } else {
                        for (int k = 0; k < consonants.length(); k++) {
                            if (consonants.charAt(k) == c) {
                                trobat = true;
                            }
                        }
                        if (!trobat) {
                            consonants += c;
                        }
                    }

                } else if (Character.isDigit(c)) {
                    for (int k = 0; k < nombres.length(); k++) {
                        if (nombres.charAt(k) == c) {
                            trobat = true;
                        }
                    }
                    if (!trobat) {
                        nombres += c;
                    }

                } else if (c != ' ') {
                    for (int k = 0; k < simbols.length(); k++) {
                        if (simbols.charAt(k) == c) {
                            trobat = true;
                        }
                    }
                    if (trobat) {
                        simbols += c;
                    }
                }
            }

            text = Entrada.readLine();
        }

        if (!vocals.isEmpty()) {
            System.out.println("Vocals: " + vocals);
        }
        if (!consonants.isEmpty()) {
            System.out.println("Consonants: " + consonants);
        }
        if (!nombres.isEmpty()) {
            System.out.println("Nombres: " + nombres);
        }
        if (!simbols.isEmpty()) {
            System.out.println("Símbols: " + simbols);
        }
    }
}

