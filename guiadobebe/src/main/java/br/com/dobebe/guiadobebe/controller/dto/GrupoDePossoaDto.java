package br.com.dobebe.guiadobebe.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.dobebe.guiadobebe.model.CategoriaDePessoa;
import br.com.dobebe.guiadobebe.model.GrupoDePossoa;

public class GrupoDePossoaDto {

	private Long id;
	private Integer idadeMinima;
	private Integer idadeMaxima;
	private CategoriaDePessoa categoriaDePessoa;

	public GrupoDePossoaDto(GrupoDePossoa grupoDePossoa) {
		this.id = grupoDePossoa.getId();
		this.idadeMinima = grupoDePossoa.getIdadeMinima();
		this.idadeMaxima = grupoDePossoa.getIdadeMaxima();
		this.categoriaDePessoa = grupoDePossoa.getCategoriaDePessoa();
	}

	public Long getId() {
		return id;
	}

	public Integer getIdadeMinima() {
		return idadeMinima;
	}

	public Integer getIdadeMaxima() {
		return idadeMaxima;
	}

	public CategoriaDePessoa getCategoriaDePessoa() {
		return categoriaDePessoa;
	}

	public static List<GrupoDePossoaDto> converter(List<GrupoDePossoa> gruposDePessoas) {
		return gruposDePessoas.stream().map(GrupoDePossoaDto::new).collect(Collectors.toList());
	}

}
