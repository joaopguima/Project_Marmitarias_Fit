package Entidades;

import java.io.IOException;

public class Opcoes {

	public static void MenuMarmitaria() {

		System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
				+ "***********************************************");
		System.out.println("                                               ");
		System.out.println("                   MARMITARIAS JP              ");
		System.out.println("                                               ");
		System.out.println("***********************************************");
		System.out.println("                                               ");
		System.out.println("            1 - Cadastrar Produto              ");
		System.out.println("            2 - Listar todos os Produtos       ");
		System.out.println("            3 - Buscar Produto por Número      ");
		System.out.println("            4 - Atualizar dados do Produto     ");
		System.out.println("            5 - Apagar Produto         	       ");
		System.out.println("            6 - Sair                           ");
		System.out.println("                                               ");
		System.out.println("***********************************************");
		System.out.println("Entre com a opção desejada:                    ");
		System.out.println("                                               " + Cores.TEXT_RESET);
	}

	public static void Sobre() {

		System.out.println("************************************				 ");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("João Pedro Guimarães - joaopedro.jusus@gmail.com");
		System.out.println("https://github.com/joaopguima");
	}
	
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
