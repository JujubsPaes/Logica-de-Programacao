import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        number = in.nextInt();

        System.out.println("O dobro do numero digitado é: " + 2 * number);
    }
}