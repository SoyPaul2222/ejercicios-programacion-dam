public class test {
    public static void main (String [] args) {
    
    String text = Entrada.readLine();
    
    
    
    public static String textAArray(String temperatura) {
        String filtrar = "";
        int contador = 0;
        for (int i = 0 ; i < temperatura.length(); i++) {
            char c = temperatura.charAt(i);
            
            if (c != '0') {
                filtrar += c;
            }
            
            if (c == '+' || c == '-') {
                contador++;
            }
        }
        
        int [] array =  new int [contador];
        String enters = "";
             
       for (int i = 0 ; i < filtrar.length(); i++) {
            char c = filtrar.charAt(i);
                
                enters =+ c;
                
                if (c == '+' || c == '-') {
                    continue;
                }
                
                array[i] = (int)enters;
   
        }
        
        return text;
    }
}
