import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor, troco;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o dinheiro: ");
        valor = in.nextDouble();

        System.out.println("------------------------------\n" +
                "    Menu:\n" +
                "        1. Café Expresso R$ 0,50\n" +
                "        2. Café Longo R$ 1,00\n" +
                "        3. Capuccino R$ 2,50\n" +
                "        4. Chocolate R$ 2,00\n" +
                "    ------------------------------\n" +
                "    Escolha uma opção: \n" +
                "    ------------------------------");
        option = in.nextInt();

        switch (option){

            case 1:
                troco = valor - 0.50;
                System.out.println("Bebida selecionada: Café Expresso");
                System.out.println("Seu troco: " + troco);
                break;

            case 2:
                troco = valor - 1.00;
                System.out.println("Bebida selecionada: Café Longo");
                System.out.println("Seu troco: " + troco);
                break;

            case 3:
                troco = valor - 2.50;
                System.out.println("Bebida selecionada: Capuccino");
                System.out.println("Seu troco" + troco);
                break;

            case 4:
                troco = valor - 2.00;
                System.out.println("Bebida selecionada: Chocolate");
                System.out.println("Seu troco: " + troco);
                break;
        }
    }
}