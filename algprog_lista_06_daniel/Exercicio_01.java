import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Diga o " + (i + 1) + "º numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}