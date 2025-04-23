import java.util.Scanner; //* no lugar do Scanner, puxa todas as pastas que tem no util

public class Main {
    public static void main(String[] args) {
        double R, A;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio de um circulo: ");
        R = in.nextDouble();


        A = Math.PI * Math.pow(R,2);
        System.out.println("A area do circulo é: "+ A);

        //System.out.println("Digite o diametro de um circulo: "); para descobrir a Area atravez do diametro
       // diameter = in.nextDouble();
        //A = Math.PI, Math.pow(diameter/2,2);
        //A = Math.PI * Math.pow(diameter,2)/4;
        // OU
        //R = diameter/2;
        //A = Math.PI * Math.pow(R,2);
    }
}