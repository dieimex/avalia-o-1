import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Quantas notas o aluno terá? ");
        int quantidadeNotas = scanner.nextInt();

        double[] notas = new double[quantidadeNotas];
        double soma = 0;

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / quantidadeNotas;

        System.out.println("\nAluno: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }

        scanner.close();
    }
}
