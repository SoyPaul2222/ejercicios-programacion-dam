##########################################
Anotacions sobre les propietats protegides
##########################################

* Autor/a: Rainier Paul Santiago Tacsiat

* Data: 29/3/2026

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
*propietats protegides* dins de la *programació orientada a objectes*.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que el programa no compila i dona error.

Penso que passa perquè perquè l'atribut vides està declarada com a private, això vol dir que no té accés des d'un altra classe.

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és que amb el mètode getVides() podem accedir a l'atribut vides.

El resultat ara és El gat Renat té 7 vides

Penso que passa això perquè els mètodes public sí que són accessibles des d’altres classes, i getVides() retorna el valor de l’atribut privat vides.

Pregunta 3. Canviant valor
==========================

Per què des del ``main()`` de ``UsaGatRenat`` poguem dir que ``renat`` té
5 vides, cal fer servir el mètode setVides().

El codi de ``UsaGatRenat`` seria:

::

        public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             renat.setVides(5);
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 5 vides


La meva explicació de perquè això és així és perquè setVides() permet modificar l’atribut privat si el valor és vàlid, i després getVides() ens permet consultar-lo.


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, ens
trobem que el valor de vides no canvia.

El codi seria:

::

        public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             renat.setVides(-12);
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }


La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 7 vides


La meva explicació de perquè això és així és perquè el mòdul de setVides() només acepta valors positius o igual que 0 i ignora els valor negatius.


Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo què sí que compila i s’executa correctament.

Comparant-lo amb el que passava a la pregunta 1, veiem que ara sí es pot accedir a l’atribut vides directament.

La meva explicació és perquè private només restringeix l’accés des de fora de la classe.

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és no perquè l’única manera d’accedir des de fora és mitjançant el set().

Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és que private protegeix les dades internes de la classe evitant accessos directes, 
mentre que public permet exposar només els mètodes necessaris per interactuar amb aquestes dades de manera controlada.

Pregunta 8. Només *getter*
==========================

Aquesta implementació de ``GatRenat`` disposa de *getter* i de *setter*.
Aquests venen definits pels mòduls getVides() i setVides().

En cas que ``GatRenat`` només disposés de *getter*, el resultat seria que podríem consultar les vides.

En canvi, si només en tingués *setter* el que passaria és que podríem modificar el valor.

Finalment, si no en tingués cap dels dos, ens trobaríem que no podríem ni consultar ni modificar l’atribut des de fora de la classe.


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret aquests mètodes serveixen per accedir i modificar atributs privats, 
mentre que abans no estaven necessàriament pensats per protegir dades.
