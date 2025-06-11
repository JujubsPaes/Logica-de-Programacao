import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int N, resultado;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número que deseja buscar: ");
        N = in.nextInt();

        resultado = buscaBinaria(numeros, N);

        if (resultado != -1)
            System.out.println("Número encontrado na posição: " + resultado);
        else
            System.out.println("Número não encontrado.");
    }

    public static int buscaBinaria(int[] array, int N) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == N) {
                return meio;
            } else if (array[meio] < N) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}
