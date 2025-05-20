import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, m;

        Scanner in = new Scanner(System.in);

        for (int i=0; i < 40; i++){
            System.out.println("Aluno " + (i+1));

            System.out.println("Digite as duas notas do aluno: ");
            n1 = in.nextDouble();
            n2 = in.nextDouble();

            m = m(n1, n2);
            System.out.println("Média = " + m);
        }
    }

        public static double m(double n1, double n2){

        return (n1+n2)/2;

    }
}