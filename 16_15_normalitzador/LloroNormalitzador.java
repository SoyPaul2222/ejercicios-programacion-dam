/*
Quan treballem amb Strings, sovint ens trobem que alguns caràcters especials de la nostra llengua no apareixen, sigui perquè alguns sistemes no els accepten o simplement per errors ortogràfics.

Sigui com sigui, ens podem trobar que un text com ara "La Plaça del Món" el podem necessitar convertit a "La Placa del Mon".
*/

public class LloroNormalitzador {
    public static void main (String [] args) {
        
        while (true) {                
            System.out.println("El lloro espera un text");    
            String text = Entrada.readLine();
            
            if (text.isEmpty()) {
                System.out.println("El lloro s'acomiada atentament");
                return;
            }
            
            String resultat = UtilString.normalitzaText(text);
        
            
            System.out.println("El lloro respon: " + resultat);  
        }
    }
}
