/*
Sí, és un paràmetre de tipus array de String!

En aquest exercici consisteix en fer un programa que analitzi els arguments que es passen per la línia de comandes i distingeixi si són o no enters.Sí, és un paràmetre de tipus array de String!

En aquest exercici consisteix en fer un programa que analitzi els arguments que es passen per la línia de comandes i distingeixi si són o no enters.
*/

public class Arguments {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Cap argument");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
            if (UtilString.esEnter(arg)) {
                System.out.println("[" + i + "] \"" + arg + "\": és enter");
            } else {
                System.out.println("[" + i + "] \"" + arg + "\": no és enter");
            }
        }
    }
    
    }
