/* Rescatarem Exercici 15_13. Només lletres i en farem una nova versió, aquest cop reemplaçarem el procediment per funcions.

Recordem que el nostre programa original feia tres coses diferents:

Obtenció del text d'entrada

Filtrat de les lletres del text

Separació de les lletres filtrades

La nova versió oferirà un mòdul per cadascuna de les tres parts del programa. En concret:

L'obtenció de les dades ja la tenim resolta amb Entrada.readLine()

El filtrat de les lletres el farem amb una nova funció pura anomenada nomesLletres() que afegirem a UtilString. */


public class NomesLletres{
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nomesLletres = UtilString.nomesLletres(text);
        String separades = UtilString.lletresSeparades(nomesLletres);
        System.out.println(separades);
    }
}
