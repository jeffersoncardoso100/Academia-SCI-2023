package Academia_dev;

import java.util.Scanner;
  
public class QuatroJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf(" Insira 5 n�meros para o programa verificar a posi��o 3 do vetor.");
		System.out.printf("\n\n");

		int[] vetor = new int[5];

		// iterar sobre valor solicitado
		for (int i = 0; i < vetor.length; i++) {
			try {
				System.out.print("Digite um n�mero: ");
				vetor[i] = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Entrada inv�lida! Certifique-se de digitar apenas n�meros inteiros.");
				scanner.nextLine(); // limpar o buffer do scanner
				i--; // repetir a itera��o para o mesmo �ndice do vetor
			}
		}

		// "O valor da posi��o tr�s �: [numeros[2]]". Como o �ndice do vetor come�a em 0
		System.out.printf("\nO valor da posi��o tr�s no vetor � o n�mero " + vetor[2] + ".");

		scanner.close();
	}
}
