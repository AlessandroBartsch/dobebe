package br.com.dobebe.guiadobebe.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.dobebe.guiadobebe.model.Atividade;

public class AtividadeDto {

	private Long id;
	private Boolean ativo;
	private Boolean pago;
	private String nomeAtividade;
	private String descricaoAtividade;
	private Float custoPorPessoa;
	private Float custoTotal;
	private List<GrupoDePossoaDto> grupoDePessoaDto;

	public AtividadeDto(Atividade atividade) {
		this.id = atividade.getId();
		this.ativo = atividade.getAtivo();
		this.nomeAtividade = atividade.getNomeAtividade();
		this.descricaoAtividade = atividade.getDescricaoAtividade();
		this.pago = atividade.getPago();
		this.custoPorPessoa = atividade.getCustoPorPessoa();
		this.custoTotal = atividade.getCustoTotal();
		this.grupoDePessoaDto = GrupoDePossoaDto.converter(atividade.getGruposDePessoas());
	}

	public Long getId() {
		return id;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public Boolean getPago() {
		return pago;
	}

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public String getDescricaoAtividade() {
		return descricaoAtividade;
	}

	public Float getCustoPorPessoa() {
		return custoPorPessoa;
	}

	public Float getCustoTotal() {
		return custoTotal;
	}

	public List<GrupoDePossoaDto> getGrupoDePessoaDto() {
		return grupoDePessoaDto;
	}

	public static List<AtividadeDto> converter(List<Atividade> atividades) {
		return atividades.stream().map(AtividadeDto::new).collect(Collectors.toList());
	}

}
