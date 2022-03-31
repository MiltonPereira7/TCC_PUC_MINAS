package br.com.sistema.doggis.enumeradores;

public enum SituacaoAgendamento {
	
	PENDENTE("Pendente"),
	REALIZADO("Realizado"),
	CANCELADO("Cancelado");
	
	private String nomeComplemento;
	
	private SituacaoAgendamento(String nomeComplemento){
		this.nomeComplemento = nomeComplemento;
	}
	
	public String getNomeComplemento() {
		return nomeComplemento;
	}
}
