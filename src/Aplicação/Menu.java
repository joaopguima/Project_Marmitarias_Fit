package Aplicação;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import Controller.ProdutoController;
import Entidades.Cores;
import Entidades.Opcoes;
import Entidades.ProdutoComum;
import Entidades.ProdutoFitness;

public class Menu extends Opcoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ProdutoController produto = new ProdutoController();

		int idProduto = 0, opcao, tipo, quantidade;
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
				System.out.println("Cadastrar Item\n\n");

				System.out.printf("Digite a descrição do produto: ");
				sc.nextLine();
				nome = sc.nextLine();

				System.out.printf("Insira a quantidade a ser cadastrada: ");
				quantidade = sc.nextInt();

				do {
					System.out.printf("Digite o Tipo do Produto (1 - Fitness ou 2 - Comum): ");
					tipo = sc.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.printf("Digite o valor unitário do produto: R$");
				valor = sc.nextFloat();

				System.out.printf("Digite a data de validade no formato dd/MM/yyyy: ");
				sc.nextLine();
				dataValidade = sc.nextLine();

				switch (tipo) {
				case 1 -> {
					System.out.println("Adicionando produto Fitness na sua lista!");
					produto.cadastrar(
							new ProdutoFitness(produto.gerarNumero(), nome, quantidade, tipo, valor, dataValidade));
				}
				case 2 -> {
					System.out.println("Adicionando produto Comum na sua lista!");
					produto.cadastrar(
							new ProdutoComum(produto.gerarNumero(), nome, quantidade, tipo, valor, dataValidade));
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os itens cadastrados");
				produto.listarTodos();
				keyPress();
				break;
			case 3:
				System.out.println("Consultar dados do seu Produto - por número\n\n");

				System.out.printf("Digite o id do pedido: ");
				idProduto = sc.nextInt();

				produto.procurarPorNumero(idProduto);
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados do Produto\n\n");
				
				System.out.printf("Digite o id do produto: ");
				idProduto = sc.nextInt();
				
				var buscaLista = produto.buscarNaLista(idProduto);
				
				if(buscaLista != null) {
					
					tipo = buscaLista.getTipo();
					
					System.out.printf("Digite a descrição do Produto: ");
					sc.nextLine();
					nome = sc.nextLine();
					
					System.out.printf("Digite a quantidade: ");
					sc.skip("\\R?");
					quantidade = sc.nextInt();
					
					System.out.printf("Digite o Valor do Produto (R$): ");
					valor = sc.nextFloat();
					
					switch (tipo) {
						case 1 -> {
							System.out.printf("Digite a nova data de validade do produto (no formato dd/MM/yyyy): ");
							sc.nextLine();
							dataValidade = sc.nextLine();
							
							produto.atualizar(new ProdutoFitness(idProduto, nome, quantidade, tipo, valor, dataValidade));
						}
						case 2 -> {
							System.out.printf("Digite a nova data de validade do produto (no formato dd/MM/yyyy): ");
							sc.nextLine();
							dataValidade = sc.nextLine();
							
							produto.atualizar(new ProdutoComum(idProduto, nome, quantidade, tipo, valor, dataValidade));
						}
						default -> {
							System.out.println("Tipo de produto inválido!");
							
						}
					}
				} else {
					System.out.println("O produto não foi encontrado!");
				}
				
				keyPress();
				break;
			case 5:
				System.out.println("Apagar produto\n\n");
				
				System.out.printf("Digite o id do produto: ");
				idProduto = sc.nextInt();
				
				produto.deletar(idProduto);

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
