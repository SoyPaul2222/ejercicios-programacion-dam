/*
esAbaix() i esAdalt() retornen cert quan l'ascensor es troba al primer i al darrer pis respectivament.

esEnMoviment() retorna cert quan està pujant o baixant.

comEsta() retorna un String amb el moviment i el pis. Per exemple, si està pujant en el pis 1, el missatge serà pujant al pis 1.
*/

public class Ascensor {
    private int pis = -1;
    private String moviment = "aturat";
    public int getPis() {
        return pis;
    }
    
    public void setPis(int nouPis) {
        if (nouPis >= -1 && nouPis <= 10) {
            pis = nouPis;
        }
    }
    
    public String getMoviment() {
        return moviment;
    }
    
    public void setMoviment(String nouMoviment) {
             if (!nouMoviment.isEmpty() && (nouMoviment.equals("aturat") || nouMoviment.equals("pujant") || nouMoviment.equals("baixant") )) {
              moviment = nouMoviment;
          }
    }
    
    public boolean esAbaix() {
        return pis == -1;
    }
    
    public boolean esAdalt() {
        return pis == 10;
    }
    
    public boolean esAturat() {
        return moviment.equals("aturat");
    }

    public boolean esEnMoviment() {
        return moviment.equals("pujant") || moviment.equals("baixant");
    }

    public boolean esPujant() {
        return moviment.equals("pujant");
    }

    public boolean esBaixant() {
        return moviment.equals("baixant");
    }

    public String comEsta() {
        return moviment + " al pis " + pis;
    }
}
