package Entidades;

public class Opcoes {

	public static void MenuMarmitaria() {

		System.out.println(Cores.TEXT_CYAN_BOLD + Cores.ANSI_BLACK_BACKGROUND
				+ "*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                   MARMITARIAS FITS                  ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Fazer Pedido                         ");
		System.out.println("            2 - Verificar Cardápio                   ");
		System.out.println("            3 - Exibir sua lista de pedidos          ");
		System.out.println("            4 - Adicionar item a lista               ");
		System.out.println("            5 - Deletar item da lista	             ");
		System.out.println("            6 - Cancelar pedido                      ");
		System.out.println("            7 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     " + Cores.TEXT_RESET);
	}

	public static void Cardapio() {

		System.out.println("                                                     ");
		System.out.println("                   CARDÁPIO		                     ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("1 - Arroz 150gr, Frango Grelhado 120gr   			 ");
		System.out.println("2 - Purê de Mandioquinha 200gr, Carne moída 100gr    ");
		System.out.println("3 - Arroz 150gr, Carne moída 120gr				     ");
		System.out.println("4 - Purê de Mandioquinha 200gr, Frango Grelhado 100gr");
		System.out.println("3 - Arroz 150gr, Filé de Tilapia 120gr			     ");
		System.out.println("4 - Purê de Mandioquinha 200gr, Filé de Tilápia 100gr");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
	}

	public static void Sobre() {

		System.out.println("************************************				 ");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("João Pedro Guimarães - joaopedro.jusus@gmail.com");
		System.out.println("https://github.com/joaopguima");
	}

}
