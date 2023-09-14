public class ejerc4 {
    public static void main(String[] args) {
        int n = 11;
        System.out.println("Adan clinton vizcarra choque");
        System.out.println("Secuencia de Fibonacci (primeros " + n + " términos):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
    }
    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}

