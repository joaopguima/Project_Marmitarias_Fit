package Aplicação;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entidades.Cores;
import Entidades.Opcoes;
import Entidades.ProdutoFitness;

public class Menu extends Opcoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int opcao, tipo, quantidade;
		String nome;
		float valor;
		String dataValidade;

		while (true) {

			MenuMarmitaria();

			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Digite valores inteiros!");
				sc.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\nMarmitarias JP o lugar ideal para pedir sua comida!\n");
				Sobre();
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				
				keyPress();
				break;
			case 2:
				keyPress();
				break;
			case 3:
				keyPress();
				break;
			case 4:
				keyPress();
				break;
			case 5:
				
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida\n");
				keyPress();
				break;
			}

		}

	}

}
