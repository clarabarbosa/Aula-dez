package atividadediadez;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1Collection {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Digite as cores: ");

		for (int contador = 1; contador < 6; contador++) {
			System.out.println("Insira a " + contador + "º cor: ");
			String cor = leia.next();

			cores.add(cor);
		}

		System.out.println("\nLista das cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		System.out.println("\nLista ordenada de cores ");
		cores.sort(null);
		for (String cor : cores) {
			System.out.println(cor);
		}

	}

}
