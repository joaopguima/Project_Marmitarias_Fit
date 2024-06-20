package Controller;

import java.util.ArrayList;
import Entidades.Produto;
import Repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var produtos = buscarNaLista(numero);

		if (produtos != null) {
			produtos.visualizar();
		} else {
			System.out.println("\nO produto " + produtos + " não foi encontrado!");
		}
	}

	@Override
	public void listarTodos() {
		for (var produtos : listaProdutos) {
			produtos.visualizar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto: " + produto.getIdProduto() + " foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaLista = buscarNaLista(numero);
		
		if(buscaLista != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaLista), produto);
			System.out.println("\nO Produto número: " + produto.getIdProduto() + " foi atualizado com sucesso");
		} else {
			System.out.println("\nO Produto número: " + produto.getIdProduto() + " não foi encontrado");
		}
	}

	@Override
	public void deletar(int idProduto) {
		var produtos = buscarNaLista(idProduto);
		
		if(produtos != null) {
			if(listaProdutos.remove(produtos) == true) {
				System.out.println("\nO produto numero: " + idProduto + " foi deletado com sucesso!");
			} else {
				System.out.println("\nO produto numero: " + idProduto + " não foi encontrado!");
			}
		}
	}

	public int gerarNumero() {
		return ++numero;
	}

	public Produto buscarNaLista(int idProduto) {
		for (var produtos : listaProdutos) {
			if (produtos.getIdProduto() == idProduto) {
				return produtos;
			}
		}
		return null;
	}

}
