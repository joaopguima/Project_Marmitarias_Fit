package Entidades;

import java.io.IOException;

public class Opcoes {

	public static void MenuMarmitaria() {

		System.out.println(Cores.TEXT_CYAN_BOLD + Cores.ANSI_BLACK_BACKGROUND
				+ "***********************************************");
		System.out.println("                                               ");
		System.out.println("                   MARMITARIAS JP              ");
		System.out.println("                                               ");
		System.out.println("***********************************************");
		System.out.println("                                               ");
		System.out.println("            1 - Cadastrar Item                 ");
		System.out.println("            2 - Listar todos os Itens          ");
		System.out.println("            3 - Buscar Item por Número	       ");
		System.out.println("            4 - Atualizar dados do Item	       ");
		System.out.println("            5 - Apagar item         	       ");
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
