import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double km, miles;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma distancia em quilômetros: ");
        miles = in.nextDouble();

        km = miles * 1.6;
        System.out.println(miles + "milhas = "+ km + "km");
    }
}