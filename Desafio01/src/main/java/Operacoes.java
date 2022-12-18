
import java.util.*;

public class Operacoes {
    
    public static List<Integer> numerosPares(List<Integer> listaImpares) {

        List<Integer> nuevoArreglo = new ArrayList();

        for (int i = 0; i < listaImpares.size(); i++) {
            if (listaImpares.get(i) % 2 == 0) {
                nuevoArreglo.add(listaImpares.get(i));
            }
        }

        nuevoArreglo.sort(null);

        return nuevoArreglo;
    }

    public static List<Integer> numerosImpares(List<Integer> listaImpares) {

        List<Integer> nuevoArreglo = new ArrayList();

        for (int i = 0; i < listaImpares.size(); i++) {
            if (listaImpares.get(i) % 2 != 0) {
                nuevoArreglo.add(listaImpares.get(i));
            }
        }

        nuevoArreglo.sort(Collections.reverseOrder());

        return nuevoArreglo;
    }

    public static void imprimirLista(List<Integer> listaNumeros) {
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }
    }
}
