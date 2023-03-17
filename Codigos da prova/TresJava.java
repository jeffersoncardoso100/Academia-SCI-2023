package Academia_dev;

import java.util.Scanner;
  
public class TresJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nomeAluno;
		double nota1, nota2, nota3, nota4;

		// O loop só ira parar se o usuario deseja 'sair'.

		while (true) {
			try {
				System.out.println("\n*** Digite o nome do aluno***:" + "\nOu digite 'sair' para encerrar: ");
				nomeAluno = scanner.nextLine();

				if (nomeAluno.equalsIgnoreCase("sair")) {
					System.out.println("Programa encerrado...");
					break;
				}
				System.out.print("\n");
				System.out.print("Digite a primeira nota do aluno: ");
				nota1 = Double.parseDouble(scanner.nextLine());

				System.out.print("Digite a segunda nota do aluno: ");
				nota2 = Double.parseDouble(scanner.nextLine());

				System.out.print("Digite a terceira nota do aluno: ");
				nota3 = Double.parseDouble(scanner.nextLine());

				System.out.print("Digite a quarta nota do aluno: ");
				nota4 = Double.parseDouble(scanner.nextLine());

				// calcula a média das notas e a armazena em uma variável double chamada
				// "media".
				double media = (nota1 + nota2 + nota3 + nota4) / 4;
				// operação ternaria para simplificar o codigo
				String situacao = (media >= 6) ? "*   Aprovado   *" : "*   Reprovado   *";
				System.out.printf("\nO aluno %s teve média de: %.2f.\n  %s%n", nomeAluno, media, situacao);

				// captura a exceção "NumberFormatException" e imprime uma mensagem de erro.

			} catch (NumberFormatException e) {
				System.out.println("Erro: Entrada inválida! Certifique-se de digitar apenas números para as notas.");
			}
		}

		scanner.close();
	}
}
