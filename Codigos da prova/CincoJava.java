package Academia_dev;
import java.util.Scanner;
public class CincoJava {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		String[] nomes = new String[3];
		double[][] notas = new double[3][4];

		double maiorMedia = 0;
		double menorMedia = Double.MAX_VALUE;
		String nomeMaiorMedia = "";
		String nomeMenorMedia = "";
		System.out.println("");
		// Solicitação dos nomes e das notas
		for (int i = 0; i < nomes.length; i++) {
			System.out.printf(" Digite o nome do %dº aluno: ", i + 1);
			nomes[i] = scanner.nextLine();

			for (int j = 0; j < notas[i].length; j++) {
				while (true) {
					try {
						System.out.printf("Digite a %dª nota do aluno %s: ", j + 1, nomes[i]);
						notas[i][j] = Double.parseDouble(scanner.nextLine());
						break; // sair do loop while se a entrada for válida
					} catch (NumberFormatException e) {
						System.out.println("Entrada inválida! Certifique-se de digitar apenas números.");
					}
				}
			}
		}
		// Impressão dos nomes e médias
		for (int i = 0; i < nomes.length; i++) {
			double mediaAluno = 0;

			for (int j = 0; j < notas[i].length; j++) {
				mediaAluno += notas[i][j];
			}

			mediaAluno /= notas[i].length;

			System.out.printf("\n O aluno %s teve média de %.2f.", nomes[i], mediaAluno);

			// Verificação do maior e menor média
			if (mediaAluno > maiorMedia) {
				maiorMedia = mediaAluno;
				nomeMaiorMedia = nomes[i];
			}

			if (mediaAluno < menorMedia) {
				menorMedia = mediaAluno;
				nomeMenorMedia = nomes[i];
			}
		}
		System.out.println("\n");

		// Impressão do aluno com a maior média
		System.out.printf(" O aluno com a maior média foi %s, com média de %.2f.\n", nomeMaiorMedia, maiorMedia);

		// Impressão do aluno com a menor média
		System.out.printf(" O aluno com a menor média foi %s, com média de %.2f.\n", nomeMenorMedia, menorMedia);

	}
}


