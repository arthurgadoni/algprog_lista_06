import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = new char[10];
        int quantidade_consoantes = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Diga-me o " + (i + 1) + "º caractere: ");
            letras[i] = sc.next().toLowerCase().charAt(0);
        }

        System.out.println("\nConsoantes são");

        for (int i = 0; i < 10; i++) {
            char letra = letras[i];

            if (Character.isLetter(letra) &&
                letra != 'a' &&
                letra != 'e' &&
                letra != 'i' &&
                letra != 'o' &&
                letra != 'u') {

                System.out.print(letra + " ");
                quantidade_consoantes++;
            }
        }

        System.out.println("\nQuantidade de consoantes é de " + quantidade_consoantes);

        sc.close();
    }
}