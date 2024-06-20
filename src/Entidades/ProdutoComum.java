package Entidades;

import java.sql.Date;

public class ProdutoComum extends Produto{

	public ProdutoComum(String nome, int quantidade, int tipo, float valor, String dataValidade) {
		super(nome, quantidade, tipo, valor, dataValidade);
		
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O produto cadastrado é: " + getTipo());
	}
}
