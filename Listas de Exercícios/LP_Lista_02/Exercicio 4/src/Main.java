import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double note1, note2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        note1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        note2 = in.nextDouble();

        mean = (note1 + note2)/2;
        System.out.println("A média é: " + mean);
    }
}