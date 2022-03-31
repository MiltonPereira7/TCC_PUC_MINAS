package br.com.sistema.doggis.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente  extends Pessoa{
	
	private int totalPataz;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;
	
	@OneToMany(mappedBy = "cliente")
	private List<Pet> pets;

	public Cliente(int totalPataz, Endereco endereco, List<Pet> pets) {
		super();
		this.totalPataz = totalPataz;
		this.endereco = endereco;
		this.pets = pets;
	}

	public int getTotalPataz() {
		return totalPataz;
	}

	public void setTotalPataz(int totalPataz) {
		this.totalPataz = totalPataz;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	
}
