/*
H
wefdsfdsakjlkjdsahfdsahflkhdsafsalkhfddsaf

wefdsfdsakjlkjdsahfdsahflkhdsafsalkhfddsaf
wefdsfdsakjlkjdsahfdsahflkhdsafsalkhfddsaf
wefdsfdsakjlkjdsahfdsahflkhdsafsalkhfddsaf
wefdsfdsakjlkjdsahfdsahflkhdsafsalkhfddsaf
*/

public class UtilitatsConfirmacio {
    public static boolean respostaABoolean(String resposta) {
        if (null == resposta) {     
            return false;
        }
        
    
        resposta = resposta.strip().toLowerCase();

        if (resposta.equals("s") || resposta.equals("y")) {
            return true;
        }
        if (resposta.equals("sí") || resposta.equals("yes")) {
            return true;
        }
        if (resposta.equals("si") || resposta.equals("vale") || resposta.equals("yeah")) {
            return true;
        }
       
       
         return false;
       }
    
}
