package com.marcoswinicios.jobs.entidades;

import java.util.List;

public class Vaga {
	private Long id;
	private String titulo;
	private boolean remoto;
	private boolean aceitaDeFora;
	private String descricao;
	private TipoContrato tipoContrato;
	private NivelExperiencia nivelExperiencia;
	private List<Skills> skills; 	
	private List<String> atividades;
	private List<String> requisitos;
	
	public Vaga() {}
	
	public Vaga(String titulo, boolean remoto, boolean aceitaDeFora, String descricao, TipoContrato tipoContrato,
			NivelExperiencia nivelExperiencia, List<Skills> skills, List<String> atividades, List<String> requisitos) {
		super();
		this.titulo = titulo;
		this.remoto = remoto;
		this.aceitaDeFora = aceitaDeFora;
		this.descricao = descricao;
		this.tipoContrato = tipoContrato;
		this.nivelExperiencia = nivelExperiencia;
		this.skills = skills;
		this.atividades = atividades;
		this.requisitos = requisitos;
	}

	public Vaga(Long id, String titulo, boolean remoto, boolean aceitaDeFora, String descricao,
			TipoContrato tipoContrato, NivelExperiencia nivelExperiencia, List<Skills> skills, List<String> atividades,
			List<String> requisitos) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.remoto = remoto;
		this.aceitaDeFora = aceitaDeFora;
		this.descricao = descricao;
		this.tipoContrato = tipoContrato;
		this.nivelExperiencia = nivelExperiencia;
		this.skills = skills;
		this.atividades = atividades;
		this.requisitos = requisitos;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isRemoto() {
		return remoto;
	}
	public void setRemoto(boolean remoto) {
		this.remoto = remoto;
	}
	public boolean isAceitaDeFora() {
		return aceitaDeFora;
	}
	public void setAceitaDeFora(boolean aceitaDeFora) {
		this.aceitaDeFora = aceitaDeFora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public NivelExperiencia getNivelExperiencia() {
		return nivelExperiencia;
	}
	public void setNivelExperiencia(NivelExperiencia nivelExperiencia) {
		this.nivelExperiencia = nivelExperiencia;
	}
	public List<Skills> getSkills() {
		return skills;
	}
	public List<String> getAtividades() {
		return atividades;
	}
	public List<String> getRequisitos() {
		return requisitos;
	}
}
