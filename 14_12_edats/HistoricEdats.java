/*
Desenvolupa el programa HistoricEdats que demani el nom d'una persona, la seva edat i l'any actual, i escrigui l'edat que tenia aquella persona cada any des del seu naixement.
*/

public class HistoricEdats {
    public static void main (String [] args) {
        System.out.println("nom?");
        String nom = Entrada.readLine();   
                System.out.println("edat?");
                int edat = Integer.parseInt(Entrada.readLine());     
                        System.out.println("any actual?");
                         int any = Integer.parseInt(Entrada.readLine());
                            if (any < 0 || any < 1971 || edat < 0 || nom.isBlank()) {
                              System.out.println("Entrada incorrecta");
                             } else {
                                  if (edat == 0) {
                                    System.out.println("Adéu " + nom);
                                  } else if (edat == 1) {
                                    System.out.println("El " + (any - 1) + " vau néixer");
                                    System.out.println("Adéu " + nom);
                                  } else {
                                    System.out.println("El " + (any - edat) + " vau néixer");
                                    int anyInici = (any - edat) + 1; 
                                    for (int i = 1; i < edat; i++) {
                                        
                                        if (i == 1) {
                                           System.out.println("El " + anyInici + " teníeu " + i + " any"); 
                                        } else {
                                           System.out.println("El " + anyInici + " teníeu " + i + " anys");
                                        }
                                        anyInici++;
                                        
                                    }
                                    System.out.println("Adéu " + nom);  
                                  }
                             }    
    }
}
