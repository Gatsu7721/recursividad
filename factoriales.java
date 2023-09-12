public class factoriales {
    public static void main(String[] args) {
    int n = 5;
    int resultado = factorial(n);
    System.out.println("El factorial de "+ n + " = "+resultado);
    }
    public static int factorial(int numero){
        if(numero < 1 ){
            return  1;
        }else{
            return numero * factorial(numero-1);
        }
    }
}
