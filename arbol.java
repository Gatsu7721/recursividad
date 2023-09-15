import java.util.Scanner;

class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}
class ArbolBinario {
    Nodo raiz;
    public ArbolBinario() {
        raiz = null;
    }
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }
    private Nodo insertarRec(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }
    public void recorridoInorden(Nodo nodo) {
        if (nodo != null) {
            recorridoInorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoInorden(nodo.derecho);
        }
    }
    public void recorridoInorden() {
        recorridoInorden(raiz);
    }
}
public class arbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            arbol.insertar(numero);
        }

        System.out.print("Recorrido Inorden: ");
        arbol.recorridoInorden();

        scanner.close();
    }
}
