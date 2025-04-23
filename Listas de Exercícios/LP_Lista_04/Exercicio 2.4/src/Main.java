import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, maior, menor;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        number = in.nextInt();

        maior = number;
        menor = number;

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            number = in.nextInt();

            if (number > maior) {
                maior = number;
            }

            if (number < menor) {
                menor = number;
            }
        }

        System.out.println("\nMaior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
    }
}