import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] medias = new double[10];
        int quantidade_aprovados = 0;
        for (int aluno = 0; aluno < 10; aluno++) {
            double soma = 0;

            System.out.println("\n O aluno " + (aluno + 1));
            for (int nota = 0; nota < 4; nota++) {
                System.out.print("Me diz a " + (nota + 1) + "ª nota: ");
                soma += sc.nextDouble();
            }

            medias[aluno] = soma / 4;

            if (medias[aluno] >= 7.0) {
                quantidade_aprovados++;
            }
        }

        System.out.println("\nA media de alunos é quanto? ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }

        System.out.println("\nAlunos com média maior ou igual a 7.0(ou seja G.O.A.T) é de " + quantidade_aprovados);

        sc.close();
    }
}