import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        int N, result = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        N = in.nextInt();

        if(N > 0){
            for(int i=1; i<=N; i++) {
                result += i;
                System.out.print(result + " ");
            }
        }else{
            System.out.println("O número digitado deve ser maior que 0!");
            }
    }
}
