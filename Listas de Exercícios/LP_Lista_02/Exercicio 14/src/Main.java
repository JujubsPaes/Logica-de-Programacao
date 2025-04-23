import java.util.Scanner; //* no lugar do Scanner, puxa todas as pastas que tem no util

public class Main {
    public static void main(String[] args) {
        double B, A, Area;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base do triangulo retangulo: ");
        B = in.nextDouble();

        System.out.println("Digite a altura do triangulo retangulo: ");
        A = in.nextDouble();

        Area = (A * B)/2;

        System.out.println();


    }
}