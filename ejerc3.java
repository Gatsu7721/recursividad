public class ejerc3 {
    public static void main(String[] args) {
        String binario = "101";
        int resultado = binarioAEntero(binario);
        System.out.println("Adan clinton vizcarra choque");
        System.out.println("El número binario " + binario + " es igual a " + resultado);
    }
    public static int binarioAEntero(String binario) {
        return binarioAEnteroRecursivo(binario, 0);
    }
    private static int binarioAEnteroRecursivo(String binario, int indice) {
        if (indice == binario.length() - 1) {
            return Character.getNumericValue(binario.charAt(indice));
        }
        int bit = Character.getNumericValue(binario.charAt(indice));
        int resultadoParcial = binarioAEnteroRecursivo(binario, indice + 1);
        return bit * (int) Math.pow(2, binario.length() - 1 - indice) + resultadoParcial;
    }
}
