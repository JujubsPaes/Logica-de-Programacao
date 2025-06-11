import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int N, resultado;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número que deseja buscar: ");
        N = in.nextInt();

        resultado = buscaBinariaR(numeros, 0, numeros.length - 1, N);

        if (resultado != -1)
            System.out.println("Número encontrado na posição: " + resultado);
        else
            System.out.println("Número não encontrado.");
    }

    public static int buscaBinariaR(int[] array, int inicio, int fim, int N) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (array[meio] == N) {
            return meio;  // resultado
        } else if (array[meio] < N) {
            return buscaBinariaR(array, meio + 1, fim, N);  //direita
        } else {
            return buscaBinariaR(array, inicio, meio - 1, N);  //esquerda
        }
    }
}
