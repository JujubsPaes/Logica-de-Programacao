import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, result;
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        N = in.nextInt();

        if (N > 0) {
            result = somaRecursiva(N);
            System.out.println("Soma de 1 até " + N + " é: " + result);
        } else {
            System.out.println("O número digitado deve ser maior que 0!");
        }
    }

    public static int somaRecursiva(int N) {
        if (N == 1) {
            return 1; // fim
        } else {
            return N + somaRecursiva(N - 1); // chamada recursiva
        }
    }
}
