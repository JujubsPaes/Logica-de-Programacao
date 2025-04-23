import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        number = in.nextInt();

        //for(declar_var_ctrl ; teste_logico ; inc)
        for(int i=0; i<=10; i++){ //se quiser ir de 2 em 2 só mudar o "i++" para i+=2 (ou qualquer valor)
            System.out.println(number + " x " + i + "= " + (i*number) );
        }

    }
}