package br.com.dobebe.guiadobebe.controller.form;

import java.util.ArrayList;
import java.util.List;

import br.com.dobebe.guiadobebe.model.CategoriaDePessoa;
import br.com.dobebe.guiadobebe.model.GrupoDePossoa;
import br.com.dobebe.guiadobebe.repository.GrupoDePessoasRepository;

public class GrupoDePessoaForm {

	private Integer idadeMinima;
	private Integer idadeMaxima;

	private CategoriaDePessoa categoriaDePessoa;

	public Integer getIdadeMinima() {
		return idadeMinima;
	}

	public void setIdadeMinima(Integer idadeMinima) {
		this.idadeMinima = idadeMinima;
	}

	public Integer getIdadeMaxima() {
		return idadeMaxima;
	}

	public void setIdadeMaxima(Integer idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}

	public CategoriaDePessoa getCategoriaDePessoa() {
		return categoriaDePessoa;
	}

	public void setCategoriaDePessoa(CategoriaDePessoa categoriaDePessoa) {
		this.categoriaDePessoa = categoriaDePessoa;
	}

	public static List<GrupoDePossoa> converter(List<GrupoDePessoaForm> gruposPessoas, GrupoDePessoasRepository grupoDePessoasRepository) {

		List<GrupoDePossoa> grupos = new ArrayList<GrupoDePossoa>();

		gruposPessoas.forEach(pessoa -> {
			GrupoDePossoa grupo = new GrupoDePossoa(pessoa.idadeMinima, pessoa.idadeMaxima, pessoa.categoriaDePessoa);
			grupoDePessoasRepository.save(grupo);
			grupos.add(grupo);
		});

		return grupos;
	}

}
