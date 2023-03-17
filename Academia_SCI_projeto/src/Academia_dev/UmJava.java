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
		System.out.println(" Voc� dever� inserir 5 n�meros, para o programa definir os n�meros pares e impares.\n");
		// Solicita a inclus�o dos n�meros
		for (int i = 1; i <= 5; i++) {
			System.out.print("Informe o " + i + "� n�mero: ");

			try {
				int num = scanner.nextInt();
				numeros.add(num);
			} catch (InputMismatchException e) {
				System.out.println("Erro: voc� deve informar um n�mero inteiro. Tente novamente.");
				scanner.nextLine(); // Limpa o buffer do scanner 
				i--; // Repete a solicita��o do mesmo 
			}
		}

		// Fun��o que define n�meros pares e �mpares usando 'streams'
		List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

		// Calcula a m�dia geral
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		double media = (double) soma / numeros.size();

		// Imprime os resultados
		System.out.println("\nOs n�meros pares s�o: " + pares);
		System.out.println("Os n�meros �mpares s�o: " + impares);
		System.out.printf("A m�dia geral �: %.2f", media);

		scanner.close();
	}
}

