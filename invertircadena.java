public class InvertirCadena {
    public static void main(String[] args) {
        
        String cadena = "Hola tonotos";
        
        
        char[] caracteres = cadena.toCharArray();
        
        
        int inicio = 0;
        int fin = caracteres.length - 1;
        while (inicio < fin) {
           
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fin];
            caracteres[fin] = temp;
            
            
            inicio++;
            fin--;
        }
        
        
        String cadenaInvertida = new String(caracteres);
        
        
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}