import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, number2, n3;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite três números separados por espaço.");
        n1 = in.nextInt();
        number2 = in.nextInt();
        n3 = in.nextInt();

        if (n1 == number2 && number2 == n3){
            System.out.println("Triângulo equilátero");

        }else if (n1 == number2 || number2 == n3 || n1 == n3){
            System.out.println("Triângulo isósceles");

        }else
            System.out.println("Triângulo escaleno");
        }
}