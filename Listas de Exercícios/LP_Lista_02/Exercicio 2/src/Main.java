import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Digite um número inteiro: ");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        result = number * number;
        System.out.println("O quadrado de " + number + "é igual a: " + result);
    }
}

