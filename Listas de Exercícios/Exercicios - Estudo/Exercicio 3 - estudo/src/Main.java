import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] vetor = {2,4,3,1,9,5,8};

        Arrays.sort(vetor); // Coloca ordem no vetor
        for(int i:vetor ) { // for it (simplifica para essa situação)
            System.out.print(i + " ");

        }
    }
}