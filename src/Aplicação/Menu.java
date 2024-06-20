package Aplicação;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Opcoes;

public class Menu extends Opcoes{

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		float preco;
						
		while (true) {
			
			MenuMarmitaria();
			
			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				sc.nextLine();
				opcao = 0;
			}
			
			if(opcao == 7) {
				System.out.println("\nMarmitarias Fit o lugar ideal para seguir sua dieta!\n");
				Sobre();
				sc.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:

				break;
			case 2:
				Cardapio();
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;				
			case 6:
				
				break;
			}
			
		}

	}

}
