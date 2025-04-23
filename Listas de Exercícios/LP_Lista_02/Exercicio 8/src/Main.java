import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double mm, inch;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma medida em milemetros: ");
        inch = in.nextDouble();

        mm = inch * 25.5;
        System.out.println(inch + "inch = " + mm + "mm");
    }
}