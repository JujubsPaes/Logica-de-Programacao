import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int Linha1, Coluna1;
       int Linha2, Coluna2;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o número de linhas e colunas da primeira matriz(separadas por espaço): ");
        Linha1 = in.nextInt();
        Coluna1 = in.nextInt();

        System.out.println("Informe o número de linhas e colunas da segunda matriz(separadas por espaço): ");
        Linha2 = in.nextInt();
        Coluna2 = in.nextInt();

        if(Coluna1 != Linha2){
            System.out.println("Multiplicação inválida, O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            return;
        }
        int [][] A1 = new int [Linha1][Coluna1];
        System.out.println("Digite os elementos da primeira matriz: ");

        for(int i= 0; i< Linha1; i++){
            for(int j=0; j<Coluna1; j++){
                System.out.println("1[" + i + "][" + j + "]: ");
                A1 [i][j] = in.nextInt();
            }
        }

        int[][] B2 = new int[Linha2][Coluna2];
        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < Linha2; i++) {
            for (int j = 0; j < Coluna2; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B2[i][j] = in.nextInt();
            }
        }
        int[][] Calculo = new int[Linha1][Coluna2];

        for (int i = 0; i < Linha1; i++) {
            for (int j = 0; j < Coluna2; j++) {
                for (int k = 0; k < Coluna1; k++) {
                    Calculo[i][j] += A1[i][k] * B2[k][j];
                }
            }
        }

        System.out.println("Resultado: ");
        for(int i=0; i<Linha1; i++){
            for(int j=0; j < Coluna2; j++){
                System.out.println(Calculo[i][j]+ " ");
            }
        }
        System.out.println();

    }
}