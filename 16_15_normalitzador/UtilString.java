/*
Per poder passar les proves, la nostra biblioteca UtilString haurà de definir la funció normalitzaChar() que rep un caràcter i el retorna normalitzat seguint els criteris especificats. Aquesta funció serà usada per LloroNormalitzador.Per poder passar les proves, la nostra biblioteca UtilString haurà de definir la funció normalitzaChar() que rep un caràcter i el retorna normalitzat seguint els criteris especificats. Aquesta funció serà usada per LloroNormalitzador.
*/

public class UtilString {
    public static char normalitzaChar(char c) {
         
         String vocalsCatalanes = "àèéíïòóúüçÀÈÉÍÏÒÓÚÜÇ";
            String normalitzats = "aeeiioouucAEEIIOOUUC";
         
         for (int i = 0 ; i < vocalsCatalanes.length(); i++) {
             if (c == vocalsCatalanes.charAt(i)) {
                return normalitzats.charAt(i);
             } 
         }
         
        return c;
    }
    
    public static String normalitzaText(String text) {

        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            resultat += normalitzaChar(text.charAt(i));
        }

        return resultat;
    }
}
