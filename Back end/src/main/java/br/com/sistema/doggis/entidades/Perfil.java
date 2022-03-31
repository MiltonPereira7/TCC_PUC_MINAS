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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "perfil")
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=50)
	private String nome;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "PerfilModulo",
            joinColumns = @JoinColumn(name = "idModulo"),
            inverseJoinColumns = @JoinColumn(name = "idPerfil")
    )
	private List<Modulo> modulos;

	public Perfil(int id, String nome, List<Modulo> modulos) {
		super();
		this.id = id;
		this.nome = nome;
		this.modulos = modulos;
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

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	
}
