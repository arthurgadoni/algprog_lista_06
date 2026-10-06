import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;
        double media;
        for (int i = 0; i < 4; i++) {
            System.out.print("Diga-me o " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        media = soma / 4;

        System.out.println("\nNotas:");
        for (int i = 0; i < 4; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("Media: " + media);

        sc.close();
    }

}