import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] vetor = {1, 2, 3, 4, 5};
        int aux = 0;

        for (int i = 0; i < vetor.length/2; i++){
            aux = vetor[i];
            vetor[i]=vetor[vetor.length -1 -i];
            vetor[vetor.length - 1 -i] = aux;

           for (int v : vetor) System.out.println(v);

        }
    }
}