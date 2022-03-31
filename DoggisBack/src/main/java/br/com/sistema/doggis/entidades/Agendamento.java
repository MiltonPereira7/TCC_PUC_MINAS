package br.com.sistema.doggis.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.sistema.doggis.enumeradores.SituacaoAgendamento;

@Entity
@Table(name = "agendamento")
public class Agendamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date dataHoraInicio;
	private Date dataHoraFim;
	
	@Column(length=30)
	@Enumerated(EnumType.STRING)
	private SituacaoAgendamento situacaoAgendamento;
	
	@ManyToOne
	@JoinColumn(name = "servicoId")
	private Servico servico;
	
	@ManyToOne
	@JoinColumn(name = "atendenteId")
	private Usuario Atendente;
	
	@ManyToOne
	@JoinColumn(name = "clienteId")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "petId")
	private Pet pet;
	
	@ManyToOne
	@JoinColumn(name = "veterinarioId")
	private Veterinario veterinario;

	
	public Agendamento(int id, Date dataHorarioInicio, Date dataHoraFim, SituacaoAgendamento situacaoAgendamento,
			Servico servico, Usuario atendente, Cliente cliente, Pet pet, Veterinario veterinario) {
		super();
		this.id = id;
		this.dataHoraInicio = dataHorarioInicio;
		this.dataHoraFim = dataHoraFim;
		this.situacaoAgendamento = situacaoAgendamento;
		this.servico = servico;
		Atendente = atendente;
		this.cliente = cliente;
		this.pet = pet;
		this.veterinario = veterinario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDataHorarioInicio() {
		return dataHoraInicio;
	}


	public void setDataHorarioInicio(Date dataHorarioInicio) {
		this.dataHoraInicio = dataHorarioInicio;
	}


	public Date getDataHoraFim() {
		return dataHoraFim;
	}


	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}


	public SituacaoAgendamento getSituacaoAgendamento() {
		return situacaoAgendamento;
	}


	public void setSituacaoAgendamento(SituacaoAgendamento situacaoAgendamento) {
		this.situacaoAgendamento = situacaoAgendamento;
	}


	public Servico getServico() {
		return servico;
	}


	public void setServico(Servico servico) {
		this.servico = servico;
	}


	public Usuario getAtendente() {
		return Atendente;
	}


	public void setAtendente(Usuario atendente) {
		Atendente = atendente;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Pet getPet() {
		return pet;
	}


	public void setPet(Pet pet) {
		this.pet = pet;
	}


	public Veterinario getVeterinario() {
		return veterinario;
	}


	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	
	
}
