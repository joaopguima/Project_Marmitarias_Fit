package Entidades;

import java.sql.Date;

public class ProdutoFitness extends Produto{
	
	public ProdutoFitness(int idProduto, String nome, int quantidade, int tipo, float valor, String dataValidade) {
		super(idProduto, nome, quantidade, tipo, valor, dataValidade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O produto cadastrado é: " + getTipo());
	}

}
