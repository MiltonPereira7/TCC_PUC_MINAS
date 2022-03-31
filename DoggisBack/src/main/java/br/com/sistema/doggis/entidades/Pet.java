package br.com.sistema.doggis.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pet")
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=50)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "idTipo")
	private TipoPet tipo;
	@Column(length=25)
	private String raca;
	@Column(length=15)
	private String porte;
	@Column(length=150)
	private String alergias;
	@Column(length=250)
	private String obsercacoes;
	private Boolean autorizaFoto;
	
	@ManyToOne
	@JoinColumn(name = "clienteId")
	private Cliente cliente;

	public Pet(int id, String nome, TipoPet tipo, String raca, String porte, String alergias, String obsercacoes,
			Boolean autorizaFoto, Cliente cliente) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.porte = porte;
		this.alergias = alergias;
		this.obsercacoes = obsercacoes;
		this.autorizaFoto = autorizaFoto;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPet getTipo() {
		return tipo;
	}

	public void setTipo(TipoPet tipo) {
		this.tipo = tipo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getObsercacoes() {
		return obsercacoes;
	}

	public void setObsercacoes(String obsercacoes) {
		this.obsercacoes = obsercacoes;
	}

	public Boolean getAutorizaFoto() {
		return autorizaFoto;
	}

	public void setAutorizaFoto(Boolean autorizaFoto) {
		this.autorizaFoto = autorizaFoto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
