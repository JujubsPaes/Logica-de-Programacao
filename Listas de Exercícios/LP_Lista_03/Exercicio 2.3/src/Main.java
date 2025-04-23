import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois números inteiros separados por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        if (n1>n2)
            System.out.println(n1 + " > "+ n2);
        else if (n1<n2)
            System.out.println(n1+" < "+ n2);
        else
            System.out.println(n1 +" = "+ n2);

    }
}