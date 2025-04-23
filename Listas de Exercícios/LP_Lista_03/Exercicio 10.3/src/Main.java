import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite três números separados por espaço: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if(n1>n2){
            if(n1>n3){
                if(n2>n3)
                    System.out.println("A ordem crescente é: " + n3 + ", " + n2 + ", " + n1);
                else
                    System.out.println("A ordem crescente é: " + n2 + ", " + n3 + ", " + n1);
            }else{
                System.out.println("A ordem crescente é: " + n2 + ", " + n1 + ", " + n3);
            }
        }else{
            if(n2>n3){
                if(n3>n1)
                    System.out.println("A ordem crescente é: " + n1 + ", " + n3 + ", " + n2);
                else
                    System.out.println("A ordem crescente é: " + n3 + ", " + n1 + ", " + n2);
            }else{
                System.out.println("A ordem crescente é: " + n1 + ", " + n2 + ", " + n3);
            }

        }
    }

}