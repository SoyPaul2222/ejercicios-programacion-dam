/*
El nom d'un gat cal que sigui no null, ni buit ni blanc. En cas que el nom que se li assigna al gat no sigui vàlid, el gat passarà a dir-se "anònim".

Els gats podran especificar en el seu naixement, a banda del requerit nom, les vides o/i la posició inicial.

Per altra banda, tenim que el GatRenat continuarà sent un Gat. En aquest cas, però, ja sabem el nom de tots els gats Renat, oi? Per tant, els seus constructors no demanaran nom
*/

public class UsaGats {
    public static void main(String[] args) {
        Gat[] gats = new Gat[] {
                new Gat("Misifú"),
                new GatRenat(),
                new Garfield()
        };
        for (Gat gat: gats) {
            System.out.println("Entrenant el gat " + gat.getNom());
            System.out.println(gat.getNom() + " diu: "+ gat.seu());
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
            System.out.println(gat.getNom() + " diu: "+ gat.estirat());
            System.out.println();
        }
    }
}

