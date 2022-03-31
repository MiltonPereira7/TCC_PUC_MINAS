package br.com.sistema.doggis.enumeradores;

public enum TipoProfissional {
	ATENDENTE("Atendente"),
	VETERINARIO("Veterinario");
	
	private String nomeComplemento;
	
	private TipoProfissional(String nomeComplemento){
		this.nomeComplemento = nomeComplemento;
	}
	
	public String getNomeComplemento() {
		return nomeComplemento;
	}
}
