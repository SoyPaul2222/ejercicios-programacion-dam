/*
Desenvolupa un programa que llegeixi una cadena d'entrada i la tracti com un enter que codifica una hora.

L'entrada només ha de contenir números i com a màxim 6.

Si l'entrada està buida el programa es comportarà com si hagués rebut "0"

Finalment mostrarà l'hora rebuda però normalitzada. És a dir, separarà les hores, minuts i segons amb el caràcter ':', i cada valor tindra una mida exàctament de dos caràcters.

Si el valor rebut no correspon a una hora vàlida en format 24h (per exemple, perquè hi ha massa segons), es considerarà una entrada errònia.

En cas d'error, el programa mostrarà "ERROR".
*/

public class Hora {
    public static void main(String[] args) {
        String hora = Entrada.readLine();

        if (hora.isEmpty()) {
            System.out.println("00:00:00");
        } else {
            if (hora.length() == 1) {
                hora = "00000" + hora;
            } else if (hora.length() == 2) {
                hora = "0000" + hora;
            } else if (hora.length() == 3) {
                hora = "000" + hora;
            } else if (hora.length() == 4) {
                hora = "00" + hora;
            } else if (hora.length() == 5) {
                hora = "0" + hora;
            }

            if (hora.length() > 6) {
                System.out.println("ERROR");
            } else {
                char d1 = hora.charAt(0);
                char d2 = hora.charAt(1);
                char d3 = hora.charAt(2);
                char d4 = hora.charAt(3);
                char d5 = hora.charAt(4);
                char d6 = hora.charAt(5);

                if (Character.isDigit(d1) &&
                    Character.isDigit(d2) &&
                    Character.isDigit(d3) &&
                    Character.isDigit(d4) &&
                    Character.isDigit(d5) &&
                    Character.isDigit(d6)) {

                    if (  
                        (
                            ((d1 == '0' || d1 == '1') && (d2 >= '0' && d2 <= '9')) ||
                            (d1 == '2' && (d2 >= '0' && d2 <= '3'))
                        ) &&
                        (d3 >= '0' && d3 <= '5') && (d4 >= '0' && d4 <= '9') &&
                        (d5 >= '0' && d5 <= '5') && (d6 >= '0' && d6 <= '9')
                    ) {
                        System.out.println("" + d1 + d2 + ":" + d3 + d4 + ":" + d5 + d6);
                    } else {
                        System.out.println("ERROR");
                    }
                } else {
                    System.out.println("ERROR");
                }
            }
        }
   }
}

