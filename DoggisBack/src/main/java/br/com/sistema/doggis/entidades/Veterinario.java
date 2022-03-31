package br.com.sistema.doggis.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "veterinario")
public class Veterinario extends Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=25)
	private String registroRC;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "VeterinarioPets",
            joinColumns = @JoinColumn(name = "idVeterinario"),
            inverseJoinColumns = @JoinColumn(name = "idTrataTipoPet")
    )
	private List<TipoPet> trataTipoPet;

	public Veterinario(int id, String registroRC, List<TipoPet> trataTipoPet) {
		super();
		this.id = id;
		this.registroRC = registroRC;
		this.trataTipoPet = trataTipoPet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegistroRC() {
		return registroRC;
	}

	public void setRegistroRC(String registroRC) {
		this.registroRC = registroRC;
	}

	public List<TipoPet> getTrataTipoPet() {
		return trataTipoPet;
	}

	public void setTrataTipoPet(List<TipoPet> trataTipoPet) {
		this.trataTipoPet = trataTipoPet;
	}

}
