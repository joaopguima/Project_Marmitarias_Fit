package Entidades;

public abstract class Produto {

	private int idProduto;
	private String nome;
	private int quantidade;
	private int tipo;
	private float valor;
	private String dataValidade;

	public Produto(int idProduto, String nome, int quantidade, int tipo, float valor, String dataValidade) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.valor = valor;
		this.dataValidade = dataValidade;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Produto Fitness";
			break;
		case 2:
			tipo = "Produto Comum";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do seu Produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome do Produto: " + nome);
		System.out.println("Tipo do produto: " + tipo);
		System.out.println("Quantidade cadastrada: " + this.quantidade);
		System.out.println("Valor unitário do produto: " + this.valor);
		System.out.println("Data de validade: " + this.dataValidade);
		System.out.println(
				"Total de itens em estoque " + this.quantidade + ", avaliado em R$ " + this.valor * this.quantidade);
	}

}
