package jugador;

public class AppPere {
    public static void main(String[] args) {
        jugador jugador1 = new jugador("Kai", 17);
    
        jugador jugador2 = new jugador("Trebor" , 6, 999);
        
        jugador2.anotar(1);
        
        System.out.println(jugador1);
        System.out.println(jugador2);

        System.out.println("El jugador " + jugador1.getNom() + " ha fet" + jugador1.getDorsal());
        System.out.println("Hi ha " + jugador.nJugadors + " jugadors");
    }
}
