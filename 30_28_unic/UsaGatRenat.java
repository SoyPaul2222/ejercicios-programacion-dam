 /*
 Fixat especialment en les línies 3 i 14. En ambdues accedim a la única instància de GatRenat.
  Tant main() com canviaPosicio() no comuniquen aquesta instància entre si ja que, ni la instància de GatRenat està declarada com a global de UsaGatRenat, ni canviaPosicio() la rep com a paràmetre ni la retorna! Amb tot, els canvis que es realitzen en un mòdul són visibles a l'altre. Sembla màgia, oi?
 */
 
 public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat = GatRenat.getInstancia();
         System.out.println("Inicialment Renat està " + renat.getPosicio());
         for (String posicio: args) {
             canviaPosicio(posicio);
             System.out.println("Ara està " + renat.getPosicio());
         }
     }
     private static void canviaPosicio(String novaPosicio) {
         // Tradueix novaPosicio: 1 -> estirat, 2 -> assegut, 3 -> dret,
         // altrament es queda com estava
         // XXX
      if (novaPosicio.equals("1")) {
        GatRenat.getInstancia("estirat");

        } else if (novaPosicio.equals("2")) {
          GatRenat.getInstancia("assegut");

        } else if (novaPosicio.equals("3")) {
          GatRenat.getInstancia("dret");

         } else if (novaPosicio.equals("estirat") ||
               novaPosicio.equals("assegut") ||
               novaPosicio.equals("dret")) {

        GatRenat.getInstancia(novaPosicio);
        }
     }
 }
