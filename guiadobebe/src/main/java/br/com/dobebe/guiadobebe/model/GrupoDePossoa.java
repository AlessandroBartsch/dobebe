package br.com.dobebe.guiadobebe.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GrupoDePossoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer idadeMinima;
	private Integer idadeMaxima;

	@Enumerated(EnumType.STRING)
	private CategoriaDePessoa categoriaDePessoa;

	public GrupoDePossoa() {
	}

	public GrupoDePossoa(Integer idadeMinima, Integer idadeMaxima, CategoriaDePessoa categoriaDePessoa) {
		this.idadeMinima = idadeMinima;
		this.idadeMaxima = idadeMaxima;
		this.categoriaDePessoa = categoriaDePessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

}
