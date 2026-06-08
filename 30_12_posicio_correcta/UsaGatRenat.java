 /*
 Un UllDeGat pot estar obert o tancat i ofereix els mètodes:

obret()

tancat()

boolean esObert()

A banda, ofereix dos constructors, el de per defecte que l'inicialitzarà tancat, i un d'específic que permet indicar si l'ull comença obert (true) o no.

Amplia la classe GatRenat de manera que ara tingui dos ulls.
 */
 
 public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat = new GatRenat();
         System.out.println("Les vides inicials són: " + renat.getVides());
         System.out.println("La posició inicial és: " + renat.getPosicio());
         System.out.println("Introdueix nova posició:");
         renat.setPosicio(Entrada.readLine());
         System.out.println("La posició final és: " + renat.getPosicio());
     }
 }
