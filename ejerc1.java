public class ejerc1 {
    public static void main(String[] args) {
        String palabra = "Olla";
        String palabra1 = palabra.toLowerCase();
        boolean esPalindromo = palindromo(palabra1);
        if (esPalindromo) {
            System.out.println("Adan clinton vizcarra choque");
            System.out.println("La palabra \"" + palabra1 + "\" es un palíndromo.");
        } else {
            System.out.println("Adan clinton vizcarra choque");
            System.out.println("La palabra \"" + palabra1 + "\" no es un palíndromo.");
        }
    }
    public static boolean palindromo(String x) {
        return esPalindromoRecursivo(x, 0, x.length() - 1);
    }
    public static boolean esPalindromoRecursivo(String x, int inicio, int fin) {
        if (inicio >= fin) {
            return true; // Caso base: cuando no quedan caracteres por comparar
        }
        if (x.charAt(inicio) != x.charAt(fin)) {
            return false; // Si los caracteres en los extremos no son iguales, no es un palíndromo
        }
        // Llamada recursiva excluyendo los extremos
        return esPalindromoRecursivo(x, inicio + 1, fin - 1);
    }
}
