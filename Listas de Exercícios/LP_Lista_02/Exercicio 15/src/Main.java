import java.util.Scanner; //* no lugar do Scanner, puxa todas as pastas que tem no util


public class Main {
    public static void main(String[] args){
        double R, A, Area, V;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio da base do cilindro: ");
        R = in.nextDouble();

        Area = Math.PI * Math.pow(R,2);

        System.out.println("Digite a altura do cilindro: ");
        A = in.nextDouble();

        V = Area * A;
        System.out.println("Volume: " + V);
    }
}