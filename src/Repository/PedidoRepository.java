package Repository;

public interface PedidoRepository {

	// CRUD do pedido
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrar();
	public void atualizar();
	public void deletar(int numero);
}
