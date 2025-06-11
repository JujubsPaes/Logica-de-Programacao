public class Main {
    public static void main(String[] args) {
        int[][] v1 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] v2 = {
                {7, 8},
                {9, 10}
        };

        int[][] Calculo = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    Calculo[i][j] += v1[i][k] * v2[k][j];
                }
            }
        }

        System.out.println("Calculo das Matrizes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(Calculo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
