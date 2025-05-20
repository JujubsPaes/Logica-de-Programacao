import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] vetor = {2, 4, 6, 8, 0, 1, 3, 5, 7, 9};
        int n;
        //boolean founded = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n = in.nextInt();

        for (int i=0;i<vetor.length;i++){
            if(vetor[i]==n){
                System.out.println(n +" encontrado na posição " + i);
                return; //break
            }
        }

        //if (founded==false)// (!founded)
        System.out.println("Valor não encontrado!");
    }
}