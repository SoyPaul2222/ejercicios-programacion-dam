/*
En aquest exercici desenvoluparem un programa que rebrà tres arguments per línia de comandes.

El primer correspondrà al nom d'un fitxer de text que suposarem que existeix, i que contindrà un text arbitrari.

Ens referirem a aquest fitxer com origen.

El segon argument correspondrà al nom d'un altre fitxer de text que també suposarem que existeix, i que anomenarem traducció

El contingut d'aquest fitxer serà un csv format per parelles de texts separades amb una coma (','). Les línies que continguin un nombre de comes diferent de 1 seran ignorades.

Al primer element de la parella li direm clau i al segon valor.

El tercer argument correspondrà al nom d'un fitxer de text que pot no existir.

Ens referirem a aquest fitxer com la destinació.
*/

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
public class Traduccio {

    public static void main(String[] args)  throws IOException{
        if (args.length != 3) {
            System.out.println("Cal especificar els fitxers origen, traduccio i destinació");
            return;
        }

       String origen = args[0];
       String traductor =  args[1];
       String destinacio =  args[2];
       tradueix(origen, traductor, destinacio);
    }


    
    public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException {
            BufferedReader origen = new BufferedReader(new FileReader(fitxerOrigen));
            BufferedWriter desti = new BufferedWriter(new FileWriter(fitxerDestinacio));

            while (true) {
                String linia = origen.readLine();
                if (null == linia) break;

                String tradueix = tradueixLinia(linia, fitxerTraduccio);
                desti.write(tradueix);
                desti.newLine();
            }

            origen.close();
            desti.close();
    }

    public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException {
        BufferedReader traduccio = new BufferedReader(new FileReader(fitxerTraduccio));

        while (true) {
             String fila = traduccio.readLine();
             if (fila == null) break;
             
             String [] claus = fila.split(",");

                if (claus.length != 2) {
                    continue;
                }

             String clau = claus[0];
             String valor = claus[1];

             linia = linia.replace(clau, UtilString.normalitzaBlancs(valor));
        }
        traduccio.close();
        return linia;
    }




}
