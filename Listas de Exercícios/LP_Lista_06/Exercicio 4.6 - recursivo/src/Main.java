import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra ou uma frase: ");
        word = in.next();

        if (ehPalindromo(word))
            System.out.println("É palindromo!");
        else
            System.out.println("Não é palindromo");
    }

    public static boolean ehPalindromo(String word){
        return ehPalindromoRec(word, 0, word.length() - 1);

        }

    public static boolean ehPalindromoRec(String word, int i, int j) {
        if (i >= j) {
            return true;
        }

        if (word.charAt(i) != word.charAt(j)) {
            return false;
        }

        return ehPalindromoRec(word, i + 1, j - 1);
    }
}
