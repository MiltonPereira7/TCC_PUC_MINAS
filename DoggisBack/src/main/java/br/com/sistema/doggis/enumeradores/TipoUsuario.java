package br.com.sistema.doggis.enumeradores;

public enum TipoUsuario {
	ATENDENTE("Atendente"),
	ADMINISTRADOR("ADMINISTRADOR");
	
	private String nomeComplemento;
	
	private TipoUsuario(String nomeComplemento){
		this.nomeComplemento = nomeComplemento;
	}
	
	public String getNomeComplemento() {
		return nomeComplemento;
	}
}
