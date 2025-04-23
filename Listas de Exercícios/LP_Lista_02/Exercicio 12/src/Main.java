import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double N1, N2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        N1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        N2 = in.nextDouble();

        mean = (N1 + N2 * 2)/3;
        System.out.println("A média é: " + mean);

    }
}