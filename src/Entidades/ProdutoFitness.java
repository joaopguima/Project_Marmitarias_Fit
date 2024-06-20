package Entidades;

import java.sql.Date;

public class ProdutoFitness extends Produto{
	
	private String tipo;
	
	public ProdutoFitness(String nome, int quantidade, float valor, Date dataValidade) {
		super(nome, quantidade, valor, dataValidade);
		this.tipo = tipo;
	}
	

}
