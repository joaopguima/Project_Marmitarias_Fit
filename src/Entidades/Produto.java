package Entidades;

import java.sql.Date;

public abstract class Produto {
	
	private String nome;
	private int quantidade;
	private float valor;
	private Date dataValidade;
	
	public Produto(String nome, int quantidade, float valor, Date dataValidade) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.dataValidade = dataValidade;
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

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	
	

}
