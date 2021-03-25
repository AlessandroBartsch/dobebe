package br.com.dobebe.guiadobebe.model;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DiasFuncionamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Boolean mesmoHorarioDoLocal;

	@Enumerated(EnumType.STRING)
	private DiaDaSemana diaDaSemana;

	private LocalTime horarioAbertura;
	private LocalTime horarioInicioIntervalo;
	private LocalTime horarioFinalIntervalo;
	private LocalTime horarioFechamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getMesmoHorarioDoLocal() {
		return mesmoHorarioDoLocal;
	}

	public void setMesmoHorarioDoLocal(Boolean mesmoHorarioDoLocal) {
		this.mesmoHorarioDoLocal = mesmoHorarioDoLocal;
	}

	public DiaDaSemana getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public LocalTime getHorarioAbertura() {
		return horarioAbertura;
	}

	public void setHorarioAbertura(LocalTime horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}

	public LocalTime getHorarioInicioIntervalo() {
		return horarioInicioIntervalo;
	}

	public void setHorarioInicioIntervalo(LocalTime horarioInicioIntervalo) {
		this.horarioInicioIntervalo = horarioInicioIntervalo;
	}

	public LocalTime getHorarioFinalIntervalo() {
		return horarioFinalIntervalo;
	}

	public void setHorarioFinalIntervalo(LocalTime horarioFinalIntervalo) {
		this.horarioFinalIntervalo = horarioFinalIntervalo;
	}

	public LocalTime getHorarioFechamento() {
		return horarioFechamento;
	}

	public void setHorarioFechamento(LocalTime horarioFechamento) {
		this.horarioFechamento = horarioFechamento;
	}

}
