/*
Fixa't com strip() és capaç de treure els espais en blanc a inici i a final, però no toca els espais entremig. Els espais en blanc també inclouen els tabuladors '\t'. De fet, considera com a espai en blanc tot allò que considera la funció Character.isWhitespace(). Si vols els detalls, pots consultar la documentacíó oficial <https://docs.oracle.com/en/java/javase/21/docs//api/java.base/java/lang/Character.html#isWhitespace(int)>.

Nosaltres desenvoluparem la funció normalitzaBlancs() que farà el mateix que String.strip() però afegirà la part de normalitzar els espais en blanc sobrers entre mig de les paraules del text. Així:

*/

public class ForaEspaisSobrers {
    public static void main (String [] args) {
        
        while (true) {
            System.out.println("El lloro espera un text");
            String text = Entrada.readLine();
            
            if (text.isEmpty()) {
                System.out.println("El lloro s'acomiada atentament");
                return;
            }
            
            String textNormalitzat = UtilString.normalitzaBlancs(text);
            
            System.out.println("El lloro respon " + "\"" +  textNormalitzat + "\"");
            
        }
    }
    
}
