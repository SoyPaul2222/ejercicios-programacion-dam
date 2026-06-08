/*
Un ascensor es un sistema de transporte vertical diseñado para mover personas u objetos entre los diferentes niveles de una edificación. Técnicamente, se diferencia de otros elevadores por operar a velocidades superiores a 0,15 m/s. 

Componentes y funcionamiento
Este sistema integra partes mecánicas, eléctricas y electrónicas que trabajan en conjunto para garantizar un movimiento seguro y preciso. Sus elementos principales incluyen: 
Cabina: El compartimento donde viajan los pasajeros o la carga.
Grupo tractor: El motor (generalmente eléctrico) que genera el movimiento.
Sistema de control: El "cerebro" que procesa las llamadas y gestiona la velocidad y las paradas.
Contrapeso: Un peso que equilibra la cabina para reducir el esfuerzo del motor y ahorrar energía.
Seguridad: Incluye limitadores de velocidad, frenos electromecánicos y amortiguador
*/

public class UsaAscensor {
    public static void main (String [] args) {
        Ascensor ascensor = new Ascensor();
        
         System.out.println("Pis inicial: " + ascensor.pis);
         System.out.println("Moviment inicial: " + ascensor.moviment);
         
         ascensor.moviment = "pujant";
         
         System.out.println("Moviment final: " + ascensor.moviment);
    }
}
