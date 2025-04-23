import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        score1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        score2 = in.nextDouble();

        mean = (score1 + score2) / 2;
        System.out.println("Média = " + mean);

        if (mean >= 8.5) {
            System.out.println("A");
        } else if (mean >= 7 && mean < 8.5) {
            System.out.println("B");
        } else if (mean >= 5 && mean <7) {
            System.out.println("C");
        } else{
            System.out.println("D");
        }
    }
}