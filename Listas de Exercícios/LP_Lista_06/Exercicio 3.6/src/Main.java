import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base (valor inteiro): ");
        x = in.nextInt();

        do{
            System.out.println("Digite o expoente (valor inteiro maior ou igual a zero): ");
            y = in.nextInt();
        }while (y<0);
        System.out.println(x + "^" + y + " = " + pow(x,y));
    }

    public static int pow(int x, int y){
        int result =1;

        for(int i = 0; i<y; i++){
            result *= x;
        }
        return result;
    }
}