import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ex {

    // Função que gera uma lista de inteiros aleatórios
    public static List<Integer> gerarListaAleatoria(int tamanho) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            lista.add(random.nextInt(100)); // Números aleatórios entre 0 e 99
        }

        return lista;
    }

    // Função principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da lista:");
        int tamanho = scanner.nextInt();

        List<Integer> listaAleatoria = gerarListaAleatoria(tamanho);

        for (int numero : listaAleatoria) {
            System.out.println("Número: " + numero);
            if (numero % 3 == 0) {
                System.out.println("É múltiplo de 3");
            }
            if (numero % 2 == 0) {
                System.out.println("É par");
            } else {
                System.out.println("É ímpar");
            }
        }

        scanner.close();
    }
}
