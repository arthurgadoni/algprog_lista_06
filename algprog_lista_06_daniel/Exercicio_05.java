import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];

        int quantidade_par = 0;
        int quantidade_impar = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Diga o " + (i + 1) + "º numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                par[quantidade_par] = numeros[i];
                quantidade_par++;
            } else {
                impar[quantidade_impar] = numeros[i];
                quantidade_impar++;
            }
        }

        System.out.println("\nVetor original:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nNumeros pares:");
        for (int i = 0; i < quantidade_par; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\n\nNumeros ímpares:");
        for (int i = 0; i < quantidade_impar; i++) {
            System.out.print(impar[i] + " ");
        }

        sc.close();
    }
}