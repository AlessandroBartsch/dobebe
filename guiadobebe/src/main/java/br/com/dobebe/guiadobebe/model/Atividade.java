package br.com.dobebe.guiadobebe.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Atividade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeAtividade;
	private String descricaoAtividade;
	private Boolean pago;

	private Float custoPorPessoa;
	private Float custoTotal;

	@OneToMany
	private List<GrupoDePossoa> gruposDePessoas;

	@OneToMany
	private List<DiasFuncionamento> diasFuncionamento;

	private Boolean ativo;

	public Atividade(Long id, String nomeAtividade, String descricaoAtividade, Boolean pago, Float custoPorPessoa,
			Float custoTotal, List<GrupoDePossoa> gruposDePessoas, List<DiasFuncionamento> diasFuncionamento,
			Boolean ativo) {
		this.id = id;
		this.nomeAtividade = nomeAtividade;
		this.descricaoAtividade = descricaoAtividade;
		this.pago = pago;
		this.custoPorPessoa = custoPorPessoa;
		this.custoTotal = custoTotal;
		this.gruposDePessoas = gruposDePessoas;
		this.diasFuncionamento = diasFuncionamento;
		this.ativo = ativo;
	}

	public Atividade(String nomeAtividade, String descricaoAtividade, Boolean pago, Float custoPorPessoa,
			Float custoTotal, Boolean ativo, List<GrupoDePossoa> grupoPessoa) {
		this.nomeAtividade = nomeAtividade;
		this.descricaoAtividade = descricaoAtividade;
		this.pago = pago;
		this.custoPorPessoa = custoPorPessoa;
		this.custoTotal = custoTotal;
		this.ativo = ativo;
		this.gruposDePessoas = grupoPessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public List<GrupoDePossoa> getGruposDePessoas() {
		return gruposDePessoas;
	}

	public void setGruposDePessoas(List<GrupoDePossoa> gruposDePessoas) {
		this.gruposDePessoas = gruposDePessoas;
	}

	public List<DiasFuncionamento> getDiasFuncionamento() {
		return diasFuncionamento;
	}

	public void setDiasFuncionamento(List<DiasFuncionamento> diasFuncionamento) {
		this.diasFuncionamento = diasFuncionamento;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
