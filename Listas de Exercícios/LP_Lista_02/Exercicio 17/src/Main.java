import java.util.Scanner; //* no lugar do Scanner, puxa todas as pastas que tem no util

public class Main {
    public static void main(String[] args) {
        double V0, A, T, VF;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial (m/s): ");
        V0 = in.nextDouble();

        System.out.println("Digite a aceleração (m/s)²: ");
        A = in.nextDouble();

        System.out.println("Digite o tempo (s): ");
        T = in.nextDouble();

        VF = V0 + A * T;

        System.out.println("Velocidade final= " + VF + "m/s");
    }
}