/*
Aquest exercici el pots fer a base de prova-i-error i pots amagar-t'ho com un secret que ningú no ha de saber mai. Amb tot, et recomano que, si li vols treure el màxim a aquest exercici, abans d'executar una sola vegada la prova, intentis codificar totes les instruccions deduint la sortida.
*/

public class Feli {
    public Feli() {
        System.out.println("Neix Felí");
    }
    public void netejaUrpes() {
        System.out.println("Felí neteja urpes des de " + this.getClass());
    }
    public void menja(Menjar menjar) {
        System.out.println("Felí menja " + menjar + " des de " + this.getClass());
    }
}
