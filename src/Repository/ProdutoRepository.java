package Repository;

import Entidades.Produto;

public interface ProdutoRepository {

	// CRUD do pedido
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int numero);

}
