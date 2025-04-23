import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("------------------" +
                "\n MENU" +
                "\n________" +
                "\n1." +
                "\n2." +
                "\n3." +
                "\n4." +
                "\n5." +
                "\n6." +
                "\n7." +
                "\n8." +
                "\n9." +
                "\n--------");
        System.out.println("Escolha uma opção" +
                "\n--------------------");

        option = in.nextInt();

        switch (option){
            case 1:
                System.out.println("Valido");
                break;
            case 2:
                System.out.println("Valido");
                break;
            case 3:
                System.out.println("Valido");
                break;
            case 4:
                System.out.println("Valido");
                break;
            case 5:
                System.out.println("Valido");
                break;
            case 6:
                System.out.println("Valido");
                break;
            case 7:
                System.out.println("Valido");
                break;
            case 8:
                System.out.println("Valido");
                break;
            case 9:
                System.out.println("Valido");
                break;

            default:
                System.out.println("Opção Invalida");
        }

    }
}