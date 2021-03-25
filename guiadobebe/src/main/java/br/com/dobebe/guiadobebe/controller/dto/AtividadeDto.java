package br.com.dobebe.guiadobebe.controller.dto;

public class AtividadeDto {

	private Long id;
	private Boolean ativo;
	private String nomeAtividade;
	private String descricaoAtividade;
	private Boolean pago;
	private Float custoPorPessoa;
	private Float custoTotal;

	public Long getId() {
		return id;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public String getDescricaoAtividade() {
		return descricaoAtividade;
	}

	public Boolean getPago() {
		return pago;
	}

	public Float getCustoPorPessoa() {
		return custoPorPessoa;
	}

	public Float getCustoTotal() {
		return custoTotal;
	}

}
