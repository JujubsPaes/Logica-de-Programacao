import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int JN, perdeu, R;
        Scanner scanner = new Scanner(System.in);

        JN = 1;

        while (JN == 1) {
            perdeu = 0;

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(i + " x " + j + " = ");
                    R = scanner.nextInt();

                    if (R != (i * j)) {
                        System.out.println("Errado! A resposta certa era " + (i * j) + ".");
                        perdeu = 1;
                        break;
                    }
                }

                if (perdeu == 1) {
                    break;
                }
            }

            if (perdeu == 0) {
                System.out.println("Parabéns! Você completou toda a tabuada sem errar!");
            } else {
                System.out.println("Você perdeu!");
            }

            System.out.print("Deseja jogar novamente? (1 = Sim | 0 = Não): ");
            JN = scanner.nextInt();
        }

        System.out.println("Obrigado por jogar! Até a próxima!");
        scanner.close();
    }
}