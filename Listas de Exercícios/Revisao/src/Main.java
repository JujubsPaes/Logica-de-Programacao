import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a=10;
        double b=2.9;

        b= a+b;

        System.out.println(b);

        // a - 10
        // b - 2.9
        // c - 12.9 -- questão correta, pois como a estrutura é menor, ele converte automaticamente para double (promoção automática)
        // d - erro de compilação
        // e - exception

       // public class Main {
       /*     public static void main(String[] args) {
                int a=10;
                double b=2.9;

                a = a+b;

                System.out.println(a);

                // a - 10
                // b - 2.9
                // c - 12.9
                // d - erro de compilação -- opção correta
                // e - exception

                public class Main {
                    public static void main(String[] args) {
                        int a=10;
                        double b=2.9;

                        b= a+ (int)b;

                        System.out.println(b);

                        // a - 12 -- opção correta
                        // b - 2.9
                        // c - 12.9
                        // d - erro de compilação
                        // e - exception
*/
    }
}