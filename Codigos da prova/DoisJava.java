package Academia_dev;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoisJava {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;

		// itera��o dos numeros que serao inseridos
		System.out.println(" Insira 5 n�meros, para o programa contabilizar o n�mero maior e menor deles.");
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			try {
				System.out.print("Digite o " + (i + 1) + "� n�mero:");
				int num = scan.nextInt();
				if (num < menor)
					menor = num;
				if (num > maior)
					maior = num;
			} catch (InputMismatchException e) {
				System.out.println("O valor digitado n�o � um n�mero inteiro. Tente novamente.");
				scan.next(); // limpa o buffer do Scanner
				i--; // Repete a solicita��o do mesmo
			}
		}

		System.out.println("\nO menor n�mero digitado �: " + menor);
		System.out.println("O maior n�mero digitado �: " + maior);
	}

}
