package Academia_dev; 
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UmJava {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<Integer>();
		System.out.println(" Você deverá inserir 5 números, para o programa definir os números pares e impares.\n");
		// Solicita a inclusão dos números
		for (int i = 1; i <= 5; i++) {
			System.out.print("Informe o " + i + "º número: ");

			try {
				int num = scanner.nextInt();
				numeros.add(num);
			} catch (InputMismatchException e) {
				System.out.println("Erro: você deve informar um número inteiro. Tente novamente.");
				scanner.nextLine(); // Limpa o buffer do scanner 
				i--; // Repete a solicitação do mesmo 
			}
		}

		// Função que define números pares e ímpares usando 'streams'
		List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

		// Calcula a média geral
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		double media = (double) soma / numeros.size();

		// Imprime os resultados
		System.out.println("\nOs números pares são: " + pares);
		System.out.println("Os números ímpares são: " + impares);
		System.out.printf("A média geral é: %.2f", media);

		scanner.close();
	}
}

