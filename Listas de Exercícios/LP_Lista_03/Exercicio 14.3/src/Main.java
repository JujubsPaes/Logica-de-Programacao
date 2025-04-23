import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value, total;
        int option, installment;

    Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor da compra: ");
        value = in.nextDouble();

        System.out.println("-------------------------- \n" +
                           "\nMenu: " +
                           "\n1. Débito " +
                           "\n2. Credito " +
                           "\n3.Pix " +
                           "\n------------------------" +
                           "Escolha a forma de pagamento: ");
        option = in.nextInt();

        switch (option){
            case 1:
                total = value * 0.95;
                System.out.println("Debito selecionado.");
                System.out.println("Valor da compra: " + value + "\nDesconto: " +(value-total) );
                System.out.println("Valor final da compra: " + total);
                break;
            case 2:
                System.out.println("Credito selecionado.");
                System.out.println("Informe a quantidade de parcelas (max 10x): ");
                installment = in.nextInt();

                if(installment>10 || installment<=0){
                    System.out.println("Quantidade de parcelas inválida.");
                    break;
                }

                if(installment<=4){
                    total = value * 1.02;
                    System.out.println("Quantidade de parcelas = " + installment);
                    System.out.println("Taxa: " + (value*0.02) );
                    System.out.println("Valor final da compra: " + total);
                    break;
                }

                total = value * 1.05;
                System.out.println("Quantidade de parcelas = " + installment);
                System.out.println("Taxa: " + (value*0.05) );
                System.out.println("Valor final da compra: " + total);
                break;
            case 3:
                total = value * 0.9;
                System.out.println("Pix selecionado.");
                System.out.println("Valor da compra: " + value + "Desconto: " + (value*0.1));
                System.out.println("Valor final da compra: " + total);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}