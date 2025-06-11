import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número que deseja ter a tabuada: ");
        number = in.nextInt();

        for(int i=0; i<=10; i++){
            System.out.println(i*number);
        }

    }
}