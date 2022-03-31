package br.com.sistema.doggis.entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=50)
	private String nome;
	
	@Column(length=12)
	private String identidade;
	
	@Column(length=11)
	private String CPF;
	
	@Column(length=50)
	private String email;
	
}
