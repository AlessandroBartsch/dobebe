package br.com.dobebe.guiadobebe.controller.form;

import java.util.List;

import br.com.dobebe.guiadobebe.model.Atividade;
import br.com.dobebe.guiadobebe.repository.GrupoDePessoasRepository;

public class AtividadeForm {

	private String nomeAtividade;
	private String descricaoAtividade;
	private Boolean pago;

	private Float custoPorPessoa;
	private Float custoTotal;

	private List<GrupoDePessoaForm> gruposPessoas;

	private Boolean ativo;

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}

	public String getDescricaoAtividade() {
		return descricaoAtividade;
	}

	public void setDescricaoAtividade(String descricaoAtividade) {
		this.descricaoAtividade = descricaoAtividade;
	}

	public Boolean getPago() {
		return pago;
	}

	public void setPago(Boolean pago) {
		this.pago = pago;
	}

	public Float getCustoPorPessoa() {
		return custoPorPessoa;
	}

	public void setCustoPorPessoa(Float custoPorPessoa) {
		this.custoPorPessoa = custoPorPessoa;
	}

	public Float getCustoTotal() {
		return custoTotal;
	}

	public void setCustoTotal(Float custoTotal) {
		this.custoTotal = custoTotal;
	}

	public List<GrupoDePessoaForm> getGruposPessoas() {
		return gruposPessoas;
	}

	public void setGruposPessoas(List<GrupoDePessoaForm> gruposPessoas) {
		this.gruposPessoas = gruposPessoas;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Atividade converter(GrupoDePessoasRepository grupoDePessoasRepository) {
		return new Atividade(nomeAtividade, descricaoAtividade, pago, custoPorPessoa, custoTotal, ativo, GrupoDePessoaForm.converter(gruposPessoas, grupoDePessoasRepository));
	}

}
