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
    
    public boolean aturat() {
        if (!esAturat()) {
            moviment = "aturat";
            return true;
        }
        
        return false;
    }
    
    public boolean arrencaAmunt() {
        if (esAturat()) {
            moviment = "pujant";
            return true;
        }
        
        return false;
    }
    
    public boolean arrencaAbaix() {
        if (esAturat()) {
            moviment = "baixant";
            return true;
        }
        
        return false;
    }
    
    public int seguentPis() {
        if (esAturat()) {
            return pis;
        }
        
        if (esPujant() && esAdalt()) {
            pis--;
            moviment = "baixant";
        } else if (esBaixant() && esAbaix()) {
            pis++;
            moviment = "pujant";
        } else if (esPujant()) {
           pis++;
        } else if (esBaixant()) {
            pis--;
        }
        
        return pis;
    }

}
