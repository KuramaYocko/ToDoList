package br.senai.sp.Modelo;

public class SubTarefa {
	private Long id;
	private String decricao;
	private boolean feita;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}

	public boolean isFeita() {
		return feita;
	}

	public void setFeita(boolean feita) {
		this.feita = feita;
	}

}
