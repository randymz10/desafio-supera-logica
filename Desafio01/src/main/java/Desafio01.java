
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanio = 0;
        List<Integer> numeros = new ArrayList<>();
        Operacoes operacoes = new Operacoes();

        System.out.println("Inserte el tamanio del arreglo ");
        tamanio = sc.nextInt();

        for (int i = 0; i < tamanio; i++) {
            System.out.println("Inserte un numero");
            numeros.add(sc.nextInt());
        }

        List<Integer> listaPares = operacoes.numerosPares(numeros);
        System.out.println("Lista Pares:");
        operacoes.imprimirLista(listaPares);

        List<Integer> listaImpares = operacoes.numerosImpares(numeros);
        System.out.println("Lista Impares:");
        operacoes.imprimirLista(listaImpares);

    }

}
