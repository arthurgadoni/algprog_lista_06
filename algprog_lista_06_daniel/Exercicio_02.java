import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("\nNumeros na ordem inversa são");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}