public class Main {
    public static void main(String[] args) {
        // declaração sem inicialização
        int [] vetor = new int [5];

        // declaração com inicialização
        int [] numbers = {2, 5, 4, 7, 9};

        //vetor [0] = 100;
        //vetor [1] = 50;
        System.out.println(numbers[3]);
        System.out.println(numbers.length);

        // printar todos os valores de numbers (ordenados pelo indice)
        for (int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // foreach (ou for enhenced)
        for (int n:numbers)
            System.out.println(n);

        // declaração com inicialização
        int [][] matriz = {{1,3},
                           {4,6},
                           {7,9}};

        System.out.println(matriz[0].length); //matriz[0].length ele exibe a quantidade de colunas
        // matriz.length aparece o número de linhas

        // printar todos os valores da matriz

        System.out.println(matriz[0].length);
        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][1]);
        System.out.println(matriz[1][0]);
        System.out.println(matriz[1][1]);
        System.out.println(matriz[2][0]);
        System.out.println(matriz[2][1]);

        //ou

        for (int i=0; i<matriz.length;i++){
            for (int j=0; j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        //ou

        for (int []linha:matriz){
            
        }
    }
}