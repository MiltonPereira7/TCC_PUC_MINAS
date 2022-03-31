package br.com.sistema.doggis.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.sistema.doggis.enumeradores.TipoProfissional;

@Entity
@Table(name = "servico")
public class Servico extends Item {
	@Column(length=30)
	private String tempoEstimado;
	@Column(length=500)
	private String produtosUtilizados;
	@Column(length=30)
	@Enumerated(EnumType.STRING)
	private TipoProfissional tipoProfissional;
	private int quantidadePatazGanho;
	private int quantidadePatazNecessario;
	
	public Servico(String tempoEstimado, String produtosUtilizados, TipoProfissional tipoProfissional,
			int quantidadePatazGanho, int quantidadePatazNecessario) {
		super();
		this.tempoEstimado = tempoEstimado;
		this.produtosUtilizados = produtosUtilizados;
		this.tipoProfissional = tipoProfissional;
		this.quantidadePatazGanho = quantidadePatazGanho;
		this.quantidadePatazNecessario = quantidadePatazNecessario;
	}
	
	public String getTempoEstimado() {
		return tempoEstimado;
	}
	public void setTempoEstimado(String tempoEstimado) {
		this.tempoEstimado = tempoEstimado;
	}
	public String getProdutosUtilizados() {
		return produtosUtilizados;
	}
	public void setProdutosUtilizados(String produtosUtilizados) {
		this.produtosUtilizados = produtosUtilizados;
	}
	public TipoProfissional getTipoProfissional() {
		return tipoProfissional;
	}
	public void setTipoProfissional(TipoProfissional tipoProfissional) {
		this.tipoProfissional = tipoProfissional;
	}
	public int getQuantidadePatazGanho() {
		return quantidadePatazGanho;
	}
	public void setQuantidadePatazGanho(int quantidadePatazGanho) {
		this.quantidadePatazGanho = quantidadePatazGanho;
	}
	public int getQuantidadePatazNecessario() {
		return quantidadePatazNecessario;
	}
	public void setQuantidadePatazNecessario(int quantidadePatazNecessario) {
		this.quantidadePatazNecessario = quantidadePatazNecessario;
	}
	
}
