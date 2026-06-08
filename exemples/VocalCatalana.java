public class VocalCatalana {
    public static void main (String [] args) {
        String VOCALS_MINUSCULES = "aàeèéiíÏoòóúÜ";
        
        char lletra = 'à';
        boolean trobat = false;
        //Mirar si és una vocal catalana
        
        for (int i = 0; i < VOCALS_MINUSCULES.length(); i++) {
            char vocal = VOCALS_MINUSCULES.charAt(i);
            //Mirar sí la lletra és aquesta vocal
            lletra = Character.toLowerCase(c);
            if (lletra == vocal) {
                trobat = true;
                //break;
            }
            
            
        }
        
        //Missatge final
        if (trobat) {
            System.out.println(lletra + " és una vocal catalana");
        } else {
            System.out.println(lletra + " no és una vocal catalana");
        }
    }
}
