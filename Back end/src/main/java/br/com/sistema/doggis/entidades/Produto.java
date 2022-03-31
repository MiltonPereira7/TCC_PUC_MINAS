package br.com.sistema.doggis.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto extends Item{
	private int quantidadeEstoque;
	@Column(length=50)
	private String fabricante;
	@Column(length=150)
	private String especificacoes;
	
	public Produto(int quantidadeEstoque, String fabricante, String especificacoes) {
		super();
		this.quantidadeEstoque = quantidadeEstoque;
		this.fabricante = fabricante;
		this.especificacoes = especificacoes;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	}

}
