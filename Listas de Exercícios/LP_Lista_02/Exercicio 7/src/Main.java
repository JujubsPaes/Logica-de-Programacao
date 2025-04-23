import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double mm, inch;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma medida em milemetros: ");
        mm = in.nextDouble();

        inch = mm / 25.5;
        System.out.println(mm + "mm = " + inch + "inch");
    }
}