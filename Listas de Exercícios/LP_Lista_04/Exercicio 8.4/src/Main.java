import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = in.nextInt();


        c = 0;

        if (n <= 1){
            System.out.println(n +" não é um número primo.");
        }else{
            for (int i = 1; i <= n ; i++){
                if (n % i == 0){
                    c++;
                }
            }

            if (c == 2){
                System.out.println(n + " é um número primo.");
            }else{
                System.out.println(n+ " não é um número primo.");
            }
        }
    }
}