public class ejerc2{
    public static void main(String[] args) {
        int cuentaR = cuenta(6);
        System.out.println("Adan clinton vizcarra choque");
        System.out.println("suma total = "+ cuentaR);
    }
    public static int cuenta(int n){
        if(n==0){
            return 0;
        }else{
            int resultado = n+ cuenta(n-1);
            return resultado;
        }
    }
}