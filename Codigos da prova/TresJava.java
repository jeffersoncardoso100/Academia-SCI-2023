package Academia_dev;

import java.util.Scanner;
  
public class TresJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nomeAluno;
		double nota1, nota2, nota3, nota4;

		// O loop s� ira parar se o usuario deseja 'sair'.

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

				// calcula a m�dia das notas e a armazena em uma vari�vel double chamada
				// "media".
				double media = (nota1 + nota2 + nota3 + nota4) / 4;
				// opera��o ternaria para simplificar o codigo
				String situacao = (media >= 6) ? "*   Aprovado   *" : "*   Reprovado   *";
				System.out.printf("\nO aluno %s teve m�dia de: %.2f.\n  %s%n", nomeAluno, media, situacao);

				// captura a exce��o "NumberFormatException" e imprime uma mensagem de erro.

			} catch (NumberFormatException e) {
				System.out.println("Erro: Entrada inv�lida! Certifique-se de digitar apenas n�meros para as notas.");
			}
		}

		scanner.close();
	}
}
