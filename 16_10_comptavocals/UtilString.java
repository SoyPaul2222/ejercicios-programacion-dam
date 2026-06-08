/*
Programa que analitza si es un vocal o no;dsfsfsf
Programa que analitza si es un vocal o no;dsfsfsf
Programa que analitza si es un vocal o no;dsfsfsf

v

Programa que analitza si es un vocal o no;dsfsfsf
Programa que analitza si es un vocal o no;dsfsfsf
Programa que analitza si es un vocal o no;dsfsfsf

Programa que analitza si es un vocal o no;dsfsfsfPrograma que analitza si es un vocal o no;dsfsfsf
*/

public class UtilString {
    public static boolean esVocal(char c) {
        
        String vocals = "aàeèéiíïoòóuúü";
        
        if (Character.isUpperCase(c)) {
            return false;
        }
         
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
             
             if (v == c) {
                return true;
             } 
        }
    
        return false;
    }
}
