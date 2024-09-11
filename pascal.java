public class TrianguloPascal {

    
    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

  
    public static int coeficienteBinomial(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    
    public static void dibujarTrianguloPascal(int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            
            for (int j = 0; j < tamanio - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k <= i; k++) {
                System.out.print(coeficienteBinomial(i, k) + " ");
            }
            System.out.println(); // Nueva linea
        }
    }

    public static void main(String[] args) {
        int tamanio = 5;
        dibujarTrianguloPascal(tamanio);
    }
}
    
    