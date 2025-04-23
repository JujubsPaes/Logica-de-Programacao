public class Main {
    public static void main(String[] args) {

        for(int i=1; i<11; i++){ // ou i<11 (o numero cima do que gostaria de chegar) ou i<=10
            for(int j=0; j<11; j++)
                System.out.println(i + " x " + j + " = " + (i*j) );
            System.out.println("------------------");
        }
    }
}