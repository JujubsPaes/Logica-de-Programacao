import java.util.Scanner; //* no lugar do Scanner, puxa todas as pastas que tem no util

public class Main {
    public static void main(String[] args) {
        double A, B, S;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do coeficiente angular: ");
        A = in.nextDouble();

        System.out.println("Digite o valor do coeficiente linear");
        B = in.nextDouble();

        System.out.println(A + "x" + "+" + B + "= 0");
        S = B/A;
        System.out.println("X= "+ S);
    }
}