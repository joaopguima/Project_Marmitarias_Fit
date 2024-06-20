package Entidades;

import java.sql.Date;

public class ProdutoFitness extends Produto{

	public ProdutoFitness(String nome, int quantidade, int tipo, float valor, String dataValidade) {
		super(nome, quantidade, tipo, valor, dataValidade);
		
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("O produto cadastrado é: " + getTipo());
	}

}
