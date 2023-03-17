package Academia_dev;

import java.util.Scanner;
  
public class QuatroJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf(" Insira 5 números para o programa verificar a posição 3 do vetor.");
		System.out.printf("\n\n");

		int[] vetor = new int[5];

		// iterar sobre valor solicitado
		for (int i = 0; i < vetor.length; i++) {
			try {
				System.out.print("Digite um número: ");
				vetor[i] = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Entrada inválida! Certifique-se de digitar apenas números inteiros.");
				scanner.nextLine(); // limpar o buffer do scanner
				i--; // repetir a iteração para o mesmo índice do vetor
			}
		}

		// "O valor da posição três é: [numeros[2]]". Como o índice do vetor começa em 0
		System.out.printf("\nO valor da posição três no vetor é o número " + vetor[2] + ".");

		scanner.close();
	}
}
