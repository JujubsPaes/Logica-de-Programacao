import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio, areaC, periC, areaT, h, periT, areaR, periR;
        int option, base, altura, baseR, alturaR;

        Scanner in = new Scanner(System.in);

        System.out.println("-------------------------- \n" +
                "\nMenu: " +
                "\n1. Circulo " +
                "\n2. Triângulo Retângulo " +
                "\n3. Retângulo " +
                "\n------------------------" +
                "\nEscolha uma opção: ");
        option = in.nextInt();

        switch (option){

            case 1:
                System.out.println("Informe o raio do circulo: ");
                raio = in.nextDouble();
                areaC = Math.PI * raio * raio;
                periC = 2 * Math.PI * raio;
                System.out.println("Área = "+ areaC);
                System.out.println("Perímetro = "+ periC);
                break;

            case 2:
                System.out.println("Informe a base: ");
                base = in.nextInt();
                System.out.println("Informe a altura: ");
                altura = in.nextInt();
                areaT = (base * altura)/2;
                h = Math.sqrt(base * base + altura * altura);
                periT = base + altura + h;
                System.out.println("Área = "+ areaT);
                System.out.println("Perímetro = "+ periT);
                break;

            case 3:
                System.out.println("Informe a base: ");
                baseR = in.nextInt();
                System.out.println("Informe a altura: ");
                alturaR = in.nextInt();
                areaR = baseR * alturaR;
                periR = 2 * (baseR + alturaR);
                System.out.println("Área = "+ areaR);
                System.out.println("Perímetro = "+ periR);
                break;

            default:
                System.out.println("Opção invalida!");
        }
    }
}