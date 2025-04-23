import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double C, F;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        C = in.nextDouble();

        F = C *100/100 + 32;
        System.out.println(C + "°C = "+ F + "°F");
    }
}