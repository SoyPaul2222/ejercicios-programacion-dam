/*
Basant-te en aquest codi, desenvolupa un nou programa anomenat ComptaVocals que mostri les ocurrències de totes les vocals catalanes.


*/

public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        String vocalsCatalanes = "aàeèéiíïoóòuúü";

        for (int i = 0; i < vocalsCatalanes.length(); i++) {
            char vocal = vocalsCatalanes.charAt(i);
            int num = quantesOcurrencies(entrada, vocal);
            mostraOcurrencies(vocal, num);
        }
    }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}
