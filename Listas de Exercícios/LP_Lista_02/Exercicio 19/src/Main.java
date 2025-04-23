import java.util.Scanner; //* no lugar do Scanner, puxa todas as pastas que tem no util


public class Main {
    public static void main(String[] args) {
        double A, B, C, S1, S2, Delta;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os valores de A, B e C, separados por espaço: ");
        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();

        Delta = Math.pow(B,2)-4*A*C;
        S1 = (-B+Math.sqrt(Delta))/2*A;
        S2 = (-B-Math.sqrt(Delta))/2*A;

        System.out.println(A+ S2+"x² + " + B+"x + "+ C+" = 0");
        System.out.println("x1 = "+ S1 +"x2 = "+ S2);
    }
}