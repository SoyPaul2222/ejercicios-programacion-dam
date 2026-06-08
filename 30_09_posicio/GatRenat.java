/*
En aquesta ocasió afegirem al nostre gat Renat la possibilitat d'indicar en quina posició es troba. En concret, podrà estar dret, assegut o estirat.

 @startuml
 hide circle
 skinparam monochrome true
 skinparam classAttributeIconSize 0


 class GatRenat {
     vides: int
     posicio: String
 }
 @enduml

Modifica la definició de la seva classe perquè pugui guardar aquesta informació, fent que inicialment el gat estigui estirat.

La informació de l'estat la guardarem en una propietat amb el nom posicio que serà de tipus String.
*/

public class GatRenat {
    int vides = 7;         // vides disponibles del gat Renat
    String posicio = "estirat";
}
