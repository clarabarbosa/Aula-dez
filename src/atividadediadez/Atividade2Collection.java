package atividadediadez;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade2Collection {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Set<Integer> setnumero = new HashSet<Integer>();

		System.out.println("Digite os números inteiros, sem repeti - los: ");

		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("Insira o " + contador + "º número: ");
			Integer numero = leia.nextInt();

			setnumero.add(numero);
		}
		System.out.println("\nLista dos números: ");
		for (Integer numero : setnumero) {
			System.out.println(numero);
		}

	}

}
