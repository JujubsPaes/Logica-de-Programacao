import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] vetor = {2,4,3,1,9,5,8};
        for(int v:vetor){
            System.out.print(v + " ");
        }
        System.out.println(" ");
        int p = Arrays.binarySearch(vetor, 1); // encontra a posição que eu desejar saber
        System.out.print("Encontrei o valor na posição " + p);

    }
}