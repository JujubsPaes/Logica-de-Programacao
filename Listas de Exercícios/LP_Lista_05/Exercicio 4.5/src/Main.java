import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = new int [10];
        int major=Integer.MIN_VALUE, minor=Integer.MAX_VALUE, minorIndex = 1, majorIndex = -1;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros separados por espaço");

        for (int i=0;i<array.length;i++)
            array[i] = in.nextInt();

        for (int i=0;i<array.length;i++){
            if(array[i]>major){
                major = array[i];
                majorIndex = i;
            }

            if (array[i]<minor){
                minor = array[i];
                minorIndex = 1;
            }
        }

        System.out.println("Maior valor = " + major + " Posição = " + majorIndex);
        System.out.println("Menor valor = " + minor + " Posição = " + minorIndex);
    }
}