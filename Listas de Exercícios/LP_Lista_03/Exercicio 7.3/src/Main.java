import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente a: ");
        a = in.nextDouble();
        System.out.println("Digite o coeficiente b: ");
        b = in.nextDouble();
        System.out.println("Digite o coeficiente c: ");
        c = in.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta > 0) {

            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raizes da equação são x1 = " + x1 + " e x2 = " + x2);
        }else if (delta == 0) {

            double x = -b / (2 * a);
            System.out.println("A equação possui uma única raiz real: x = " + x);
        }else {

            System.out.println("A equação não possui raizes reais.");
        }

        in.close();
    }
}